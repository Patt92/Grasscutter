// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeNewUnlockedBgmIdListNotify.proto

package emu.grasscutter.net.proto;

public final class HomeNewUnlockedBgmIdListNotifyOuterClass {
  private HomeNewUnlockedBgmIdListNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeNewUnlockedBgmIdListNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeNewUnlockedBgmIdListNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 newUnlockedBgmIdList = 6;</code>
     * @return A list containing the newUnlockedBgmIdList.
     */
    java.util.List<java.lang.Integer> getNewUnlockedBgmIdListList();
    /**
     * <code>repeated uint32 newUnlockedBgmIdList = 6;</code>
     * @return The count of newUnlockedBgmIdList.
     */
    int getNewUnlockedBgmIdListCount();
    /**
     * <code>repeated uint32 newUnlockedBgmIdList = 6;</code>
     * @param index The index of the element to return.
     * @return The newUnlockedBgmIdList at the given index.
     */
    int getNewUnlockedBgmIdList(int index);
  }
  /**
   * Protobuf type {@code HomeNewUnlockedBgmIdListNotify}
   */
  public static final class HomeNewUnlockedBgmIdListNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeNewUnlockedBgmIdListNotify)
      HomeNewUnlockedBgmIdListNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeNewUnlockedBgmIdListNotify.newBuilder() to construct.
    private HomeNewUnlockedBgmIdListNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeNewUnlockedBgmIdListNotify() {
      newUnlockedBgmIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeNewUnlockedBgmIdListNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HomeNewUnlockedBgmIdListNotify(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 48: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                newUnlockedBgmIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              newUnlockedBgmIdList_.addInt(input.readUInt32());
              break;
            }
            case 50: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                newUnlockedBgmIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                newUnlockedBgmIdList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          newUnlockedBgmIdList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.HomeNewUnlockedBgmIdListNotifyOuterClass.internal_static_HomeNewUnlockedBgmIdListNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.HomeNewUnlockedBgmIdListNotifyOuterClass.internal_static_HomeNewUnlockedBgmIdListNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.HomeNewUnlockedBgmIdListNotifyOuterClass.HomeNewUnlockedBgmIdListNotify.class, emu.grasscutter.net.proto.HomeNewUnlockedBgmIdListNotifyOuterClass.HomeNewUnlockedBgmIdListNotify.Builder.class);
    }

    /**
     * Protobuf enum {@code HomeNewUnlockedBgmIdListNotify.NGJGDJCKADI}
     */
    public enum NGJGDJCKADI
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 4732;</code>
       */
      PEPPOHPHJOJ(1, 4732),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final NGJGDJCKADI DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 4732;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 4732;
      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final int DCDNILFDFLB_VALUE = 0;
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      public static final int NNBKOLMPOEA_VALUE = 1;


      public final int getNumber() {
        if (index == -1) {
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
      public static NGJGDJCKADI valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static NGJGDJCKADI forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 4732: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<NGJGDJCKADI>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          NGJGDJCKADI> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<NGJGDJCKADI>() {
              public NGJGDJCKADI findValueByNumber(int number) {
                return NGJGDJCKADI.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (index == -1) {
          throw new java.lang.IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HomeNewUnlockedBgmIdListNotifyOuterClass.HomeNewUnlockedBgmIdListNotify.getDescriptor().getEnumTypes().get(0);
      }

      private static final NGJGDJCKADI[] VALUES = getStaticValuesArray();
      private static NGJGDJCKADI[] getStaticValuesArray() {
        return new NGJGDJCKADI[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static NGJGDJCKADI valueOf(
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

      private final int index;
      private final int value;

      private NGJGDJCKADI(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:HomeNewUnlockedBgmIdListNotify.NGJGDJCKADI)
    }

    public static final int NEWUNLOCKEDBGMIDLIST_FIELD_NUMBER = 6;
    private com.google.protobuf.Internal.IntList newUnlockedBgmIdList_;
    /**
     * <code>repeated uint32 newUnlockedBgmIdList = 6;</code>
     * @return A list containing the newUnlockedBgmIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getNewUnlockedBgmIdListList() {
      return newUnlockedBgmIdList_;
    }
    /**
     * <code>repeated uint32 newUnlockedBgmIdList = 6;</code>
     * @return The count of newUnlockedBgmIdList.
     */
    public int getNewUnlockedBgmIdListCount() {
      return newUnlockedBgmIdList_.size();
    }
    /**
     * <code>repeated uint32 newUnlockedBgmIdList = 6;</code>
     * @param index The index of the element to return.
     * @return The newUnlockedBgmIdList at the given index.
     */
    public int getNewUnlockedBgmIdList(int index) {
      return newUnlockedBgmIdList_.getInt(index);
    }
    private int newUnlockedBgmIdListMemoizedSerializedSize = -1;

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
      getSerializedSize();
      if (getNewUnlockedBgmIdListList().size() > 0) {
        output.writeUInt32NoTag(50);
        output.writeUInt32NoTag(newUnlockedBgmIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < newUnlockedBgmIdList_.size(); i++) {
        output.writeUInt32NoTag(newUnlockedBgmIdList_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < newUnlockedBgmIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(newUnlockedBgmIdList_.getInt(i));
        }
        size += dataSize;
        if (!getNewUnlockedBgmIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        newUnlockedBgmIdListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.HomeNewUnlockedBgmIdListNotifyOuterClass.HomeNewUnlockedBgmIdListNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.HomeNewUnlockedBgmIdListNotifyOuterClass.HomeNewUnlockedBgmIdListNotify other = (emu.grasscutter.net.proto.HomeNewUnlockedBgmIdListNotifyOuterClass.HomeNewUnlockedBgmIdListNotify) obj;

      if (!getNewUnlockedBgmIdListList()
          .equals(other.getNewUnlockedBgmIdListList())) return false;
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
      if (getNewUnlockedBgmIdListCount() > 0) {
        hash = (37 * hash) + NEWUNLOCKEDBGMIDLIST_FIELD_NUMBER;
        hash = (53 * hash) + getNewUnlockedBgmIdListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.HomeNewUnlockedBgmIdListNotifyOuterClass.HomeNewUnlockedBgmIdListNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeNewUnlockedBgmIdListNotifyOuterClass.HomeNewUnlockedBgmIdListNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeNewUnlockedBgmIdListNotifyOuterClass.HomeNewUnlockedBgmIdListNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeNewUnlockedBgmIdListNotifyOuterClass.HomeNewUnlockedBgmIdListNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeNewUnlockedBgmIdListNotifyOuterClass.HomeNewUnlockedBgmIdListNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeNewUnlockedBgmIdListNotifyOuterClass.HomeNewUnlockedBgmIdListNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeNewUnlockedBgmIdListNotifyOuterClass.HomeNewUnlockedBgmIdListNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeNewUnlockedBgmIdListNotifyOuterClass.HomeNewUnlockedBgmIdListNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeNewUnlockedBgmIdListNotifyOuterClass.HomeNewUnlockedBgmIdListNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeNewUnlockedBgmIdListNotifyOuterClass.HomeNewUnlockedBgmIdListNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeNewUnlockedBgmIdListNotifyOuterClass.HomeNewUnlockedBgmIdListNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeNewUnlockedBgmIdListNotifyOuterClass.HomeNewUnlockedBgmIdListNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.HomeNewUnlockedBgmIdListNotifyOuterClass.HomeNewUnlockedBgmIdListNotify prototype) {
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
     * Protobuf type {@code HomeNewUnlockedBgmIdListNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeNewUnlockedBgmIdListNotify)
        emu.grasscutter.net.proto.HomeNewUnlockedBgmIdListNotifyOuterClass.HomeNewUnlockedBgmIdListNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HomeNewUnlockedBgmIdListNotifyOuterClass.internal_static_HomeNewUnlockedBgmIdListNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.HomeNewUnlockedBgmIdListNotifyOuterClass.internal_static_HomeNewUnlockedBgmIdListNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.HomeNewUnlockedBgmIdListNotifyOuterClass.HomeNewUnlockedBgmIdListNotify.class, emu.grasscutter.net.proto.HomeNewUnlockedBgmIdListNotifyOuterClass.HomeNewUnlockedBgmIdListNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.HomeNewUnlockedBgmIdListNotifyOuterClass.HomeNewUnlockedBgmIdListNotify.newBuilder()
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
        newUnlockedBgmIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.HomeNewUnlockedBgmIdListNotifyOuterClass.internal_static_HomeNewUnlockedBgmIdListNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeNewUnlockedBgmIdListNotifyOuterClass.HomeNewUnlockedBgmIdListNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.HomeNewUnlockedBgmIdListNotifyOuterClass.HomeNewUnlockedBgmIdListNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeNewUnlockedBgmIdListNotifyOuterClass.HomeNewUnlockedBgmIdListNotify build() {
        emu.grasscutter.net.proto.HomeNewUnlockedBgmIdListNotifyOuterClass.HomeNewUnlockedBgmIdListNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeNewUnlockedBgmIdListNotifyOuterClass.HomeNewUnlockedBgmIdListNotify buildPartial() {
        emu.grasscutter.net.proto.HomeNewUnlockedBgmIdListNotifyOuterClass.HomeNewUnlockedBgmIdListNotify result = new emu.grasscutter.net.proto.HomeNewUnlockedBgmIdListNotifyOuterClass.HomeNewUnlockedBgmIdListNotify(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          newUnlockedBgmIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.newUnlockedBgmIdList_ = newUnlockedBgmIdList_;
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
        if (other instanceof emu.grasscutter.net.proto.HomeNewUnlockedBgmIdListNotifyOuterClass.HomeNewUnlockedBgmIdListNotify) {
          return mergeFrom((emu.grasscutter.net.proto.HomeNewUnlockedBgmIdListNotifyOuterClass.HomeNewUnlockedBgmIdListNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.HomeNewUnlockedBgmIdListNotifyOuterClass.HomeNewUnlockedBgmIdListNotify other) {
        if (other == emu.grasscutter.net.proto.HomeNewUnlockedBgmIdListNotifyOuterClass.HomeNewUnlockedBgmIdListNotify.getDefaultInstance()) return this;
        if (!other.newUnlockedBgmIdList_.isEmpty()) {
          if (newUnlockedBgmIdList_.isEmpty()) {
            newUnlockedBgmIdList_ = other.newUnlockedBgmIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureNewUnlockedBgmIdListIsMutable();
            newUnlockedBgmIdList_.addAll(other.newUnlockedBgmIdList_);
          }
          onChanged();
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
        emu.grasscutter.net.proto.HomeNewUnlockedBgmIdListNotifyOuterClass.HomeNewUnlockedBgmIdListNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.HomeNewUnlockedBgmIdListNotifyOuterClass.HomeNewUnlockedBgmIdListNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList newUnlockedBgmIdList_ = emptyIntList();
      private void ensureNewUnlockedBgmIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          newUnlockedBgmIdList_ = mutableCopy(newUnlockedBgmIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 newUnlockedBgmIdList = 6;</code>
       * @return A list containing the newUnlockedBgmIdList.
       */
      public java.util.List<java.lang.Integer>
          getNewUnlockedBgmIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(newUnlockedBgmIdList_) : newUnlockedBgmIdList_;
      }
      /**
       * <code>repeated uint32 newUnlockedBgmIdList = 6;</code>
       * @return The count of newUnlockedBgmIdList.
       */
      public int getNewUnlockedBgmIdListCount() {
        return newUnlockedBgmIdList_.size();
      }
      /**
       * <code>repeated uint32 newUnlockedBgmIdList = 6;</code>
       * @param index The index of the element to return.
       * @return The newUnlockedBgmIdList at the given index.
       */
      public int getNewUnlockedBgmIdList(int index) {
        return newUnlockedBgmIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 newUnlockedBgmIdList = 6;</code>
       * @param index The index to set the value at.
       * @param value The newUnlockedBgmIdList to set.
       * @return This builder for chaining.
       */
      public Builder setNewUnlockedBgmIdList(
          int index, int value) {
        ensureNewUnlockedBgmIdListIsMutable();
        newUnlockedBgmIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 newUnlockedBgmIdList = 6;</code>
       * @param value The newUnlockedBgmIdList to add.
       * @return This builder for chaining.
       */
      public Builder addNewUnlockedBgmIdList(int value) {
        ensureNewUnlockedBgmIdListIsMutable();
        newUnlockedBgmIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 newUnlockedBgmIdList = 6;</code>
       * @param values The newUnlockedBgmIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllNewUnlockedBgmIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureNewUnlockedBgmIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, newUnlockedBgmIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 newUnlockedBgmIdList = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearNewUnlockedBgmIdList() {
        newUnlockedBgmIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
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


      // @@protoc_insertion_point(builder_scope:HomeNewUnlockedBgmIdListNotify)
    }

    // @@protoc_insertion_point(class_scope:HomeNewUnlockedBgmIdListNotify)
    private static final emu.grasscutter.net.proto.HomeNewUnlockedBgmIdListNotifyOuterClass.HomeNewUnlockedBgmIdListNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.HomeNewUnlockedBgmIdListNotifyOuterClass.HomeNewUnlockedBgmIdListNotify();
    }

    public static emu.grasscutter.net.proto.HomeNewUnlockedBgmIdListNotifyOuterClass.HomeNewUnlockedBgmIdListNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeNewUnlockedBgmIdListNotify>
        PARSER = new com.google.protobuf.AbstractParser<HomeNewUnlockedBgmIdListNotify>() {
      @java.lang.Override
      public HomeNewUnlockedBgmIdListNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HomeNewUnlockedBgmIdListNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HomeNewUnlockedBgmIdListNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeNewUnlockedBgmIdListNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.HomeNewUnlockedBgmIdListNotifyOuterClass.HomeNewUnlockedBgmIdListNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeNewUnlockedBgmIdListNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeNewUnlockedBgmIdListNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$HomeNewUnlockedBgmIdListNotify.proto\"\217" +
      "\001\n\036HomeNewUnlockedBgmIdListNotify\022\034\n\024new" +
      "UnlockedBgmIdList\030\006 \003(\r\"O\n\013NGJGDJCKADI\022\010" +
      "\n\004NONE\020\000\022\020\n\013PEPPOHPHJOJ\020\374$\022\017\n\013DCDNILFDFL" +
      "B\020\000\022\017\n\013NNBKOLMPOEA\020\001\032\002\020\001B\033\n\031emu.grasscut" +
      "ter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_HomeNewUnlockedBgmIdListNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeNewUnlockedBgmIdListNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeNewUnlockedBgmIdListNotify_descriptor,
        new java.lang.String[] { "NewUnlockedBgmIdList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
