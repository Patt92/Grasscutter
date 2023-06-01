// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: InBattleMechanicusStageType.proto

package emu.grasscutter.net.proto;

public final class InBattleMechanicusStageTypeOuterClass {
  private InBattleMechanicusStageTypeOuterClass() {}
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
   * Obf: OJEGAOGCPNM
   * </pre>
   *
   * Protobuf enum {@code InBattleMechanicusStageType}
   */
  public enum InBattleMechanicusStageType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>IN_BATTLE_MECHANICUS_STAGE_NONE = 0;</code>
     */
    IN_BATTLE_MECHANICUS_STAGE_NONE(0),
    /**
     * <code>IN_BATTLE_MECHANICUS_STAGE_BUILD = 1;</code>
     */
    IN_BATTLE_MECHANICUS_STAGE_BUILD(1),
    /**
     * <code>IN_BATTLE_MECHANICUS_STAGE_CARD_FLIP = 2;</code>
     */
    IN_BATTLE_MECHANICUS_STAGE_CARD_FLIP(2),
    /**
     * <code>IN_BATTLE_MECHANICUS_STAGE_KILL = 3;</code>
     */
    IN_BATTLE_MECHANICUS_STAGE_KILL(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>IN_BATTLE_MECHANICUS_STAGE_NONE = 0;</code>
     */
    public static final int IN_BATTLE_MECHANICUS_STAGE_NONE_VALUE = 0;
    /**
     * <code>IN_BATTLE_MECHANICUS_STAGE_BUILD = 1;</code>
     */
    public static final int IN_BATTLE_MECHANICUS_STAGE_BUILD_VALUE = 1;
    /**
     * <code>IN_BATTLE_MECHANICUS_STAGE_CARD_FLIP = 2;</code>
     */
    public static final int IN_BATTLE_MECHANICUS_STAGE_CARD_FLIP_VALUE = 2;
    /**
     * <code>IN_BATTLE_MECHANICUS_STAGE_KILL = 3;</code>
     */
    public static final int IN_BATTLE_MECHANICUS_STAGE_KILL_VALUE = 3;


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
    public static InBattleMechanicusStageType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static InBattleMechanicusStageType forNumber(int value) {
      switch (value) {
        case 0: return IN_BATTLE_MECHANICUS_STAGE_NONE;
        case 1: return IN_BATTLE_MECHANICUS_STAGE_BUILD;
        case 2: return IN_BATTLE_MECHANICUS_STAGE_CARD_FLIP;
        case 3: return IN_BATTLE_MECHANICUS_STAGE_KILL;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<InBattleMechanicusStageType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        InBattleMechanicusStageType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<InBattleMechanicusStageType>() {
            public InBattleMechanicusStageType findValueByNumber(int number) {
              return InBattleMechanicusStageType.forNumber(number);
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
      return emu.grasscutter.net.proto.InBattleMechanicusStageTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final InBattleMechanicusStageType[] VALUES = values();

    public static InBattleMechanicusStageType valueOf(
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

    private InBattleMechanicusStageType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:InBattleMechanicusStageType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!InBattleMechanicusStageType.proto*\267\001\n\033" +
      "InBattleMechanicusStageType\022#\n\037IN_BATTLE" +
      "_MECHANICUS_STAGE_NONE\020\000\022$\n IN_BATTLE_ME" +
      "CHANICUS_STAGE_BUILD\020\001\022(\n$IN_BATTLE_MECH" +
      "ANICUS_STAGE_CARD_FLIP\020\002\022#\n\037IN_BATTLE_ME" +
      "CHANICUS_STAGE_KILL\020\003B\033\n\031emu.grasscutter" +
      ".net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
