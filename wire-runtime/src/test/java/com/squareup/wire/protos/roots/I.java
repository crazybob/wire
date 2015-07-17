// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/roots.proto at 69:1
package com.squareup.wire.protos.roots;

import com.squareup.wire.ExtendableMessage;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.TypeAdapter;
import java.io.IOException;
import java.lang.Integer;
import java.lang.Override;

public final class I extends ExtendableMessage<I> {
  private static final long serialVersionUID = 0L;

  public static final TypeAdapter<I> ADAPTER = new TypeAdapter.MessageAdapter<I>() {
    @Override
    public I read(ProtoReader reader) throws IOException {
      return I.read(reader);
    }
  };

  public static final Integer DEFAULT_I = 0;

  public final Integer i;

  public I(Integer i) {
    super("I");
    this.i = i;
  }

  private I(Builder builder) {
    this(builder.i);
    setBuilder(builder);
  }

  @Override
  protected void visitFields(Message.Visitor visitor) {
    visitor.value(1, "i", i, TypeAdapter.INT32, false);
    visitor.extensions(this);
    visitor.unknowns(this);
  }

  public static I read(ProtoReader reader) throws IOException {
    Builder builder = new Builder();
    while (reader.hasNext()) {
      int tag = reader.nextTag();
      switch (tag) {
        case 1: builder.i = reader.value(TypeAdapter.INT32); break;
        default: builder.readExtensionOrUnknown(tag, reader); break;
      }
    }
    return builder.build();
  }

  public static final class Builder extends ExtendableMessage.ExtendableBuilder<I, Builder> {
    public Integer i;

    public Builder() {
      super(I.class, Builder.class);
    }

    public Builder(I message) {
      super(I.class, Builder.class, message);
      if (message == null) return;
      this.i = message.i;
    }

    public Builder i(Integer i) {
      this.i = i;
      return this;
    }

    @Override
    public I build() {
      return new I(this);
    }
  }
}
