// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LNCJHILJOBA.proto

package emu.grasscutter.net.proto;

public final class LNCJHILJOBAOuterClass {
  private LNCJHILJOBAOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code LNCJHILJOBA}
   */
  public enum LNCJHILJOBA
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>LNCJHILJOBA_ReunionReportTypeNone = 0;</code>
     */
    LNCJHILJOBA_ReunionReportTypeNone(0),
    /**
     * <code>LNCJHILJOBA_ReunionReportTypeStart = 1;</code>
     */
    LNCJHILJOBA_ReunionReportTypeStart(1),
    /**
     * <code>LNCJHILJOBA_ReunionReportTypeDouble = 2;</code>
     */
    LNCJHILJOBA_ReunionReportTypeDouble(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>LNCJHILJOBA_ReunionReportTypeNone = 0;</code>
     */
    public static final int LNCJHILJOBA_ReunionReportTypeNone_VALUE = 0;
    /**
     * <code>LNCJHILJOBA_ReunionReportTypeStart = 1;</code>
     */
    public static final int LNCJHILJOBA_ReunionReportTypeStart_VALUE = 1;
    /**
     * <code>LNCJHILJOBA_ReunionReportTypeDouble = 2;</code>
     */
    public static final int LNCJHILJOBA_ReunionReportTypeDouble_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static LNCJHILJOBA valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static LNCJHILJOBA forNumber(int value) {
      switch (value) {
        case 0: return LNCJHILJOBA_ReunionReportTypeNone;
        case 1: return LNCJHILJOBA_ReunionReportTypeStart;
        case 2: return LNCJHILJOBA_ReunionReportTypeDouble;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<LNCJHILJOBA>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        LNCJHILJOBA> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<LNCJHILJOBA>() {
            public LNCJHILJOBA findValueByNumber(int number) {
              return LNCJHILJOBA.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.LNCJHILJOBAOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final LNCJHILJOBA[] VALUES = values();

    public static LNCJHILJOBA valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private LNCJHILJOBA(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:LNCJHILJOBA)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021LNCJHILJOBA.proto*\205\001\n\013LNCJHILJOBA\022%\n!L" +
      "NCJHILJOBA_ReunionReportTypeNone\020\000\022&\n\"LN" +
      "CJHILJOBA_ReunionReportTypeStart\020\001\022\'\n#LN" +
      "CJHILJOBA_ReunionReportTypeDouble\020\002B\033\n\031e" +
      "mu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
