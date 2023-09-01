// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ModifierAction.proto

package emu.grasscutter.net.proto;

public final class ModifierActionOuterClass {
  private ModifierActionOuterClass() {}
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
   * Obf: DBPAAGNJNHH
   * </pre>
   *
   * Protobuf enum {@code ModifierAction}
   */
  public enum ModifierAction
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>MODIFIER_ACTION_ADDED = 0;</code>
     */
    MODIFIER_ACTION_ADDED(0),
    /**
     * <code>MODIFIER_ACTION_REMOVED = 1;</code>
     */
    MODIFIER_ACTION_REMOVED(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>MODIFIER_ACTION_ADDED = 0;</code>
     */
    public static final int MODIFIER_ACTION_ADDED_VALUE = 0;
    /**
     * <code>MODIFIER_ACTION_REMOVED = 1;</code>
     */
    public static final int MODIFIER_ACTION_REMOVED_VALUE = 1;


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
    public static ModifierAction valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ModifierAction forNumber(int value) {
      switch (value) {
        case 0: return MODIFIER_ACTION_ADDED;
        case 1: return MODIFIER_ACTION_REMOVED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ModifierAction>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ModifierAction> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ModifierAction>() {
            public ModifierAction findValueByNumber(int number) {
              return ModifierAction.forNumber(number);
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
      return emu.grasscutter.net.proto.ModifierActionOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final ModifierAction[] VALUES = values();

    public static ModifierAction valueOf(
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

    private ModifierAction(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:ModifierAction)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024ModifierAction.proto*H\n\016ModifierAction" +
      "\022\031\n\025MODIFIER_ACTION_ADDED\020\000\022\033\n\027MODIFIER_" +
      "ACTION_REMOVED\020\001B\033\n\031emu.grasscutter.net." +
      "protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
