// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetQuestTalkHistoryRsp.proto

package emu.grasscutter.net.proto;

public final class GetQuestTalkHistoryRspOuterClass {
  private GetQuestTalkHistoryRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetQuestTalkHistoryRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetQuestTalkHistoryRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 14;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 parent_quest_id = 9;</code>
     * @return The parentQuestId.
     */
    int getParentQuestId();

    /**
     * <code>repeated uint32 talk_id_list = 5;</code>
     * @return A list containing the talkIdList.
     */
    java.util.List<java.lang.Integer> getTalkIdListList();
    /**
     * <code>repeated uint32 talk_id_list = 5;</code>
     * @return The count of talkIdList.
     */
    int getTalkIdListCount();
    /**
     * <code>repeated uint32 talk_id_list = 5;</code>
     * @param index The index of the element to return.
     * @return The talkIdList at the given index.
     */
    int getTalkIdList(int index);
  }
  /**
   * <pre>
   * Name: MMOIOJJOHGJ
   * CmdId: 465
   * </pre>
   *
   * Protobuf type {@code GetQuestTalkHistoryRsp}
   */
  public static final class GetQuestTalkHistoryRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetQuestTalkHistoryRsp)
      GetQuestTalkHistoryRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetQuestTalkHistoryRsp.newBuilder() to construct.
    private GetQuestTalkHistoryRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetQuestTalkHistoryRsp() {
      talkIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetQuestTalkHistoryRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GetQuestTalkHistoryRsp(
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
            case 40: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                talkIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              talkIdList_.addInt(input.readUInt32());
              break;
            }
            case 42: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                talkIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                talkIdList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 72: {

              parentQuestId_ = input.readUInt32();
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
          talkIdList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GetQuestTalkHistoryRspOuterClass.internal_static_GetQuestTalkHistoryRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GetQuestTalkHistoryRspOuterClass.internal_static_GetQuestTalkHistoryRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GetQuestTalkHistoryRspOuterClass.GetQuestTalkHistoryRsp.class, emu.grasscutter.net.proto.GetQuestTalkHistoryRspOuterClass.GetQuestTalkHistoryRsp.Builder.class);
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

    public static final int PARENT_QUEST_ID_FIELD_NUMBER = 9;
    private int parentQuestId_;
    /**
     * <code>uint32 parent_quest_id = 9;</code>
     * @return The parentQuestId.
     */
    @java.lang.Override
    public int getParentQuestId() {
      return parentQuestId_;
    }

    public static final int TALK_ID_LIST_FIELD_NUMBER = 5;
    private com.google.protobuf.Internal.IntList talkIdList_;
    /**
     * <code>repeated uint32 talk_id_list = 5;</code>
     * @return A list containing the talkIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getTalkIdListList() {
      return talkIdList_;
    }
    /**
     * <code>repeated uint32 talk_id_list = 5;</code>
     * @return The count of talkIdList.
     */
    public int getTalkIdListCount() {
      return talkIdList_.size();
    }
    /**
     * <code>repeated uint32 talk_id_list = 5;</code>
     * @param index The index of the element to return.
     * @return The talkIdList at the given index.
     */
    public int getTalkIdList(int index) {
      return talkIdList_.getInt(index);
    }
    private int talkIdListMemoizedSerializedSize = -1;

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
      if (getTalkIdListList().size() > 0) {
        output.writeUInt32NoTag(42);
        output.writeUInt32NoTag(talkIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < talkIdList_.size(); i++) {
        output.writeUInt32NoTag(talkIdList_.getInt(i));
      }
      if (parentQuestId_ != 0) {
        output.writeUInt32(9, parentQuestId_);
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
      {
        int dataSize = 0;
        for (int i = 0; i < talkIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(talkIdList_.getInt(i));
        }
        size += dataSize;
        if (!getTalkIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        talkIdListMemoizedSerializedSize = dataSize;
      }
      if (parentQuestId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, parentQuestId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GetQuestTalkHistoryRspOuterClass.GetQuestTalkHistoryRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GetQuestTalkHistoryRspOuterClass.GetQuestTalkHistoryRsp other = (emu.grasscutter.net.proto.GetQuestTalkHistoryRspOuterClass.GetQuestTalkHistoryRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (getParentQuestId()
          != other.getParentQuestId()) return false;
      if (!getTalkIdListList()
          .equals(other.getTalkIdListList())) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + PARENT_QUEST_ID_FIELD_NUMBER;
      hash = (53 * hash) + getParentQuestId();
      if (getTalkIdListCount() > 0) {
        hash = (37 * hash) + TALK_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getTalkIdListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GetQuestTalkHistoryRspOuterClass.GetQuestTalkHistoryRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetQuestTalkHistoryRspOuterClass.GetQuestTalkHistoryRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetQuestTalkHistoryRspOuterClass.GetQuestTalkHistoryRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetQuestTalkHistoryRspOuterClass.GetQuestTalkHistoryRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetQuestTalkHistoryRspOuterClass.GetQuestTalkHistoryRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetQuestTalkHistoryRspOuterClass.GetQuestTalkHistoryRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetQuestTalkHistoryRspOuterClass.GetQuestTalkHistoryRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetQuestTalkHistoryRspOuterClass.GetQuestTalkHistoryRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetQuestTalkHistoryRspOuterClass.GetQuestTalkHistoryRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetQuestTalkHistoryRspOuterClass.GetQuestTalkHistoryRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetQuestTalkHistoryRspOuterClass.GetQuestTalkHistoryRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetQuestTalkHistoryRspOuterClass.GetQuestTalkHistoryRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GetQuestTalkHistoryRspOuterClass.GetQuestTalkHistoryRsp prototype) {
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
     * Name: MMOIOJJOHGJ
     * CmdId: 465
     * </pre>
     *
     * Protobuf type {@code GetQuestTalkHistoryRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetQuestTalkHistoryRsp)
        emu.grasscutter.net.proto.GetQuestTalkHistoryRspOuterClass.GetQuestTalkHistoryRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GetQuestTalkHistoryRspOuterClass.internal_static_GetQuestTalkHistoryRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GetQuestTalkHistoryRspOuterClass.internal_static_GetQuestTalkHistoryRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GetQuestTalkHistoryRspOuterClass.GetQuestTalkHistoryRsp.class, emu.grasscutter.net.proto.GetQuestTalkHistoryRspOuterClass.GetQuestTalkHistoryRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GetQuestTalkHistoryRspOuterClass.GetQuestTalkHistoryRsp.newBuilder()
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
        retcode_ = 0;

        parentQuestId_ = 0;

        talkIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GetQuestTalkHistoryRspOuterClass.internal_static_GetQuestTalkHistoryRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetQuestTalkHistoryRspOuterClass.GetQuestTalkHistoryRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GetQuestTalkHistoryRspOuterClass.GetQuestTalkHistoryRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetQuestTalkHistoryRspOuterClass.GetQuestTalkHistoryRsp build() {
        emu.grasscutter.net.proto.GetQuestTalkHistoryRspOuterClass.GetQuestTalkHistoryRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetQuestTalkHistoryRspOuterClass.GetQuestTalkHistoryRsp buildPartial() {
        emu.grasscutter.net.proto.GetQuestTalkHistoryRspOuterClass.GetQuestTalkHistoryRsp result = new emu.grasscutter.net.proto.GetQuestTalkHistoryRspOuterClass.GetQuestTalkHistoryRsp(this);
        int from_bitField0_ = bitField0_;
        result.retcode_ = retcode_;
        result.parentQuestId_ = parentQuestId_;
        if (((bitField0_ & 0x00000001) != 0)) {
          talkIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.talkIdList_ = talkIdList_;
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
        if (other instanceof emu.grasscutter.net.proto.GetQuestTalkHistoryRspOuterClass.GetQuestTalkHistoryRsp) {
          return mergeFrom((emu.grasscutter.net.proto.GetQuestTalkHistoryRspOuterClass.GetQuestTalkHistoryRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GetQuestTalkHistoryRspOuterClass.GetQuestTalkHistoryRsp other) {
        if (other == emu.grasscutter.net.proto.GetQuestTalkHistoryRspOuterClass.GetQuestTalkHistoryRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getParentQuestId() != 0) {
          setParentQuestId(other.getParentQuestId());
        }
        if (!other.talkIdList_.isEmpty()) {
          if (talkIdList_.isEmpty()) {
            talkIdList_ = other.talkIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTalkIdListIsMutable();
            talkIdList_.addAll(other.talkIdList_);
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
        emu.grasscutter.net.proto.GetQuestTalkHistoryRspOuterClass.GetQuestTalkHistoryRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GetQuestTalkHistoryRspOuterClass.GetQuestTalkHistoryRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

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

      private int parentQuestId_ ;
      /**
       * <code>uint32 parent_quest_id = 9;</code>
       * @return The parentQuestId.
       */
      @java.lang.Override
      public int getParentQuestId() {
        return parentQuestId_;
      }
      /**
       * <code>uint32 parent_quest_id = 9;</code>
       * @param value The parentQuestId to set.
       * @return This builder for chaining.
       */
      public Builder setParentQuestId(int value) {
        
        parentQuestId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 parent_quest_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearParentQuestId() {
        
        parentQuestId_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList talkIdList_ = emptyIntList();
      private void ensureTalkIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          talkIdList_ = mutableCopy(talkIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 talk_id_list = 5;</code>
       * @return A list containing the talkIdList.
       */
      public java.util.List<java.lang.Integer>
          getTalkIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(talkIdList_) : talkIdList_;
      }
      /**
       * <code>repeated uint32 talk_id_list = 5;</code>
       * @return The count of talkIdList.
       */
      public int getTalkIdListCount() {
        return talkIdList_.size();
      }
      /**
       * <code>repeated uint32 talk_id_list = 5;</code>
       * @param index The index of the element to return.
       * @return The talkIdList at the given index.
       */
      public int getTalkIdList(int index) {
        return talkIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 talk_id_list = 5;</code>
       * @param index The index to set the value at.
       * @param value The talkIdList to set.
       * @return This builder for chaining.
       */
      public Builder setTalkIdList(
          int index, int value) {
        ensureTalkIdListIsMutable();
        talkIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 talk_id_list = 5;</code>
       * @param value The talkIdList to add.
       * @return This builder for chaining.
       */
      public Builder addTalkIdList(int value) {
        ensureTalkIdListIsMutable();
        talkIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 talk_id_list = 5;</code>
       * @param values The talkIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllTalkIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureTalkIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, talkIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 talk_id_list = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearTalkIdList() {
        talkIdList_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:GetQuestTalkHistoryRsp)
    }

    // @@protoc_insertion_point(class_scope:GetQuestTalkHistoryRsp)
    private static final emu.grasscutter.net.proto.GetQuestTalkHistoryRspOuterClass.GetQuestTalkHistoryRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GetQuestTalkHistoryRspOuterClass.GetQuestTalkHistoryRsp();
    }

    public static emu.grasscutter.net.proto.GetQuestTalkHistoryRspOuterClass.GetQuestTalkHistoryRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetQuestTalkHistoryRsp>
        PARSER = new com.google.protobuf.AbstractParser<GetQuestTalkHistoryRsp>() {
      @java.lang.Override
      public GetQuestTalkHistoryRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetQuestTalkHistoryRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GetQuestTalkHistoryRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetQuestTalkHistoryRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GetQuestTalkHistoryRspOuterClass.GetQuestTalkHistoryRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetQuestTalkHistoryRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetQuestTalkHistoryRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034GetQuestTalkHistoryRsp.proto\"X\n\026GetQue" +
      "stTalkHistoryRsp\022\017\n\007retcode\030\016 \001(\005\022\027\n\017par" +
      "ent_quest_id\030\t \001(\r\022\024\n\014talk_id_list\030\005 \003(\r" +
      "B\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GetQuestTalkHistoryRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetQuestTalkHistoryRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetQuestTalkHistoryRsp_descriptor,
        new java.lang.String[] { "Retcode", "ParentQuestId", "TalkIdList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
