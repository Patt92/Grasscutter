// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ShopGoodsDisableType.proto

package emu.grasscutter.net.proto;

public final class ShopGoodsDisableTypeOuterClass {
  private ShopGoodsDisableTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code ShopGoodsDisableType}
   */
  public enum ShopGoodsDisableType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>SHOP_GOODS_DISABLE_NONE = 0;</code>
     */
    SHOP_GOODS_DISABLE_NONE(0),
    /**
     * <code>SHOP_GOODS_DISABLE_TALENT_FULL = 1;</code>
     */
    SHOP_GOODS_DISABLE_TALENT_FULL(1),
    /**
     * <code>SHOP_GOODS_DISABLE_FURNITURE_FORMULA_UNLOCKED = 2;</code>
     */
    SHOP_GOODS_DISABLE_FURNITURE_FORMULA_UNLOCKED(2),
    /**
     * <code>SHOP_GOODS_DISABLE_COSTUME_UNLOCKED = 3;</code>
     */
    SHOP_GOODS_DISABLE_COSTUME_UNLOCKED(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>SHOP_GOODS_DISABLE_NONE = 0;</code>
     */
    public static final int SHOP_GOODS_DISABLE_NONE_VALUE = 0;
    /**
     * <code>SHOP_GOODS_DISABLE_TALENT_FULL = 1;</code>
     */
    public static final int SHOP_GOODS_DISABLE_TALENT_FULL_VALUE = 1;
    /**
     * <code>SHOP_GOODS_DISABLE_FURNITURE_FORMULA_UNLOCKED = 2;</code>
     */
    public static final int SHOP_GOODS_DISABLE_FURNITURE_FORMULA_UNLOCKED_VALUE = 2;
    /**
     * <code>SHOP_GOODS_DISABLE_COSTUME_UNLOCKED = 3;</code>
     */
    public static final int SHOP_GOODS_DISABLE_COSTUME_UNLOCKED_VALUE = 3;


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
    public static ShopGoodsDisableType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ShopGoodsDisableType forNumber(int value) {
      switch (value) {
        case 0: return SHOP_GOODS_DISABLE_NONE;
        case 1: return SHOP_GOODS_DISABLE_TALENT_FULL;
        case 2: return SHOP_GOODS_DISABLE_FURNITURE_FORMULA_UNLOCKED;
        case 3: return SHOP_GOODS_DISABLE_COSTUME_UNLOCKED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ShopGoodsDisableType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ShopGoodsDisableType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ShopGoodsDisableType>() {
            public ShopGoodsDisableType findValueByNumber(int number) {
              return ShopGoodsDisableType.forNumber(number);
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
      return emu.grasscutter.net.proto.ShopGoodsDisableTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final ShopGoodsDisableType[] VALUES = values();

    public static ShopGoodsDisableType valueOf(
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

    private ShopGoodsDisableType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:ShopGoodsDisableType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032ShopGoodsDisableType.proto*\263\001\n\024ShopGoo" +
      "dsDisableType\022\033\n\027SHOP_GOODS_DISABLE_NONE" +
      "\020\000\022\"\n\036SHOP_GOODS_DISABLE_TALENT_FULL\020\001\0221" +
      "\n-SHOP_GOODS_DISABLE_FURNITURE_FORMULA_U" +
      "NLOCKED\020\002\022\'\n#SHOP_GOODS_DISABLE_COSTUME_" +
      "UNLOCKED\020\003B\033\n\031emu.grasscutter.net.protob" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
