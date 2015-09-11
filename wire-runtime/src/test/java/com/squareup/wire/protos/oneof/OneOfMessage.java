// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/one_of.proto at 20:1
package com.squareup.wire.protos.oneof;

import com.squareup.wire.Message;
import com.squareup.wire.WireField;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public final class OneOfMessage extends Message<OneOfMessage> {
  private static final long serialVersionUID = 0L;

  public static final Integer DEFAULT_FOO = 0;

  public static final String DEFAULT_BAR = "";

  /**
   * What foo.
   */
  @WireField(
      tag = 1,
      type = "int32"
  )
  public final Integer foo;

  /**
   * Such bar.
   */
  @WireField(
      tag = 3,
      type = "string"
  )
  public final String bar;

  public OneOfMessage(Integer foo, String bar) {
    this.foo = foo;
    this.bar = bar;
  }

  private OneOfMessage(Builder builder) {
    this(builder.foo, builder.bar);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof OneOfMessage)) return false;
    OneOfMessage o = (OneOfMessage) other;
    return equals(foo, o.foo)
        && equals(bar, o.bar);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = foo != null ? foo.hashCode() : 0;
      result = result * 37 + (bar != null ? bar.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends com.squareup.wire.Message.Builder<OneOfMessage, Builder> {
    public Integer foo;

    public String bar;

    public Builder() {
    }

    public Builder(OneOfMessage message) {
      super(message);
      if (message == null) return;
      this.foo = message.foo;
      this.bar = message.bar;
    }

    /**
     * What foo.
     */
    public Builder foo(Integer foo) {
      this.foo = foo;
      this.bar = null;
      return this;
    }

    /**
     * Such bar.
     */
    public Builder bar(String bar) {
      this.bar = bar;
      this.foo = null;
      return this;
    }

    @Override
    public OneOfMessage build() {
      return new OneOfMessage(this);
    }
  }
}
