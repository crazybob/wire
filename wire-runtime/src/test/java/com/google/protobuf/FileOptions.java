// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/google/protobuf/descriptor.proto at 236:1
package com.google.protobuf;

import com.squareup.wire.Message;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.List;

/**
 * ===================================================================
 * Options
 * Each of the definitions above may have "options" attached.  These are
 * just annotations which may cause code to be generated slightly differently
 * or may contain hints for code that manipulates protocol messages.
 *
 * Clients may define custom options as extensions of the *Options messages.
 * These extensions may not yet be known at parsing time, so the parser cannot
 * store the values in them.  Instead it stores them in a field in the *Options
 * message called uninterpreted_option. This field must have the same name
 * across all *Options messages. We then use this field to populate the
 * extensions when we build a descriptor, at which point all protos have been
 * parsed and so all extensions are known.
 *
 * Extension numbers for custom options may be chosen as follows:
 * * For options which will only be used within a single application or
 *   organization, or for experimental options, use field numbers 50000
 *   through 99999.  It is up to you to ensure that you do not use the
 *   same number for multiple options.
 * * For options which will be published and used publicly by multiple
 *   independent entities, e-mail kenton@google.com to reserve extension
 *   numbers.  Simply tell me how many you need and I'll send you back a
 *   set of numbers to use -- there's no need to explain how you intend to
 *   use them.  If this turns out to be popular, a web service will be set up
 *   to automatically assign option numbers.
 */
public final class FileOptions extends Message<FileOptions> {
  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_JAVA_PACKAGE = "";

  public static final String DEFAULT_JAVA_OUTER_CLASSNAME = "";

  public static final Boolean DEFAULT_JAVA_MULTIPLE_FILES = false;

  public static final Boolean DEFAULT_JAVA_GENERATE_EQUALS_AND_HASH = false;

  public static final OptimizeMode DEFAULT_OPTIMIZE_FOR = OptimizeMode.SPEED;

  public static final Boolean DEFAULT_CC_GENERIC_SERVICES = false;

  public static final Boolean DEFAULT_JAVA_GENERIC_SERVICES = false;

  public static final Boolean DEFAULT_PY_GENERIC_SERVICES = false;

  /**
   * Sets the Java package where classes generated from this .proto will be
   * placed.  By default, the proto package is used, but this is often
   * inappropriate because proto packages do not normally start with backwards
   * domain names.
   */
  @WireField(
      tag = 1,
      type = "string"
  )
  public final String java_package;

  /**
   * If set, all the classes from the .proto file are wrapped in a single
   * outer class with the given name.  This applies to both Proto1
   * (equivalent to the old "--one_java_file" option) and Proto2 (where
   * a .proto always translates to a single class, but you may want to
   * explicitly choose the class name).
   */
  @WireField(
      tag = 8,
      type = "string"
  )
  public final String java_outer_classname;

  /**
   * If set true, then the Java code generator will generate a separate .java
   * file for each top-level message, enum, and service defined in the .proto
   * file.  Thus, these types will *not* be nested inside the outer class
   * named by java_outer_classname.  However, the outer class will still be
   * generated to contain the file's getDescriptor() method as well as any
   * top-level extensions defined in the file.
   */
  @WireField(
      tag = 10,
      type = "bool"
  )
  public final Boolean java_multiple_files;

  /**
   * If set true, then the Java code generator will generate equals() and
   * hashCode() methods for all messages defined in the .proto file. This is
   * purely a speed optimization, as the AbstractMessage base class includes
   * reflection-based implementations of these methods.
   */
  @WireField(
      tag = 20,
      type = "bool"
  )
  public final Boolean java_generate_equals_and_hash;

  @WireField(
      tag = 9,
      type = "google.protobuf.FileOptions.OptimizeMode"
  )
  public final OptimizeMode optimize_for;

  /**
   * Should generic services be generated in each language?  "Generic" services
   * are not specific to any particular RPC system.  They are generated by the
   * main code generators in each language (without additional plugins).
   * Generic services were the only kind of service generation supported by
   * early versions of proto2.
   *
   * Generic services are now considered deprecated in favor of using plugins
   * that generate code specific to your particular RPC system.  Therefore,
   * these default to false.  Old code which depends on generic services should
   * explicitly set them to true.
   */
  @WireField(
      tag = 16,
      type = "bool"
  )
  public final Boolean cc_generic_services;

  @WireField(
      tag = 17,
      type = "bool"
  )
  public final Boolean java_generic_services;

  @WireField(
      tag = 18,
      type = "bool"
  )
  public final Boolean py_generic_services;

  /**
   * The parser stores options it doesn't recognize here. See above.
   */
  @WireField(
      tag = 999,
      type = "google.protobuf.UninterpretedOption",
      label = Message.Label.REPEATED
  )
  public final List<UninterpretedOption> uninterpreted_option;

  public FileOptions(String java_package, String java_outer_classname, Boolean java_multiple_files, Boolean java_generate_equals_and_hash, OptimizeMode optimize_for, Boolean cc_generic_services, Boolean java_generic_services, Boolean py_generic_services, List<UninterpretedOption> uninterpreted_option) {
    this.java_package = java_package;
    this.java_outer_classname = java_outer_classname;
    this.java_multiple_files = java_multiple_files;
    this.java_generate_equals_and_hash = java_generate_equals_and_hash;
    this.optimize_for = optimize_for;
    this.cc_generic_services = cc_generic_services;
    this.java_generic_services = java_generic_services;
    this.py_generic_services = py_generic_services;
    this.uninterpreted_option = immutableCopyOf(uninterpreted_option);
  }

  private FileOptions(Builder builder) {
    this(builder.java_package, builder.java_outer_classname, builder.java_multiple_files, builder.java_generate_equals_and_hash, builder.optimize_for, builder.cc_generic_services, builder.java_generic_services, builder.py_generic_services, builder.uninterpreted_option);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof FileOptions)) return false;
    FileOptions o = (FileOptions) other;
    if (!extensionsEqual(o)) return false;
    return equals(java_package, o.java_package)
        && equals(java_outer_classname, o.java_outer_classname)
        && equals(java_multiple_files, o.java_multiple_files)
        && equals(java_generate_equals_and_hash, o.java_generate_equals_and_hash)
        && equals(optimize_for, o.optimize_for)
        && equals(cc_generic_services, o.cc_generic_services)
        && equals(java_generic_services, o.java_generic_services)
        && equals(py_generic_services, o.py_generic_services)
        && equals(uninterpreted_option, o.uninterpreted_option);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = extensionsHashCode();
      result = result * 37 + (java_package != null ? java_package.hashCode() : 0);
      result = result * 37 + (java_outer_classname != null ? java_outer_classname.hashCode() : 0);
      result = result * 37 + (java_multiple_files != null ? java_multiple_files.hashCode() : 0);
      result = result * 37 + (java_generate_equals_and_hash != null ? java_generate_equals_and_hash.hashCode() : 0);
      result = result * 37 + (optimize_for != null ? optimize_for.hashCode() : 0);
      result = result * 37 + (cc_generic_services != null ? cc_generic_services.hashCode() : 0);
      result = result * 37 + (java_generic_services != null ? java_generic_services.hashCode() : 0);
      result = result * 37 + (py_generic_services != null ? py_generic_services.hashCode() : 0);
      result = result * 37 + (uninterpreted_option != null ? uninterpreted_option.hashCode() : 1);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends com.squareup.wire.Message.Builder<FileOptions, Builder> {
    public String java_package;

    public String java_outer_classname;

    public Boolean java_multiple_files;

    public Boolean java_generate_equals_and_hash;

    public OptimizeMode optimize_for;

    public Boolean cc_generic_services;

    public Boolean java_generic_services;

    public Boolean py_generic_services;

    public List<UninterpretedOption> uninterpreted_option = Collections.emptyList();

    public Builder() {
    }

    public Builder(FileOptions message) {
      super(message);
      if (message == null) return;
      this.java_package = message.java_package;
      this.java_outer_classname = message.java_outer_classname;
      this.java_multiple_files = message.java_multiple_files;
      this.java_generate_equals_and_hash = message.java_generate_equals_and_hash;
      this.optimize_for = message.optimize_for;
      this.cc_generic_services = message.cc_generic_services;
      this.java_generic_services = message.java_generic_services;
      this.py_generic_services = message.py_generic_services;
      this.uninterpreted_option = copyOf(message.uninterpreted_option);
    }

    /**
     * Sets the Java package where classes generated from this .proto will be
     * placed.  By default, the proto package is used, but this is often
     * inappropriate because proto packages do not normally start with backwards
     * domain names.
     */
    public Builder java_package(String java_package) {
      this.java_package = java_package;
      return this;
    }

    /**
     * If set, all the classes from the .proto file are wrapped in a single
     * outer class with the given name.  This applies to both Proto1
     * (equivalent to the old "--one_java_file" option) and Proto2 (where
     * a .proto always translates to a single class, but you may want to
     * explicitly choose the class name).
     */
    public Builder java_outer_classname(String java_outer_classname) {
      this.java_outer_classname = java_outer_classname;
      return this;
    }

    /**
     * If set true, then the Java code generator will generate a separate .java
     * file for each top-level message, enum, and service defined in the .proto
     * file.  Thus, these types will *not* be nested inside the outer class
     * named by java_outer_classname.  However, the outer class will still be
     * generated to contain the file's getDescriptor() method as well as any
     * top-level extensions defined in the file.
     */
    public Builder java_multiple_files(Boolean java_multiple_files) {
      this.java_multiple_files = java_multiple_files;
      return this;
    }

    /**
     * If set true, then the Java code generator will generate equals() and
     * hashCode() methods for all messages defined in the .proto file. This is
     * purely a speed optimization, as the AbstractMessage base class includes
     * reflection-based implementations of these methods.
     */
    public Builder java_generate_equals_and_hash(Boolean java_generate_equals_and_hash) {
      this.java_generate_equals_and_hash = java_generate_equals_and_hash;
      return this;
    }

    public Builder optimize_for(OptimizeMode optimize_for) {
      this.optimize_for = optimize_for;
      return this;
    }

    /**
     * Should generic services be generated in each language?  "Generic" services
     * are not specific to any particular RPC system.  They are generated by the
     * main code generators in each language (without additional plugins).
     * Generic services were the only kind of service generation supported by
     * early versions of proto2.
     *
     * Generic services are now considered deprecated in favor of using plugins
     * that generate code specific to your particular RPC system.  Therefore,
     * these default to false.  Old code which depends on generic services should
     * explicitly set them to true.
     */
    public Builder cc_generic_services(Boolean cc_generic_services) {
      this.cc_generic_services = cc_generic_services;
      return this;
    }

    public Builder java_generic_services(Boolean java_generic_services) {
      this.java_generic_services = java_generic_services;
      return this;
    }

    public Builder py_generic_services(Boolean py_generic_services) {
      this.py_generic_services = py_generic_services;
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
    public FileOptions build() {
      return new FileOptions(this);
    }
  }

  /**
   * Generated classes can be optimized for speed or code size.
   */
  public enum OptimizeMode implements WireEnum {
    /**
     * Generate complete code for parsing, serialization,
     */
    SPEED(1),

    /**
     * etc.
     * Use ReflectionOps to implement these methods.
     */
    CODE_SIZE(2),

    /**
     * Generate code using MessageLite and the lite runtime.
     */
    LITE_RUNTIME(3);

    private final int value;

    OptimizeMode(int value) {
      this.value = value;
    }

    @Override
    public int getValue() {
      return value;
    }
  }
}
