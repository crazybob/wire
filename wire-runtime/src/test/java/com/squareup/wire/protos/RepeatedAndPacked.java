// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/repeated_and_packed.proto at 20:1
package com.squareup.wire.protos;

import com.squareup.wire.Message;
import com.squareup.wire.WireField;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.util.Collections;
import java.util.List;

public final class RepeatedAndPacked extends Message<RepeatedAndPacked> {
  private static final long serialVersionUID = 0L;

  @WireField(
      tag = 201,
      type = "int32",
      label = Message.Label.REPEATED
  )
  public final List<Integer> rep_int32;

  @WireField(
      tag = 301,
      type = "int32",
      label = Message.Label.PACKED
  )
  public final List<Integer> pack_int32;

  public RepeatedAndPacked(List<Integer> rep_int32, List<Integer> pack_int32) {
    this.rep_int32 = immutableCopyOf(rep_int32);
    this.pack_int32 = immutableCopyOf(pack_int32);
  }

  private RepeatedAndPacked(Builder builder) {
    this(builder.rep_int32, builder.pack_int32);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof RepeatedAndPacked)) return false;
    RepeatedAndPacked o = (RepeatedAndPacked) other;
    return equals(rep_int32, o.rep_int32)
        && equals(pack_int32, o.pack_int32);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = rep_int32 != null ? rep_int32.hashCode() : 1;
      result = result * 37 + (pack_int32 != null ? pack_int32.hashCode() : 1);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends com.squareup.wire.Message.Builder<RepeatedAndPacked, Builder> {
    public List<Integer> rep_int32 = Collections.emptyList();

    public List<Integer> pack_int32 = Collections.emptyList();

    public Builder() {
    }

    public Builder(RepeatedAndPacked message) {
      super(message);
      if (message == null) return;
      this.rep_int32 = copyOf(message.rep_int32);
      this.pack_int32 = copyOf(message.pack_int32);
    }

    public Builder rep_int32(List<Integer> rep_int32) {
      this.rep_int32 = canonicalizeList(rep_int32);
      return this;
    }

    public Builder pack_int32(List<Integer> pack_int32) {
      this.pack_int32 = canonicalizeList(pack_int32);
      return this;
    }

    @Override
    public RepeatedAndPacked build() {
      return new RepeatedAndPacked(this);
    }
  }
}
