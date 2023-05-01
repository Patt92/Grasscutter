// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Equip.proto

package emu.grasscutter.net.proto;

public final class EquipOuterClass {
  private EquipOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EquipOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Equip)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_locked = 3;</code>
     * @return The isLocked.
     */
    boolean getIsLocked();

    /**
     * <code>.Reliquary reliquary = 1;</code>
     * @return Whether the reliquary field is set.
     */
    boolean hasReliquary();
    /**
     * <code>.Reliquary reliquary = 1;</code>
     * @return The reliquary.
     */
    emu.grasscutter.net.proto.ReliquaryOuterClass.Reliquary getReliquary();
    /**
     * <code>.Reliquary reliquary = 1;</code>
     */
    emu.grasscutter.net.proto.ReliquaryOuterClass.ReliquaryOrBuilder getReliquaryOrBuilder();

    /**
     * <code>.Weapon weapon = 2;</code>
     * @return Whether the weapon field is set.
     */
    boolean hasWeapon();
    /**
     * <code>.Weapon weapon = 2;</code>
     * @return The weapon.
     */
    emu.grasscutter.net.proto.WeaponOuterClass.Weapon getWeapon();
    /**
     * <code>.Weapon weapon = 2;</code>
     */
    emu.grasscutter.net.proto.WeaponOuterClass.WeaponOrBuilder getWeaponOrBuilder();

    public emu.grasscutter.net.proto.EquipOuterClass.Equip.DetailCase getDetailCase();
  }
  /**
   * <pre>
   * Name: PDGCLANHIJP
   * </pre>
   *
   * Protobuf type {@code Equip}
   */
  public static final class Equip extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Equip)
      EquipOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Equip.newBuilder() to construct.
    private Equip(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Equip() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Equip();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Equip(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              emu.grasscutter.net.proto.ReliquaryOuterClass.Reliquary.Builder subBuilder = null;
              if (detailCase_ == 1) {
                subBuilder = ((emu.grasscutter.net.proto.ReliquaryOuterClass.Reliquary) detail_).toBuilder();
              }
              detail_ =
                  input.readMessage(emu.grasscutter.net.proto.ReliquaryOuterClass.Reliquary.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((emu.grasscutter.net.proto.ReliquaryOuterClass.Reliquary) detail_);
                detail_ = subBuilder.buildPartial();
              }
              detailCase_ = 1;
              break;
            }
            case 18: {
              emu.grasscutter.net.proto.WeaponOuterClass.Weapon.Builder subBuilder = null;
              if (detailCase_ == 2) {
                subBuilder = ((emu.grasscutter.net.proto.WeaponOuterClass.Weapon) detail_).toBuilder();
              }
              detail_ =
                  input.readMessage(emu.grasscutter.net.proto.WeaponOuterClass.Weapon.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((emu.grasscutter.net.proto.WeaponOuterClass.Weapon) detail_);
                detail_ = subBuilder.buildPartial();
              }
              detailCase_ = 2;
              break;
            }
            case 24: {

              isLocked_ = input.readBool();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.EquipOuterClass.internal_static_Equip_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.EquipOuterClass.internal_static_Equip_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.EquipOuterClass.Equip.class, emu.grasscutter.net.proto.EquipOuterClass.Equip.Builder.class);
    }

    private int detailCase_ = 0;
    private java.lang.Object detail_;
    public enum DetailCase
        implements com.google.protobuf.Internal.EnumLite,
            com.google.protobuf.AbstractMessage.InternalOneOfEnum {
      RELIQUARY(1),
      WEAPON(2),
      DETAIL_NOT_SET(0);
      private final int value;
      private DetailCase(int value) {
        this.value = value;
      }
      /**
       * @param value The number of the enum to look for.
       * @return The enum associated with the given number.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static DetailCase valueOf(int value) {
        return forNumber(value);
      }

      public static DetailCase forNumber(int value) {
        switch (value) {
          case 1: return RELIQUARY;
          case 2: return WEAPON;
          case 0: return DETAIL_NOT_SET;
          default: return null;
        }
      }
      public int getNumber() {
        return this.value;
      }
    };

    public DetailCase
    getDetailCase() {
      return DetailCase.forNumber(
          detailCase_);
    }

    public static final int IS_LOCKED_FIELD_NUMBER = 3;
    private boolean isLocked_;
    /**
     * <code>bool is_locked = 3;</code>
     * @return The isLocked.
     */
    @java.lang.Override
    public boolean getIsLocked() {
      return isLocked_;
    }

    public static final int RELIQUARY_FIELD_NUMBER = 1;
    /**
     * <code>.Reliquary reliquary = 1;</code>
     * @return Whether the reliquary field is set.
     */
    @java.lang.Override
    public boolean hasReliquary() {
      return detailCase_ == 1;
    }
    /**
     * <code>.Reliquary reliquary = 1;</code>
     * @return The reliquary.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ReliquaryOuterClass.Reliquary getReliquary() {
      if (detailCase_ == 1) {
         return (emu.grasscutter.net.proto.ReliquaryOuterClass.Reliquary) detail_;
      }
      return emu.grasscutter.net.proto.ReliquaryOuterClass.Reliquary.getDefaultInstance();
    }
    /**
     * <code>.Reliquary reliquary = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ReliquaryOuterClass.ReliquaryOrBuilder getReliquaryOrBuilder() {
      if (detailCase_ == 1) {
         return (emu.grasscutter.net.proto.ReliquaryOuterClass.Reliquary) detail_;
      }
      return emu.grasscutter.net.proto.ReliquaryOuterClass.Reliquary.getDefaultInstance();
    }

    public static final int WEAPON_FIELD_NUMBER = 2;
    /**
     * <code>.Weapon weapon = 2;</code>
     * @return Whether the weapon field is set.
     */
    @java.lang.Override
    public boolean hasWeapon() {
      return detailCase_ == 2;
    }
    /**
     * <code>.Weapon weapon = 2;</code>
     * @return The weapon.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.WeaponOuterClass.Weapon getWeapon() {
      if (detailCase_ == 2) {
         return (emu.grasscutter.net.proto.WeaponOuterClass.Weapon) detail_;
      }
      return emu.grasscutter.net.proto.WeaponOuterClass.Weapon.getDefaultInstance();
    }
    /**
     * <code>.Weapon weapon = 2;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.WeaponOuterClass.WeaponOrBuilder getWeaponOrBuilder() {
      if (detailCase_ == 2) {
         return (emu.grasscutter.net.proto.WeaponOuterClass.Weapon) detail_;
      }
      return emu.grasscutter.net.proto.WeaponOuterClass.Weapon.getDefaultInstance();
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (detailCase_ == 1) {
        output.writeMessage(1, (emu.grasscutter.net.proto.ReliquaryOuterClass.Reliquary) detail_);
      }
      if (detailCase_ == 2) {
        output.writeMessage(2, (emu.grasscutter.net.proto.WeaponOuterClass.Weapon) detail_);
      }
      if (isLocked_ != false) {
        output.writeBool(3, isLocked_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (detailCase_ == 1) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, (emu.grasscutter.net.proto.ReliquaryOuterClass.Reliquary) detail_);
      }
      if (detailCase_ == 2) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, (emu.grasscutter.net.proto.WeaponOuterClass.Weapon) detail_);
      }
      if (isLocked_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, isLocked_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.EquipOuterClass.Equip)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.EquipOuterClass.Equip other = (emu.grasscutter.net.proto.EquipOuterClass.Equip) obj;

      if (getIsLocked()
          != other.getIsLocked()) return false;
      if (!getDetailCase().equals(other.getDetailCase())) return false;
      switch (detailCase_) {
        case 1:
          if (!getReliquary()
              .equals(other.getReliquary())) return false;
          break;
        case 2:
          if (!getWeapon()
              .equals(other.getWeapon())) return false;
          break;
        case 0:
        default:
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + IS_LOCKED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsLocked());
      switch (detailCase_) {
        case 1:
          hash = (37 * hash) + RELIQUARY_FIELD_NUMBER;
          hash = (53 * hash) + getReliquary().hashCode();
          break;
        case 2:
          hash = (37 * hash) + WEAPON_FIELD_NUMBER;
          hash = (53 * hash) + getWeapon().hashCode();
          break;
        case 0:
        default:
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.EquipOuterClass.Equip parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EquipOuterClass.Equip parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EquipOuterClass.Equip parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EquipOuterClass.Equip parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EquipOuterClass.Equip parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EquipOuterClass.Equip parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EquipOuterClass.Equip parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EquipOuterClass.Equip parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EquipOuterClass.Equip parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EquipOuterClass.Equip parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EquipOuterClass.Equip parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EquipOuterClass.Equip parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.EquipOuterClass.Equip prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * Name: PDGCLANHIJP
     * </pre>
     *
     * Protobuf type {@code Equip}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Equip)
        emu.grasscutter.net.proto.EquipOuterClass.EquipOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.EquipOuterClass.internal_static_Equip_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.EquipOuterClass.internal_static_Equip_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.EquipOuterClass.Equip.class, emu.grasscutter.net.proto.EquipOuterClass.Equip.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.EquipOuterClass.Equip.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        isLocked_ = false;

        detailCase_ = 0;
        detail_ = null;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.EquipOuterClass.internal_static_Equip_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EquipOuterClass.Equip getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.EquipOuterClass.Equip.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EquipOuterClass.Equip build() {
        emu.grasscutter.net.proto.EquipOuterClass.Equip result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EquipOuterClass.Equip buildPartial() {
        emu.grasscutter.net.proto.EquipOuterClass.Equip result = new emu.grasscutter.net.proto.EquipOuterClass.Equip(this);
        result.isLocked_ = isLocked_;
        if (detailCase_ == 1) {
          if (reliquaryBuilder_ == null) {
            result.detail_ = detail_;
          } else {
            result.detail_ = reliquaryBuilder_.build();
          }
        }
        if (detailCase_ == 2) {
          if (weaponBuilder_ == null) {
            result.detail_ = detail_;
          } else {
            result.detail_ = weaponBuilder_.build();
          }
        }
        result.detailCase_ = detailCase_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.EquipOuterClass.Equip) {
          return mergeFrom((emu.grasscutter.net.proto.EquipOuterClass.Equip)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.EquipOuterClass.Equip other) {
        if (other == emu.grasscutter.net.proto.EquipOuterClass.Equip.getDefaultInstance()) return this;
        if (other.getIsLocked() != false) {
          setIsLocked(other.getIsLocked());
        }
        switch (other.getDetailCase()) {
          case RELIQUARY: {
            mergeReliquary(other.getReliquary());
            break;
          }
          case WEAPON: {
            mergeWeapon(other.getWeapon());
            break;
          }
          case DETAIL_NOT_SET: {
            break;
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.EquipOuterClass.Equip parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.EquipOuterClass.Equip) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int detailCase_ = 0;
      private java.lang.Object detail_;
      public DetailCase
          getDetailCase() {
        return DetailCase.forNumber(
            detailCase_);
      }

      public Builder clearDetail() {
        detailCase_ = 0;
        detail_ = null;
        onChanged();
        return this;
      }


      private boolean isLocked_ ;
      /**
       * <code>bool is_locked = 3;</code>
       * @return The isLocked.
       */
      @java.lang.Override
      public boolean getIsLocked() {
        return isLocked_;
      }
      /**
       * <code>bool is_locked = 3;</code>
       * @param value The isLocked to set.
       * @return This builder for chaining.
       */
      public Builder setIsLocked(boolean value) {
        
        isLocked_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_locked = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsLocked() {
        
        isLocked_ = false;
        onChanged();
        return this;
      }

      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.ReliquaryOuterClass.Reliquary, emu.grasscutter.net.proto.ReliquaryOuterClass.Reliquary.Builder, emu.grasscutter.net.proto.ReliquaryOuterClass.ReliquaryOrBuilder> reliquaryBuilder_;
      /**
       * <code>.Reliquary reliquary = 1;</code>
       * @return Whether the reliquary field is set.
       */
      @java.lang.Override
      public boolean hasReliquary() {
        return detailCase_ == 1;
      }
      /**
       * <code>.Reliquary reliquary = 1;</code>
       * @return The reliquary.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.ReliquaryOuterClass.Reliquary getReliquary() {
        if (reliquaryBuilder_ == null) {
          if (detailCase_ == 1) {
            return (emu.grasscutter.net.proto.ReliquaryOuterClass.Reliquary) detail_;
          }
          return emu.grasscutter.net.proto.ReliquaryOuterClass.Reliquary.getDefaultInstance();
        } else {
          if (detailCase_ == 1) {
            return reliquaryBuilder_.getMessage();
          }
          return emu.grasscutter.net.proto.ReliquaryOuterClass.Reliquary.getDefaultInstance();
        }
      }
      /**
       * <code>.Reliquary reliquary = 1;</code>
       */
      public Builder setReliquary(emu.grasscutter.net.proto.ReliquaryOuterClass.Reliquary value) {
        if (reliquaryBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          detail_ = value;
          onChanged();
        } else {
          reliquaryBuilder_.setMessage(value);
        }
        detailCase_ = 1;
        return this;
      }
      /**
       * <code>.Reliquary reliquary = 1;</code>
       */
      public Builder setReliquary(
          emu.grasscutter.net.proto.ReliquaryOuterClass.Reliquary.Builder builderForValue) {
        if (reliquaryBuilder_ == null) {
          detail_ = builderForValue.build();
          onChanged();
        } else {
          reliquaryBuilder_.setMessage(builderForValue.build());
        }
        detailCase_ = 1;
        return this;
      }
      /**
       * <code>.Reliquary reliquary = 1;</code>
       */
      public Builder mergeReliquary(emu.grasscutter.net.proto.ReliquaryOuterClass.Reliquary value) {
        if (reliquaryBuilder_ == null) {
          if (detailCase_ == 1 &&
              detail_ != emu.grasscutter.net.proto.ReliquaryOuterClass.Reliquary.getDefaultInstance()) {
            detail_ = emu.grasscutter.net.proto.ReliquaryOuterClass.Reliquary.newBuilder((emu.grasscutter.net.proto.ReliquaryOuterClass.Reliquary) detail_)
                .mergeFrom(value).buildPartial();
          } else {
            detail_ = value;
          }
          onChanged();
        } else {
          if (detailCase_ == 1) {
            reliquaryBuilder_.mergeFrom(value);
          }
          reliquaryBuilder_.setMessage(value);
        }
        detailCase_ = 1;
        return this;
      }
      /**
       * <code>.Reliquary reliquary = 1;</code>
       */
      public Builder clearReliquary() {
        if (reliquaryBuilder_ == null) {
          if (detailCase_ == 1) {
            detailCase_ = 0;
            detail_ = null;
            onChanged();
          }
        } else {
          if (detailCase_ == 1) {
            detailCase_ = 0;
            detail_ = null;
          }
          reliquaryBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>.Reliquary reliquary = 1;</code>
       */
      public emu.grasscutter.net.proto.ReliquaryOuterClass.Reliquary.Builder getReliquaryBuilder() {
        return getReliquaryFieldBuilder().getBuilder();
      }
      /**
       * <code>.Reliquary reliquary = 1;</code>
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.ReliquaryOuterClass.ReliquaryOrBuilder getReliquaryOrBuilder() {
        if ((detailCase_ == 1) && (reliquaryBuilder_ != null)) {
          return reliquaryBuilder_.getMessageOrBuilder();
        } else {
          if (detailCase_ == 1) {
            return (emu.grasscutter.net.proto.ReliquaryOuterClass.Reliquary) detail_;
          }
          return emu.grasscutter.net.proto.ReliquaryOuterClass.Reliquary.getDefaultInstance();
        }
      }
      /**
       * <code>.Reliquary reliquary = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.ReliquaryOuterClass.Reliquary, emu.grasscutter.net.proto.ReliquaryOuterClass.Reliquary.Builder, emu.grasscutter.net.proto.ReliquaryOuterClass.ReliquaryOrBuilder> 
          getReliquaryFieldBuilder() {
        if (reliquaryBuilder_ == null) {
          if (!(detailCase_ == 1)) {
            detail_ = emu.grasscutter.net.proto.ReliquaryOuterClass.Reliquary.getDefaultInstance();
          }
          reliquaryBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.ReliquaryOuterClass.Reliquary, emu.grasscutter.net.proto.ReliquaryOuterClass.Reliquary.Builder, emu.grasscutter.net.proto.ReliquaryOuterClass.ReliquaryOrBuilder>(
                  (emu.grasscutter.net.proto.ReliquaryOuterClass.Reliquary) detail_,
                  getParentForChildren(),
                  isClean());
          detail_ = null;
        }
        detailCase_ = 1;
        onChanged();;
        return reliquaryBuilder_;
      }

      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.WeaponOuterClass.Weapon, emu.grasscutter.net.proto.WeaponOuterClass.Weapon.Builder, emu.grasscutter.net.proto.WeaponOuterClass.WeaponOrBuilder> weaponBuilder_;
      /**
       * <code>.Weapon weapon = 2;</code>
       * @return Whether the weapon field is set.
       */
      @java.lang.Override
      public boolean hasWeapon() {
        return detailCase_ == 2;
      }
      /**
       * <code>.Weapon weapon = 2;</code>
       * @return The weapon.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.WeaponOuterClass.Weapon getWeapon() {
        if (weaponBuilder_ == null) {
          if (detailCase_ == 2) {
            return (emu.grasscutter.net.proto.WeaponOuterClass.Weapon) detail_;
          }
          return emu.grasscutter.net.proto.WeaponOuterClass.Weapon.getDefaultInstance();
        } else {
          if (detailCase_ == 2) {
            return weaponBuilder_.getMessage();
          }
          return emu.grasscutter.net.proto.WeaponOuterClass.Weapon.getDefaultInstance();
        }
      }
      /**
       * <code>.Weapon weapon = 2;</code>
       */
      public Builder setWeapon(emu.grasscutter.net.proto.WeaponOuterClass.Weapon value) {
        if (weaponBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          detail_ = value;
          onChanged();
        } else {
          weaponBuilder_.setMessage(value);
        }
        detailCase_ = 2;
        return this;
      }
      /**
       * <code>.Weapon weapon = 2;</code>
       */
      public Builder setWeapon(
          emu.grasscutter.net.proto.WeaponOuterClass.Weapon.Builder builderForValue) {
        if (weaponBuilder_ == null) {
          detail_ = builderForValue.build();
          onChanged();
        } else {
          weaponBuilder_.setMessage(builderForValue.build());
        }
        detailCase_ = 2;
        return this;
      }
      /**
       * <code>.Weapon weapon = 2;</code>
       */
      public Builder mergeWeapon(emu.grasscutter.net.proto.WeaponOuterClass.Weapon value) {
        if (weaponBuilder_ == null) {
          if (detailCase_ == 2 &&
              detail_ != emu.grasscutter.net.proto.WeaponOuterClass.Weapon.getDefaultInstance()) {
            detail_ = emu.grasscutter.net.proto.WeaponOuterClass.Weapon.newBuilder((emu.grasscutter.net.proto.WeaponOuterClass.Weapon) detail_)
                .mergeFrom(value).buildPartial();
          } else {
            detail_ = value;
          }
          onChanged();
        } else {
          if (detailCase_ == 2) {
            weaponBuilder_.mergeFrom(value);
          }
          weaponBuilder_.setMessage(value);
        }
        detailCase_ = 2;
        return this;
      }
      /**
       * <code>.Weapon weapon = 2;</code>
       */
      public Builder clearWeapon() {
        if (weaponBuilder_ == null) {
          if (detailCase_ == 2) {
            detailCase_ = 0;
            detail_ = null;
            onChanged();
          }
        } else {
          if (detailCase_ == 2) {
            detailCase_ = 0;
            detail_ = null;
          }
          weaponBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>.Weapon weapon = 2;</code>
       */
      public emu.grasscutter.net.proto.WeaponOuterClass.Weapon.Builder getWeaponBuilder() {
        return getWeaponFieldBuilder().getBuilder();
      }
      /**
       * <code>.Weapon weapon = 2;</code>
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.WeaponOuterClass.WeaponOrBuilder getWeaponOrBuilder() {
        if ((detailCase_ == 2) && (weaponBuilder_ != null)) {
          return weaponBuilder_.getMessageOrBuilder();
        } else {
          if (detailCase_ == 2) {
            return (emu.grasscutter.net.proto.WeaponOuterClass.Weapon) detail_;
          }
          return emu.grasscutter.net.proto.WeaponOuterClass.Weapon.getDefaultInstance();
        }
      }
      /**
       * <code>.Weapon weapon = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.WeaponOuterClass.Weapon, emu.grasscutter.net.proto.WeaponOuterClass.Weapon.Builder, emu.grasscutter.net.proto.WeaponOuterClass.WeaponOrBuilder> 
          getWeaponFieldBuilder() {
        if (weaponBuilder_ == null) {
          if (!(detailCase_ == 2)) {
            detail_ = emu.grasscutter.net.proto.WeaponOuterClass.Weapon.getDefaultInstance();
          }
          weaponBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.WeaponOuterClass.Weapon, emu.grasscutter.net.proto.WeaponOuterClass.Weapon.Builder, emu.grasscutter.net.proto.WeaponOuterClass.WeaponOrBuilder>(
                  (emu.grasscutter.net.proto.WeaponOuterClass.Weapon) detail_,
                  getParentForChildren(),
                  isClean());
          detail_ = null;
        }
        detailCase_ = 2;
        onChanged();;
        return weaponBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:Equip)
    }

    // @@protoc_insertion_point(class_scope:Equip)
    private static final emu.grasscutter.net.proto.EquipOuterClass.Equip DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.EquipOuterClass.Equip();
    }

    public static emu.grasscutter.net.proto.EquipOuterClass.Equip getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Equip>
        PARSER = new com.google.protobuf.AbstractParser<Equip>() {
      @java.lang.Override
      public Equip parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Equip(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Equip> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Equip> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.EquipOuterClass.Equip getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Equip_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Equip_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013Equip.proto\032\017Reliquary.proto\032\014Weapon.p" +
      "roto\"`\n\005Equip\022\021\n\tis_locked\030\003 \001(\010\022\037\n\treli" +
      "quary\030\001 \001(\0132\n.ReliquaryH\000\022\031\n\006weapon\030\002 \001(" +
      "\0132\007.WeaponH\000B\010\n\006detailB\033\n\031emu.grasscutte" +
      "r.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.ReliquaryOuterClass.getDescriptor(),
          emu.grasscutter.net.proto.WeaponOuterClass.getDescriptor(),
        });
    internal_static_Equip_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Equip_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Equip_descriptor,
        new java.lang.String[] { "IsLocked", "Reliquary", "Weapon", "Detail", });
    emu.grasscutter.net.proto.ReliquaryOuterClass.getDescriptor();
    emu.grasscutter.net.proto.WeaponOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
