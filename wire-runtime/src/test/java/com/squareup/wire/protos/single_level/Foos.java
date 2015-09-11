// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/single_level.proto at 24:1
package com.squareup.wire.protos.single_level;

import com.squareup.wire.Message;
import com.squareup.wire.WireField;
import java.lang.Object;
import java.lang.Override;
import java.util.Collections;
import java.util.List;

public final class Foos extends Message<Foos> {
  private static final long serialVersionUID = 0L;

  @WireField(
      tag = 1,
      type = "single_level.Foo",
      label = Message.Label.REPEATED
  )
  public final List<Foo> foos;

  public Foos(List<Foo> foos) {
    this.foos = immutableCopyOf(foos);
  }

  private Foos(Builder builder) {
    this(builder.foos);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof Foos)) return false;
    return equals(foos, ((Foos) other).foos);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    return result != 0 ? result : (hashCode = foos != null ? foos.hashCode() : 1);
  }

  public static final class Builder extends com.squareup.wire.Message.Builder<Foos, Builder> {
    public List<Foo> foos = Collections.emptyList();

    public Builder() {
    }

    public Builder(Foos message) {
      super(message);
      if (message == null) return;
      this.foos = copyOf(message.foos);
    }

    public Builder foos(List<Foo> foos) {
      this.foos = canonicalizeList(foos);
      return this;
    }

    @Override
    public Foos build() {
      return new Foos(this);
    }
  }
}
