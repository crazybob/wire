// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/redacted_test.proto at 48:1
package com.squareup.wire.protos.redacted;

import com.google.protobuf.FieldOptions;
import com.squareup.wire.Message;
import com.squareup.wire.WireField;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.List;

public final class RedactedRepeated extends Message<RedactedRepeated> {
  private static final long serialVersionUID = 0L;

  public static final FieldOptions FIELD_OPTIONS_A = new FieldOptions.Builder()
      .setExtension(Ext_redacted_test.redacted, true)
      .build();

  @WireField(
      tag = 1,
      type = "string",
      label = Message.Label.REPEATED,
      redacted = true
  )
  public final List<String> a;

  public RedactedRepeated(List<String> a) {
    this.a = immutableCopyOf(a);
  }

  private RedactedRepeated(Builder builder) {
    this(builder.a);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof RedactedRepeated)) return false;
    return equals(a, ((RedactedRepeated) other).a);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    return result != 0 ? result : (hashCode = a != null ? a.hashCode() : 1);
  }

  public static final class Builder extends com.squareup.wire.Message.Builder<RedactedRepeated, Builder> {
    public List<String> a = Collections.emptyList();

    public Builder() {
    }

    public Builder(RedactedRepeated message) {
      super(message);
      if (message == null) return;
      this.a = copyOf(message.a);
    }

    public Builder a(List<String> a) {
      this.a = canonicalizeList(a);
      return this;
    }

    @Override
    public RedactedRepeated build() {
      return new RedactedRepeated(this);
    }
  }
}
