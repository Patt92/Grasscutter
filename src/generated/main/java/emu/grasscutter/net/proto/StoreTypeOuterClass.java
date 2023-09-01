// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: StoreType.proto

package emu.grasscutter.net.proto;

public final class StoreTypeOuterClass {
  private StoreTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * <pre>
   * Obf: HDHLNCKJKCA
   * </pre>
   *
   * Protobuf enum {@code StoreType}
   */
  public enum StoreType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>STORE_TYPE_NONE = 0;</code>
     */
    STORE_TYPE_NONE(0),
    /**
     * <code>STORE_TYPE_PACK = 1;</code>
     */
    STORE_TYPE_PACK(1),
    /**
     * <code>STORE_TYPE_DEPOT = 2;</code>
     */
    STORE_TYPE_DEPOT(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>STORE_TYPE_NONE = 0;</code>
     */
    public static final int STORE_TYPE_NONE_VALUE = 0;
    /**
     * <code>STORE_TYPE_PACK = 1;</code>
     */
    public static final int STORE_TYPE_PACK_VALUE = 1;
    /**
     * <code>STORE_TYPE_DEPOT = 2;</code>
     */
    public static final int STORE_TYPE_DEPOT_VALUE = 2;


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
    public static StoreType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static StoreType forNumber(int value) {
      switch (value) {
        case 0: return STORE_TYPE_NONE;
        case 1: return STORE_TYPE_PACK;
        case 2: return STORE_TYPE_DEPOT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<StoreType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        StoreType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<StoreType>() {
            public StoreType findValueByNumber(int number) {
              return StoreType.forNumber(number);
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
      return emu.grasscutter.net.proto.StoreTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final StoreType[] VALUES = values();

    public static StoreType valueOf(
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

    private StoreType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:StoreType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017StoreType.proto*K\n\tStoreType\022\023\n\017STORE_" +
      "TYPE_NONE\020\000\022\023\n\017STORE_TYPE_PACK\020\001\022\024\n\020STOR" +
      "E_TYPE_DEPOT\020\002B\033\n\031emu.grasscutter.net.pr" +
      "otob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
