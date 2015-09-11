// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/roots.proto at 47:1
package com.squareup.wire.protos.roots;

import com.squareup.wire.Message;
import com.squareup.wire.WireField;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;

public final class D extends Message<D> {
  private static final long serialVersionUID = 0L;

  public static final Integer DEFAULT_I = 0;

  @WireField(
      tag = 1,
      type = "int32"
  )
  public final Integer i;

  public D(Integer i) {
    this.i = i;
  }

  private D(Builder builder) {
    this(builder.i);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof D)) return false;
    return equals(i, ((D) other).i);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    return result != 0 ? result : (hashCode = i != null ? i.hashCode() : 0);
  }

  public static final class Builder extends com.squareup.wire.Message.Builder<D, Builder> {
    public Integer i;

    public Builder() {
    }

    public Builder(D message) {
      super(message);
      if (message == null) return;
      this.i = message.i;
    }

    public Builder i(Integer i) {
      this.i = i;
      return this;
    }

    @Override
    public D build() {
      return new D(this);
    }
  }
}
