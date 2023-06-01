// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetStoreCustomDungeonRsp.proto

package emu.grasscutter.net.proto;

public final class GetStoreCustomDungeonRspOuterClass {
  private GetStoreCustomDungeonRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetStoreCustomDungeonRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetStoreCustomDungeonRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .OtherCustomDungeonBrief custom_dungeon_list = 10;</code>
     */
    java.util.List<emu.grasscutter.net.proto.OtherCustomDungeonBriefOuterClass.OtherCustomDungeonBrief> 
        getCustomDungeonListList();
    /**
     * <code>repeated .OtherCustomDungeonBrief custom_dungeon_list = 10;</code>
     */
    emu.grasscutter.net.proto.OtherCustomDungeonBriefOuterClass.OtherCustomDungeonBrief getCustomDungeonList(int index);
    /**
     * <code>repeated .OtherCustomDungeonBrief custom_dungeon_list = 10;</code>
     */
    int getCustomDungeonListCount();
    /**
     * <code>repeated .OtherCustomDungeonBrief custom_dungeon_list = 10;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.OtherCustomDungeonBriefOuterClass.OtherCustomDungeonBriefOrBuilder> 
        getCustomDungeonListOrBuilderList();
    /**
     * <code>repeated .OtherCustomDungeonBrief custom_dungeon_list = 10;</code>
     */
    emu.grasscutter.net.proto.OtherCustomDungeonBriefOuterClass.OtherCustomDungeonBriefOrBuilder getCustomDungeonListOrBuilder(
        int index);

    /**
     * <code>int32 retcode = 14;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 6249
   * Obf: CILKHMDLLNN
   * </pre>
   *
   * Protobuf type {@code GetStoreCustomDungeonRsp}
   */
  public static final class GetStoreCustomDungeonRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetStoreCustomDungeonRsp)
      GetStoreCustomDungeonRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetStoreCustomDungeonRsp.newBuilder() to construct.
    private GetStoreCustomDungeonRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetStoreCustomDungeonRsp() {
      customDungeonList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetStoreCustomDungeonRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GetStoreCustomDungeonRsp(
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
            case 82: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                customDungeonList_ = new java.util.ArrayList<emu.grasscutter.net.proto.OtherCustomDungeonBriefOuterClass.OtherCustomDungeonBrief>();
                mutable_bitField0_ |= 0x00000001;
              }
              customDungeonList_.add(
                  input.readMessage(emu.grasscutter.net.proto.OtherCustomDungeonBriefOuterClass.OtherCustomDungeonBrief.parser(), extensionRegistry));
              break;
            }
            case 112: {

              retcode_ = input.readInt32();
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
          customDungeonList_ = java.util.Collections.unmodifiableList(customDungeonList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GetStoreCustomDungeonRspOuterClass.internal_static_GetStoreCustomDungeonRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GetStoreCustomDungeonRspOuterClass.internal_static_GetStoreCustomDungeonRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GetStoreCustomDungeonRspOuterClass.GetStoreCustomDungeonRsp.class, emu.grasscutter.net.proto.GetStoreCustomDungeonRspOuterClass.GetStoreCustomDungeonRsp.Builder.class);
    }

    public static final int CUSTOM_DUNGEON_LIST_FIELD_NUMBER = 10;
    private java.util.List<emu.grasscutter.net.proto.OtherCustomDungeonBriefOuterClass.OtherCustomDungeonBrief> customDungeonList_;
    /**
     * <code>repeated .OtherCustomDungeonBrief custom_dungeon_list = 10;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.OtherCustomDungeonBriefOuterClass.OtherCustomDungeonBrief> getCustomDungeonListList() {
      return customDungeonList_;
    }
    /**
     * <code>repeated .OtherCustomDungeonBrief custom_dungeon_list = 10;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.OtherCustomDungeonBriefOuterClass.OtherCustomDungeonBriefOrBuilder> 
        getCustomDungeonListOrBuilderList() {
      return customDungeonList_;
    }
    /**
     * <code>repeated .OtherCustomDungeonBrief custom_dungeon_list = 10;</code>
     */
    @java.lang.Override
    public int getCustomDungeonListCount() {
      return customDungeonList_.size();
    }
    /**
     * <code>repeated .OtherCustomDungeonBrief custom_dungeon_list = 10;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.OtherCustomDungeonBriefOuterClass.OtherCustomDungeonBrief getCustomDungeonList(int index) {
      return customDungeonList_.get(index);
    }
    /**
     * <code>repeated .OtherCustomDungeonBrief custom_dungeon_list = 10;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.OtherCustomDungeonBriefOuterClass.OtherCustomDungeonBriefOrBuilder getCustomDungeonListOrBuilder(
        int index) {
      return customDungeonList_.get(index);
    }

    public static final int RETCODE_FIELD_NUMBER = 14;
    private int retcode_;
    /**
     * <code>int32 retcode = 14;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
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
      for (int i = 0; i < customDungeonList_.size(); i++) {
        output.writeMessage(10, customDungeonList_.get(i));
      }
      if (retcode_ != 0) {
        output.writeInt32(14, retcode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < customDungeonList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(10, customDungeonList_.get(i));
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(14, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GetStoreCustomDungeonRspOuterClass.GetStoreCustomDungeonRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GetStoreCustomDungeonRspOuterClass.GetStoreCustomDungeonRsp other = (emu.grasscutter.net.proto.GetStoreCustomDungeonRspOuterClass.GetStoreCustomDungeonRsp) obj;

      if (!getCustomDungeonListList()
          .equals(other.getCustomDungeonListList())) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
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
      if (getCustomDungeonListCount() > 0) {
        hash = (37 * hash) + CUSTOM_DUNGEON_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getCustomDungeonListList().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GetStoreCustomDungeonRspOuterClass.GetStoreCustomDungeonRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetStoreCustomDungeonRspOuterClass.GetStoreCustomDungeonRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetStoreCustomDungeonRspOuterClass.GetStoreCustomDungeonRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetStoreCustomDungeonRspOuterClass.GetStoreCustomDungeonRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetStoreCustomDungeonRspOuterClass.GetStoreCustomDungeonRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetStoreCustomDungeonRspOuterClass.GetStoreCustomDungeonRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetStoreCustomDungeonRspOuterClass.GetStoreCustomDungeonRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetStoreCustomDungeonRspOuterClass.GetStoreCustomDungeonRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetStoreCustomDungeonRspOuterClass.GetStoreCustomDungeonRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetStoreCustomDungeonRspOuterClass.GetStoreCustomDungeonRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetStoreCustomDungeonRspOuterClass.GetStoreCustomDungeonRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetStoreCustomDungeonRspOuterClass.GetStoreCustomDungeonRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GetStoreCustomDungeonRspOuterClass.GetStoreCustomDungeonRsp prototype) {
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
     * CmdId: 6249
     * Obf: CILKHMDLLNN
     * </pre>
     *
     * Protobuf type {@code GetStoreCustomDungeonRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetStoreCustomDungeonRsp)
        emu.grasscutter.net.proto.GetStoreCustomDungeonRspOuterClass.GetStoreCustomDungeonRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GetStoreCustomDungeonRspOuterClass.internal_static_GetStoreCustomDungeonRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GetStoreCustomDungeonRspOuterClass.internal_static_GetStoreCustomDungeonRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GetStoreCustomDungeonRspOuterClass.GetStoreCustomDungeonRsp.class, emu.grasscutter.net.proto.GetStoreCustomDungeonRspOuterClass.GetStoreCustomDungeonRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GetStoreCustomDungeonRspOuterClass.GetStoreCustomDungeonRsp.newBuilder()
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
          getCustomDungeonListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (customDungeonListBuilder_ == null) {
          customDungeonList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          customDungeonListBuilder_.clear();
        }
        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GetStoreCustomDungeonRspOuterClass.internal_static_GetStoreCustomDungeonRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetStoreCustomDungeonRspOuterClass.GetStoreCustomDungeonRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GetStoreCustomDungeonRspOuterClass.GetStoreCustomDungeonRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetStoreCustomDungeonRspOuterClass.GetStoreCustomDungeonRsp build() {
        emu.grasscutter.net.proto.GetStoreCustomDungeonRspOuterClass.GetStoreCustomDungeonRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetStoreCustomDungeonRspOuterClass.GetStoreCustomDungeonRsp buildPartial() {
        emu.grasscutter.net.proto.GetStoreCustomDungeonRspOuterClass.GetStoreCustomDungeonRsp result = new emu.grasscutter.net.proto.GetStoreCustomDungeonRspOuterClass.GetStoreCustomDungeonRsp(this);
        int from_bitField0_ = bitField0_;
        if (customDungeonListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            customDungeonList_ = java.util.Collections.unmodifiableList(customDungeonList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.customDungeonList_ = customDungeonList_;
        } else {
          result.customDungeonList_ = customDungeonListBuilder_.build();
        }
        result.retcode_ = retcode_;
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
        if (other instanceof emu.grasscutter.net.proto.GetStoreCustomDungeonRspOuterClass.GetStoreCustomDungeonRsp) {
          return mergeFrom((emu.grasscutter.net.proto.GetStoreCustomDungeonRspOuterClass.GetStoreCustomDungeonRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GetStoreCustomDungeonRspOuterClass.GetStoreCustomDungeonRsp other) {
        if (other == emu.grasscutter.net.proto.GetStoreCustomDungeonRspOuterClass.GetStoreCustomDungeonRsp.getDefaultInstance()) return this;
        if (customDungeonListBuilder_ == null) {
          if (!other.customDungeonList_.isEmpty()) {
            if (customDungeonList_.isEmpty()) {
              customDungeonList_ = other.customDungeonList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureCustomDungeonListIsMutable();
              customDungeonList_.addAll(other.customDungeonList_);
            }
            onChanged();
          }
        } else {
          if (!other.customDungeonList_.isEmpty()) {
            if (customDungeonListBuilder_.isEmpty()) {
              customDungeonListBuilder_.dispose();
              customDungeonListBuilder_ = null;
              customDungeonList_ = other.customDungeonList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              customDungeonListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getCustomDungeonListFieldBuilder() : null;
            } else {
              customDungeonListBuilder_.addAllMessages(other.customDungeonList_);
            }
          }
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
        emu.grasscutter.net.proto.GetStoreCustomDungeonRspOuterClass.GetStoreCustomDungeonRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GetStoreCustomDungeonRspOuterClass.GetStoreCustomDungeonRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.OtherCustomDungeonBriefOuterClass.OtherCustomDungeonBrief> customDungeonList_ =
        java.util.Collections.emptyList();
      private void ensureCustomDungeonListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          customDungeonList_ = new java.util.ArrayList<emu.grasscutter.net.proto.OtherCustomDungeonBriefOuterClass.OtherCustomDungeonBrief>(customDungeonList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.OtherCustomDungeonBriefOuterClass.OtherCustomDungeonBrief, emu.grasscutter.net.proto.OtherCustomDungeonBriefOuterClass.OtherCustomDungeonBrief.Builder, emu.grasscutter.net.proto.OtherCustomDungeonBriefOuterClass.OtherCustomDungeonBriefOrBuilder> customDungeonListBuilder_;

      /**
       * <code>repeated .OtherCustomDungeonBrief custom_dungeon_list = 10;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.OtherCustomDungeonBriefOuterClass.OtherCustomDungeonBrief> getCustomDungeonListList() {
        if (customDungeonListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(customDungeonList_);
        } else {
          return customDungeonListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .OtherCustomDungeonBrief custom_dungeon_list = 10;</code>
       */
      public int getCustomDungeonListCount() {
        if (customDungeonListBuilder_ == null) {
          return customDungeonList_.size();
        } else {
          return customDungeonListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .OtherCustomDungeonBrief custom_dungeon_list = 10;</code>
       */
      public emu.grasscutter.net.proto.OtherCustomDungeonBriefOuterClass.OtherCustomDungeonBrief getCustomDungeonList(int index) {
        if (customDungeonListBuilder_ == null) {
          return customDungeonList_.get(index);
        } else {
          return customDungeonListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .OtherCustomDungeonBrief custom_dungeon_list = 10;</code>
       */
      public Builder setCustomDungeonList(
          int index, emu.grasscutter.net.proto.OtherCustomDungeonBriefOuterClass.OtherCustomDungeonBrief value) {
        if (customDungeonListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCustomDungeonListIsMutable();
          customDungeonList_.set(index, value);
          onChanged();
        } else {
          customDungeonListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .OtherCustomDungeonBrief custom_dungeon_list = 10;</code>
       */
      public Builder setCustomDungeonList(
          int index, emu.grasscutter.net.proto.OtherCustomDungeonBriefOuterClass.OtherCustomDungeonBrief.Builder builderForValue) {
        if (customDungeonListBuilder_ == null) {
          ensureCustomDungeonListIsMutable();
          customDungeonList_.set(index, builderForValue.build());
          onChanged();
        } else {
          customDungeonListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .OtherCustomDungeonBrief custom_dungeon_list = 10;</code>
       */
      public Builder addCustomDungeonList(emu.grasscutter.net.proto.OtherCustomDungeonBriefOuterClass.OtherCustomDungeonBrief value) {
        if (customDungeonListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCustomDungeonListIsMutable();
          customDungeonList_.add(value);
          onChanged();
        } else {
          customDungeonListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .OtherCustomDungeonBrief custom_dungeon_list = 10;</code>
       */
      public Builder addCustomDungeonList(
          int index, emu.grasscutter.net.proto.OtherCustomDungeonBriefOuterClass.OtherCustomDungeonBrief value) {
        if (customDungeonListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCustomDungeonListIsMutable();
          customDungeonList_.add(index, value);
          onChanged();
        } else {
          customDungeonListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .OtherCustomDungeonBrief custom_dungeon_list = 10;</code>
       */
      public Builder addCustomDungeonList(
          emu.grasscutter.net.proto.OtherCustomDungeonBriefOuterClass.OtherCustomDungeonBrief.Builder builderForValue) {
        if (customDungeonListBuilder_ == null) {
          ensureCustomDungeonListIsMutable();
          customDungeonList_.add(builderForValue.build());
          onChanged();
        } else {
          customDungeonListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .OtherCustomDungeonBrief custom_dungeon_list = 10;</code>
       */
      public Builder addCustomDungeonList(
          int index, emu.grasscutter.net.proto.OtherCustomDungeonBriefOuterClass.OtherCustomDungeonBrief.Builder builderForValue) {
        if (customDungeonListBuilder_ == null) {
          ensureCustomDungeonListIsMutable();
          customDungeonList_.add(index, builderForValue.build());
          onChanged();
        } else {
          customDungeonListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .OtherCustomDungeonBrief custom_dungeon_list = 10;</code>
       */
      public Builder addAllCustomDungeonList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.OtherCustomDungeonBriefOuterClass.OtherCustomDungeonBrief> values) {
        if (customDungeonListBuilder_ == null) {
          ensureCustomDungeonListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, customDungeonList_);
          onChanged();
        } else {
          customDungeonListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .OtherCustomDungeonBrief custom_dungeon_list = 10;</code>
       */
      public Builder clearCustomDungeonList() {
        if (customDungeonListBuilder_ == null) {
          customDungeonList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          customDungeonListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .OtherCustomDungeonBrief custom_dungeon_list = 10;</code>
       */
      public Builder removeCustomDungeonList(int index) {
        if (customDungeonListBuilder_ == null) {
          ensureCustomDungeonListIsMutable();
          customDungeonList_.remove(index);
          onChanged();
        } else {
          customDungeonListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .OtherCustomDungeonBrief custom_dungeon_list = 10;</code>
       */
      public emu.grasscutter.net.proto.OtherCustomDungeonBriefOuterClass.OtherCustomDungeonBrief.Builder getCustomDungeonListBuilder(
          int index) {
        return getCustomDungeonListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .OtherCustomDungeonBrief custom_dungeon_list = 10;</code>
       */
      public emu.grasscutter.net.proto.OtherCustomDungeonBriefOuterClass.OtherCustomDungeonBriefOrBuilder getCustomDungeonListOrBuilder(
          int index) {
        if (customDungeonListBuilder_ == null) {
          return customDungeonList_.get(index);  } else {
          return customDungeonListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .OtherCustomDungeonBrief custom_dungeon_list = 10;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.OtherCustomDungeonBriefOuterClass.OtherCustomDungeonBriefOrBuilder> 
           getCustomDungeonListOrBuilderList() {
        if (customDungeonListBuilder_ != null) {
          return customDungeonListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(customDungeonList_);
        }
      }
      /**
       * <code>repeated .OtherCustomDungeonBrief custom_dungeon_list = 10;</code>
       */
      public emu.grasscutter.net.proto.OtherCustomDungeonBriefOuterClass.OtherCustomDungeonBrief.Builder addCustomDungeonListBuilder() {
        return getCustomDungeonListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.OtherCustomDungeonBriefOuterClass.OtherCustomDungeonBrief.getDefaultInstance());
      }
      /**
       * <code>repeated .OtherCustomDungeonBrief custom_dungeon_list = 10;</code>
       */
      public emu.grasscutter.net.proto.OtherCustomDungeonBriefOuterClass.OtherCustomDungeonBrief.Builder addCustomDungeonListBuilder(
          int index) {
        return getCustomDungeonListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.OtherCustomDungeonBriefOuterClass.OtherCustomDungeonBrief.getDefaultInstance());
      }
      /**
       * <code>repeated .OtherCustomDungeonBrief custom_dungeon_list = 10;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.OtherCustomDungeonBriefOuterClass.OtherCustomDungeonBrief.Builder> 
           getCustomDungeonListBuilderList() {
        return getCustomDungeonListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.OtherCustomDungeonBriefOuterClass.OtherCustomDungeonBrief, emu.grasscutter.net.proto.OtherCustomDungeonBriefOuterClass.OtherCustomDungeonBrief.Builder, emu.grasscutter.net.proto.OtherCustomDungeonBriefOuterClass.OtherCustomDungeonBriefOrBuilder> 
          getCustomDungeonListFieldBuilder() {
        if (customDungeonListBuilder_ == null) {
          customDungeonListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.OtherCustomDungeonBriefOuterClass.OtherCustomDungeonBrief, emu.grasscutter.net.proto.OtherCustomDungeonBriefOuterClass.OtherCustomDungeonBrief.Builder, emu.grasscutter.net.proto.OtherCustomDungeonBriefOuterClass.OtherCustomDungeonBriefOrBuilder>(
                  customDungeonList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          customDungeonList_ = null;
        }
        return customDungeonListBuilder_;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 14;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 14;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GetStoreCustomDungeonRsp)
    }

    // @@protoc_insertion_point(class_scope:GetStoreCustomDungeonRsp)
    private static final emu.grasscutter.net.proto.GetStoreCustomDungeonRspOuterClass.GetStoreCustomDungeonRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GetStoreCustomDungeonRspOuterClass.GetStoreCustomDungeonRsp();
    }

    public static emu.grasscutter.net.proto.GetStoreCustomDungeonRspOuterClass.GetStoreCustomDungeonRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetStoreCustomDungeonRsp>
        PARSER = new com.google.protobuf.AbstractParser<GetStoreCustomDungeonRsp>() {
      @java.lang.Override
      public GetStoreCustomDungeonRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetStoreCustomDungeonRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GetStoreCustomDungeonRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetStoreCustomDungeonRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GetStoreCustomDungeonRspOuterClass.GetStoreCustomDungeonRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetStoreCustomDungeonRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetStoreCustomDungeonRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036GetStoreCustomDungeonRsp.proto\032\035OtherC" +
      "ustomDungeonBrief.proto\"b\n\030GetStoreCusto" +
      "mDungeonRsp\0225\n\023custom_dungeon_list\030\n \003(\013" +
      "2\030.OtherCustomDungeonBrief\022\017\n\007retcode\030\016 " +
      "\001(\005B\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.OtherCustomDungeonBriefOuterClass.getDescriptor(),
        });
    internal_static_GetStoreCustomDungeonRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetStoreCustomDungeonRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetStoreCustomDungeonRsp_descriptor,
        new java.lang.String[] { "CustomDungeonList", "Retcode", });
    emu.grasscutter.net.proto.OtherCustomDungeonBriefOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
