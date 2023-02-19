// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DailyTaskUnlockedCitiesNotify.proto

package emu.grasscutter.net.proto;

public final class DailyTaskUnlockedCitiesNotifyOuterClass {
  private DailyTaskUnlockedCitiesNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DailyTaskUnlockedCitiesNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DailyTaskUnlockedCitiesNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 unlockedCityList = 6;</code>
     * @return A list containing the unlockedCityList.
     */
    java.util.List<java.lang.Integer> getUnlockedCityListList();
    /**
     * <code>repeated uint32 unlockedCityList = 6;</code>
     * @return The count of unlockedCityList.
     */
    int getUnlockedCityListCount();
    /**
     * <code>repeated uint32 unlockedCityList = 6;</code>
     * @param index The index of the element to return.
     * @return The unlockedCityList at the given index.
     */
    int getUnlockedCityList(int index);
  }
  /**
   * Protobuf type {@code DailyTaskUnlockedCitiesNotify}
   */
  public static final class DailyTaskUnlockedCitiesNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DailyTaskUnlockedCitiesNotify)
      DailyTaskUnlockedCitiesNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DailyTaskUnlockedCitiesNotify.newBuilder() to construct.
    private DailyTaskUnlockedCitiesNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DailyTaskUnlockedCitiesNotify() {
      unlockedCityList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DailyTaskUnlockedCitiesNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DailyTaskUnlockedCitiesNotify(
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
                unlockedCityList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              unlockedCityList_.addInt(input.readUInt32());
              break;
            }
            case 50: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                unlockedCityList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                unlockedCityList_.addInt(input.readUInt32());
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
          unlockedCityList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.DailyTaskUnlockedCitiesNotifyOuterClass.internal_static_DailyTaskUnlockedCitiesNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.DailyTaskUnlockedCitiesNotifyOuterClass.internal_static_DailyTaskUnlockedCitiesNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify.class, emu.grasscutter.net.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify.Builder.class);
    }

    /**
     * Protobuf enum {@code DailyTaskUnlockedCitiesNotify.PGKOMCHPHJP}
     */
    public enum PGKOMCHPHJP
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 176;</code>
       */
      PEPPOHPHJOJ(1, 176),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final PGKOMCHPHJP DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 176;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 176;
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
      public static PGKOMCHPHJP valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static PGKOMCHPHJP forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 176: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<PGKOMCHPHJP>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          PGKOMCHPHJP> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<PGKOMCHPHJP>() {
              public PGKOMCHPHJP findValueByNumber(int number) {
                return PGKOMCHPHJP.forNumber(number);
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
        return emu.grasscutter.net.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify.getDescriptor().getEnumTypes().get(0);
      }

      private static final PGKOMCHPHJP[] VALUES = getStaticValuesArray();
      private static PGKOMCHPHJP[] getStaticValuesArray() {
        return new PGKOMCHPHJP[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static PGKOMCHPHJP valueOf(
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

      private PGKOMCHPHJP(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:DailyTaskUnlockedCitiesNotify.PGKOMCHPHJP)
    }

    public static final int UNLOCKEDCITYLIST_FIELD_NUMBER = 6;
    private com.google.protobuf.Internal.IntList unlockedCityList_;
    /**
     * <code>repeated uint32 unlockedCityList = 6;</code>
     * @return A list containing the unlockedCityList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getUnlockedCityListList() {
      return unlockedCityList_;
    }
    /**
     * <code>repeated uint32 unlockedCityList = 6;</code>
     * @return The count of unlockedCityList.
     */
    public int getUnlockedCityListCount() {
      return unlockedCityList_.size();
    }
    /**
     * <code>repeated uint32 unlockedCityList = 6;</code>
     * @param index The index of the element to return.
     * @return The unlockedCityList at the given index.
     */
    public int getUnlockedCityList(int index) {
      return unlockedCityList_.getInt(index);
    }
    private int unlockedCityListMemoizedSerializedSize = -1;

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
      if (getUnlockedCityListList().size() > 0) {
        output.writeUInt32NoTag(50);
        output.writeUInt32NoTag(unlockedCityListMemoizedSerializedSize);
      }
      for (int i = 0; i < unlockedCityList_.size(); i++) {
        output.writeUInt32NoTag(unlockedCityList_.getInt(i));
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
        for (int i = 0; i < unlockedCityList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(unlockedCityList_.getInt(i));
        }
        size += dataSize;
        if (!getUnlockedCityListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        unlockedCityListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify other = (emu.grasscutter.net.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify) obj;

      if (!getUnlockedCityListList()
          .equals(other.getUnlockedCityListList())) return false;
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
      if (getUnlockedCityListCount() > 0) {
        hash = (37 * hash) + UNLOCKEDCITYLIST_FIELD_NUMBER;
        hash = (53 * hash) + getUnlockedCityListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify prototype) {
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
     * Protobuf type {@code DailyTaskUnlockedCitiesNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DailyTaskUnlockedCitiesNotify)
        emu.grasscutter.net.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.DailyTaskUnlockedCitiesNotifyOuterClass.internal_static_DailyTaskUnlockedCitiesNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.DailyTaskUnlockedCitiesNotifyOuterClass.internal_static_DailyTaskUnlockedCitiesNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify.class, emu.grasscutter.net.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify.newBuilder()
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
        unlockedCityList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.DailyTaskUnlockedCitiesNotifyOuterClass.internal_static_DailyTaskUnlockedCitiesNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify build() {
        emu.grasscutter.net.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify buildPartial() {
        emu.grasscutter.net.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify result = new emu.grasscutter.net.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          unlockedCityList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.unlockedCityList_ = unlockedCityList_;
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
        if (other instanceof emu.grasscutter.net.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify) {
          return mergeFrom((emu.grasscutter.net.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify other) {
        if (other == emu.grasscutter.net.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify.getDefaultInstance()) return this;
        if (!other.unlockedCityList_.isEmpty()) {
          if (unlockedCityList_.isEmpty()) {
            unlockedCityList_ = other.unlockedCityList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUnlockedCityListIsMutable();
            unlockedCityList_.addAll(other.unlockedCityList_);
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
        emu.grasscutter.net.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList unlockedCityList_ = emptyIntList();
      private void ensureUnlockedCityListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          unlockedCityList_ = mutableCopy(unlockedCityList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 unlockedCityList = 6;</code>
       * @return A list containing the unlockedCityList.
       */
      public java.util.List<java.lang.Integer>
          getUnlockedCityListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(unlockedCityList_) : unlockedCityList_;
      }
      /**
       * <code>repeated uint32 unlockedCityList = 6;</code>
       * @return The count of unlockedCityList.
       */
      public int getUnlockedCityListCount() {
        return unlockedCityList_.size();
      }
      /**
       * <code>repeated uint32 unlockedCityList = 6;</code>
       * @param index The index of the element to return.
       * @return The unlockedCityList at the given index.
       */
      public int getUnlockedCityList(int index) {
        return unlockedCityList_.getInt(index);
      }
      /**
       * <code>repeated uint32 unlockedCityList = 6;</code>
       * @param index The index to set the value at.
       * @param value The unlockedCityList to set.
       * @return This builder for chaining.
       */
      public Builder setUnlockedCityList(
          int index, int value) {
        ensureUnlockedCityListIsMutable();
        unlockedCityList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 unlockedCityList = 6;</code>
       * @param value The unlockedCityList to add.
       * @return This builder for chaining.
       */
      public Builder addUnlockedCityList(int value) {
        ensureUnlockedCityListIsMutable();
        unlockedCityList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 unlockedCityList = 6;</code>
       * @param values The unlockedCityList to add.
       * @return This builder for chaining.
       */
      public Builder addAllUnlockedCityList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureUnlockedCityListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, unlockedCityList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 unlockedCityList = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnlockedCityList() {
        unlockedCityList_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:DailyTaskUnlockedCitiesNotify)
    }

    // @@protoc_insertion_point(class_scope:DailyTaskUnlockedCitiesNotify)
    private static final emu.grasscutter.net.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify();
    }

    public static emu.grasscutter.net.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DailyTaskUnlockedCitiesNotify>
        PARSER = new com.google.protobuf.AbstractParser<DailyTaskUnlockedCitiesNotify>() {
      @java.lang.Override
      public DailyTaskUnlockedCitiesNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DailyTaskUnlockedCitiesNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DailyTaskUnlockedCitiesNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DailyTaskUnlockedCitiesNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DailyTaskUnlockedCitiesNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DailyTaskUnlockedCitiesNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#DailyTaskUnlockedCitiesNotify.proto\032\014u" +
      "int32.proto\"\212\001\n\035DailyTaskUnlockedCitiesN" +
      "otify\022\030\n\020unlockedCityList\030\006 \003(\r\"O\n\013PGKOM" +
      "CHPHJP\022\010\n\004NONE\020\000\022\020\n\013PEPPOHPHJOJ\020\260\001\022\017\n\013DC" +
      "DNILFDFLB\020\000\022\017\n\013NNBKOLMPOEA\020\001\032\002\020\001B\033\n\031emu." +
      "grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.Uint32.getDescriptor(),
        });
    internal_static_DailyTaskUnlockedCitiesNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DailyTaskUnlockedCitiesNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DailyTaskUnlockedCitiesNotify_descriptor,
        new java.lang.String[] { "UnlockedCityList", });
    emu.grasscutter.net.proto.Uint32.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
