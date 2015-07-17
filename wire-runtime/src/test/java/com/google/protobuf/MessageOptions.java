// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/google/protobuf/descriptor.proto at 299:1
package com.google.protobuf;

import com.squareup.wire.ExtendableMessage;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.TypeAdapter;
import java.io.IOException;
import java.lang.Boolean;
import java.lang.Override;
import java.util.Collections;
import java.util.List;

public final class MessageOptions extends ExtendableMessage<MessageOptions> {
  private static final long serialVersionUID = 0L;

  public static final TypeAdapter<MessageOptions> ADAPTER = new TypeAdapter.MessageAdapter<MessageOptions>() {
    @Override
    public MessageOptions read(ProtoReader reader) throws IOException {
      return MessageOptions.read(reader);
    }
  };

  public static final Boolean DEFAULT_MESSAGE_SET_WIRE_FORMAT = false;

  public static final Boolean DEFAULT_NO_STANDARD_DESCRIPTOR_ACCESSOR = false;

  /**
   * Set true to use the old proto1 MessageSet wire format for extensions.
   * This is provided for backwards-compatibility with the MessageSet wire
   * format.  You should not use this for any other reason:  It's less
   * efficient, has fewer features, and is more complicated.
   *
   * The message must be defined exactly as follows:
   *   message Foo {
   *     option message_set_wire_format = true;
   *     extensions 4 to max;
   *   }
   * Note that the message cannot have any defined fields; MessageSets only
   * have extensions.
   *
   * All extensions of your type must be singular messages; e.g. they cannot
   * be int32s, enums, or repeated messages.
   *
   * Because this is an option, the above two restrictions are not enforced by
   * the protocol compiler.
   */
  public final Boolean message_set_wire_format;

  /**
   * Disables the generation of the standard "descriptor()" accessor, which can
   * conflict with a field of the same name.  This is meant to make migration
   * from proto1 easier; new code should avoid fields named "descriptor".
   */
  public final Boolean no_standard_descriptor_accessor;

  /**
   * The parser stores options it doesn't recognize here. See above.
   */
  public final List<UninterpretedOption> uninterpreted_option;

  public MessageOptions(Boolean message_set_wire_format, Boolean no_standard_descriptor_accessor, List<UninterpretedOption> uninterpreted_option) {
    super("MessageOptions");
    this.message_set_wire_format = message_set_wire_format;
    this.no_standard_descriptor_accessor = no_standard_descriptor_accessor;
    this.uninterpreted_option = immutableCopyOf(uninterpreted_option);
  }

  private MessageOptions(Builder builder) {
    this(builder.message_set_wire_format, builder.no_standard_descriptor_accessor, builder.uninterpreted_option);
    setBuilder(builder);
  }

  @Override
  protected void visitFields(Message.Visitor visitor) {
    visitor.value(1, "message_set_wire_format", message_set_wire_format, TypeAdapter.BOOL, false);
    visitor.value(2, "no_standard_descriptor_accessor", no_standard_descriptor_accessor, TypeAdapter.BOOL, false);
    visitor.repeated(999, "uninterpreted_option", uninterpreted_option, UninterpretedOption.ADAPTER, false);
    visitor.extensions(this);
    visitor.unknowns(this);
  }

  public static MessageOptions read(ProtoReader reader) throws IOException {
    Builder builder = new Builder();
    while (reader.hasNext()) {
      int tag = reader.nextTag();
      switch (tag) {
        case 1: builder.message_set_wire_format = reader.value(TypeAdapter.BOOL); break;
        case 2: builder.no_standard_descriptor_accessor = reader.value(TypeAdapter.BOOL); break;
        case 999: builder.uninterpreted_option = repeatedMessage(builder.uninterpreted_option, reader, UninterpretedOption.ADAPTER); break;
        default: builder.readExtensionOrUnknown(tag, reader); break;
      }
    }
    return builder.build();
  }

  public static final class Builder extends ExtendableMessage.ExtendableBuilder<MessageOptions, Builder> {
    public Boolean message_set_wire_format;

    public Boolean no_standard_descriptor_accessor;

    public List<UninterpretedOption> uninterpreted_option = Collections.emptyList();

    public Builder() {
      super(MessageOptions.class, Builder.class);
    }

    public Builder(MessageOptions message) {
      super(MessageOptions.class, Builder.class, message);
      if (message == null) return;
      this.message_set_wire_format = message.message_set_wire_format;
      this.no_standard_descriptor_accessor = message.no_standard_descriptor_accessor;
      this.uninterpreted_option = copyOf(message.uninterpreted_option);
    }

    /**
     * Set true to use the old proto1 MessageSet wire format for extensions.
     * This is provided for backwards-compatibility with the MessageSet wire
     * format.  You should not use this for any other reason:  It's less
     * efficient, has fewer features, and is more complicated.
     *
     * The message must be defined exactly as follows:
     *   message Foo {
     *     option message_set_wire_format = true;
     *     extensions 4 to max;
     *   }
     * Note that the message cannot have any defined fields; MessageSets only
     * have extensions.
     *
     * All extensions of your type must be singular messages; e.g. they cannot
     * be int32s, enums, or repeated messages.
     *
     * Because this is an option, the above two restrictions are not enforced by
     * the protocol compiler.
     */
    public Builder message_set_wire_format(Boolean message_set_wire_format) {
      this.message_set_wire_format = message_set_wire_format;
      return this;
    }

    /**
     * Disables the generation of the standard "descriptor()" accessor, which can
     * conflict with a field of the same name.  This is meant to make migration
     * from proto1 easier; new code should avoid fields named "descriptor".
     */
    public Builder no_standard_descriptor_accessor(Boolean no_standard_descriptor_accessor) {
      this.no_standard_descriptor_accessor = no_standard_descriptor_accessor;
      return this;
    }

    /**
     * The parser stores options it doesn't recognize here. See above.
     */
    public Builder uninterpreted_option(List<UninterpretedOption> uninterpreted_option) {
      this.uninterpreted_option = canonicalizeList(uninterpreted_option);
      return this;
    }

    @Override
    public MessageOptions build() {
      return new MessageOptions(this);
    }
  }
}
