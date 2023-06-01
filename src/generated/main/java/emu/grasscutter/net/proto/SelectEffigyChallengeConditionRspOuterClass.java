// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SelectEffigyChallengeConditionRsp.proto

package emu.grasscutter.net.proto;

public final class SelectEffigyChallengeConditionRspOuterClass {
  private SelectEffigyChallengeConditionRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SelectEffigyChallengeConditionRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SelectEffigyChallengeConditionRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 9;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 challenge_id = 14;</code>
     * @return The challengeId.
     */
    int getChallengeId();

    /**
     * <code>uint32 difficulty_id = 11;</code>
     * @return The difficultyId.
     */
    int getDifficultyId();

    /**
     * <code>repeated uint32 condition_id_list = 12;</code>
     * @return A list containing the conditionIdList.
     */
    java.util.List<java.lang.Integer> getConditionIdListList();
    /**
     * <code>repeated uint32 condition_id_list = 12;</code>
     * @return The count of conditionIdList.
     */
    int getConditionIdListCount();
    /**
     * <code>repeated uint32 condition_id_list = 12;</code>
     * @param index The index of the element to return.
     * @return The conditionIdList at the given index.
     */
    int getConditionIdList(int index);
  }
  /**
   * <pre>
   * CmdId: 2126
   * Obf: JHMAOLOJNJL
   * </pre>
   *
   * Protobuf type {@code SelectEffigyChallengeConditionRsp}
   */
  public static final class SelectEffigyChallengeConditionRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SelectEffigyChallengeConditionRsp)
      SelectEffigyChallengeConditionRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SelectEffigyChallengeConditionRsp.newBuilder() to construct.
    private SelectEffigyChallengeConditionRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SelectEffigyChallengeConditionRsp() {
      conditionIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SelectEffigyChallengeConditionRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SelectEffigyChallengeConditionRsp(
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
            case 72: {

              retcode_ = input.readInt32();
              break;
            }
            case 88: {

              difficultyId_ = input.readUInt32();
              break;
            }
            case 96: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                conditionIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              conditionIdList_.addInt(input.readUInt32());
              break;
            }
            case 98: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                conditionIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                conditionIdList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 112: {

              challengeId_ = input.readUInt32();
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
          conditionIdList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.SelectEffigyChallengeConditionRspOuterClass.internal_static_SelectEffigyChallengeConditionRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SelectEffigyChallengeConditionRspOuterClass.internal_static_SelectEffigyChallengeConditionRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SelectEffigyChallengeConditionRspOuterClass.SelectEffigyChallengeConditionRsp.class, emu.grasscutter.net.proto.SelectEffigyChallengeConditionRspOuterClass.SelectEffigyChallengeConditionRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 9;
    private int retcode_;
    /**
     * <code>int32 retcode = 9;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int CHALLENGE_ID_FIELD_NUMBER = 14;
    private int challengeId_;
    /**
     * <code>uint32 challenge_id = 14;</code>
     * @return The challengeId.
     */
    @java.lang.Override
    public int getChallengeId() {
      return challengeId_;
    }

    public static final int DIFFICULTY_ID_FIELD_NUMBER = 11;
    private int difficultyId_;
    /**
     * <code>uint32 difficulty_id = 11;</code>
     * @return The difficultyId.
     */
    @java.lang.Override
    public int getDifficultyId() {
      return difficultyId_;
    }

    public static final int CONDITION_ID_LIST_FIELD_NUMBER = 12;
    private com.google.protobuf.Internal.IntList conditionIdList_;
    /**
     * <code>repeated uint32 condition_id_list = 12;</code>
     * @return A list containing the conditionIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getConditionIdListList() {
      return conditionIdList_;
    }
    /**
     * <code>repeated uint32 condition_id_list = 12;</code>
     * @return The count of conditionIdList.
     */
    public int getConditionIdListCount() {
      return conditionIdList_.size();
    }
    /**
     * <code>repeated uint32 condition_id_list = 12;</code>
     * @param index The index of the element to return.
     * @return The conditionIdList at the given index.
     */
    public int getConditionIdList(int index) {
      return conditionIdList_.getInt(index);
    }
    private int conditionIdListMemoizedSerializedSize = -1;

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
      if (retcode_ != 0) {
        output.writeInt32(9, retcode_);
      }
      if (difficultyId_ != 0) {
        output.writeUInt32(11, difficultyId_);
      }
      if (getConditionIdListList().size() > 0) {
        output.writeUInt32NoTag(98);
        output.writeUInt32NoTag(conditionIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < conditionIdList_.size(); i++) {
        output.writeUInt32NoTag(conditionIdList_.getInt(i));
      }
      if (challengeId_ != 0) {
        output.writeUInt32(14, challengeId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(9, retcode_);
      }
      if (difficultyId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, difficultyId_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < conditionIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(conditionIdList_.getInt(i));
        }
        size += dataSize;
        if (!getConditionIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        conditionIdListMemoizedSerializedSize = dataSize;
      }
      if (challengeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, challengeId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.SelectEffigyChallengeConditionRspOuterClass.SelectEffigyChallengeConditionRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SelectEffigyChallengeConditionRspOuterClass.SelectEffigyChallengeConditionRsp other = (emu.grasscutter.net.proto.SelectEffigyChallengeConditionRspOuterClass.SelectEffigyChallengeConditionRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (getChallengeId()
          != other.getChallengeId()) return false;
      if (getDifficultyId()
          != other.getDifficultyId()) return false;
      if (!getConditionIdListList()
          .equals(other.getConditionIdListList())) return false;
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
      hash = (37 * hash) + CHALLENGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getChallengeId();
      hash = (37 * hash) + DIFFICULTY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDifficultyId();
      if (getConditionIdListCount() > 0) {
        hash = (37 * hash) + CONDITION_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getConditionIdListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SelectEffigyChallengeConditionRspOuterClass.SelectEffigyChallengeConditionRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SelectEffigyChallengeConditionRspOuterClass.SelectEffigyChallengeConditionRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SelectEffigyChallengeConditionRspOuterClass.SelectEffigyChallengeConditionRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SelectEffigyChallengeConditionRspOuterClass.SelectEffigyChallengeConditionRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SelectEffigyChallengeConditionRspOuterClass.SelectEffigyChallengeConditionRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SelectEffigyChallengeConditionRspOuterClass.SelectEffigyChallengeConditionRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SelectEffigyChallengeConditionRspOuterClass.SelectEffigyChallengeConditionRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SelectEffigyChallengeConditionRspOuterClass.SelectEffigyChallengeConditionRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SelectEffigyChallengeConditionRspOuterClass.SelectEffigyChallengeConditionRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SelectEffigyChallengeConditionRspOuterClass.SelectEffigyChallengeConditionRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SelectEffigyChallengeConditionRspOuterClass.SelectEffigyChallengeConditionRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SelectEffigyChallengeConditionRspOuterClass.SelectEffigyChallengeConditionRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SelectEffigyChallengeConditionRspOuterClass.SelectEffigyChallengeConditionRsp prototype) {
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
     * CmdId: 2126
     * Obf: JHMAOLOJNJL
     * </pre>
     *
     * Protobuf type {@code SelectEffigyChallengeConditionRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SelectEffigyChallengeConditionRsp)
        emu.grasscutter.net.proto.SelectEffigyChallengeConditionRspOuterClass.SelectEffigyChallengeConditionRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SelectEffigyChallengeConditionRspOuterClass.internal_static_SelectEffigyChallengeConditionRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SelectEffigyChallengeConditionRspOuterClass.internal_static_SelectEffigyChallengeConditionRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SelectEffigyChallengeConditionRspOuterClass.SelectEffigyChallengeConditionRsp.class, emu.grasscutter.net.proto.SelectEffigyChallengeConditionRspOuterClass.SelectEffigyChallengeConditionRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SelectEffigyChallengeConditionRspOuterClass.SelectEffigyChallengeConditionRsp.newBuilder()
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

        challengeId_ = 0;

        difficultyId_ = 0;

        conditionIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SelectEffigyChallengeConditionRspOuterClass.internal_static_SelectEffigyChallengeConditionRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SelectEffigyChallengeConditionRspOuterClass.SelectEffigyChallengeConditionRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SelectEffigyChallengeConditionRspOuterClass.SelectEffigyChallengeConditionRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SelectEffigyChallengeConditionRspOuterClass.SelectEffigyChallengeConditionRsp build() {
        emu.grasscutter.net.proto.SelectEffigyChallengeConditionRspOuterClass.SelectEffigyChallengeConditionRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SelectEffigyChallengeConditionRspOuterClass.SelectEffigyChallengeConditionRsp buildPartial() {
        emu.grasscutter.net.proto.SelectEffigyChallengeConditionRspOuterClass.SelectEffigyChallengeConditionRsp result = new emu.grasscutter.net.proto.SelectEffigyChallengeConditionRspOuterClass.SelectEffigyChallengeConditionRsp(this);
        int from_bitField0_ = bitField0_;
        result.retcode_ = retcode_;
        result.challengeId_ = challengeId_;
        result.difficultyId_ = difficultyId_;
        if (((bitField0_ & 0x00000001) != 0)) {
          conditionIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.conditionIdList_ = conditionIdList_;
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
        if (other instanceof emu.grasscutter.net.proto.SelectEffigyChallengeConditionRspOuterClass.SelectEffigyChallengeConditionRsp) {
          return mergeFrom((emu.grasscutter.net.proto.SelectEffigyChallengeConditionRspOuterClass.SelectEffigyChallengeConditionRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SelectEffigyChallengeConditionRspOuterClass.SelectEffigyChallengeConditionRsp other) {
        if (other == emu.grasscutter.net.proto.SelectEffigyChallengeConditionRspOuterClass.SelectEffigyChallengeConditionRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getChallengeId() != 0) {
          setChallengeId(other.getChallengeId());
        }
        if (other.getDifficultyId() != 0) {
          setDifficultyId(other.getDifficultyId());
        }
        if (!other.conditionIdList_.isEmpty()) {
          if (conditionIdList_.isEmpty()) {
            conditionIdList_ = other.conditionIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureConditionIdListIsMutable();
            conditionIdList_.addAll(other.conditionIdList_);
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
        emu.grasscutter.net.proto.SelectEffigyChallengeConditionRspOuterClass.SelectEffigyChallengeConditionRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SelectEffigyChallengeConditionRspOuterClass.SelectEffigyChallengeConditionRsp) e.getUnfinishedMessage();
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
       * <code>int32 retcode = 9;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 9;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int challengeId_ ;
      /**
       * <code>uint32 challenge_id = 14;</code>
       * @return The challengeId.
       */
      @java.lang.Override
      public int getChallengeId() {
        return challengeId_;
      }
      /**
       * <code>uint32 challenge_id = 14;</code>
       * @param value The challengeId to set.
       * @return This builder for chaining.
       */
      public Builder setChallengeId(int value) {
        
        challengeId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 challenge_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearChallengeId() {
        
        challengeId_ = 0;
        onChanged();
        return this;
      }

      private int difficultyId_ ;
      /**
       * <code>uint32 difficulty_id = 11;</code>
       * @return The difficultyId.
       */
      @java.lang.Override
      public int getDifficultyId() {
        return difficultyId_;
      }
      /**
       * <code>uint32 difficulty_id = 11;</code>
       * @param value The difficultyId to set.
       * @return This builder for chaining.
       */
      public Builder setDifficultyId(int value) {
        
        difficultyId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 difficulty_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearDifficultyId() {
        
        difficultyId_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList conditionIdList_ = emptyIntList();
      private void ensureConditionIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          conditionIdList_ = mutableCopy(conditionIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 condition_id_list = 12;</code>
       * @return A list containing the conditionIdList.
       */
      public java.util.List<java.lang.Integer>
          getConditionIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(conditionIdList_) : conditionIdList_;
      }
      /**
       * <code>repeated uint32 condition_id_list = 12;</code>
       * @return The count of conditionIdList.
       */
      public int getConditionIdListCount() {
        return conditionIdList_.size();
      }
      /**
       * <code>repeated uint32 condition_id_list = 12;</code>
       * @param index The index of the element to return.
       * @return The conditionIdList at the given index.
       */
      public int getConditionIdList(int index) {
        return conditionIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 condition_id_list = 12;</code>
       * @param index The index to set the value at.
       * @param value The conditionIdList to set.
       * @return This builder for chaining.
       */
      public Builder setConditionIdList(
          int index, int value) {
        ensureConditionIdListIsMutable();
        conditionIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 condition_id_list = 12;</code>
       * @param value The conditionIdList to add.
       * @return This builder for chaining.
       */
      public Builder addConditionIdList(int value) {
        ensureConditionIdListIsMutable();
        conditionIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 condition_id_list = 12;</code>
       * @param values The conditionIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllConditionIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureConditionIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, conditionIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 condition_id_list = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearConditionIdList() {
        conditionIdList_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:SelectEffigyChallengeConditionRsp)
    }

    // @@protoc_insertion_point(class_scope:SelectEffigyChallengeConditionRsp)
    private static final emu.grasscutter.net.proto.SelectEffigyChallengeConditionRspOuterClass.SelectEffigyChallengeConditionRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SelectEffigyChallengeConditionRspOuterClass.SelectEffigyChallengeConditionRsp();
    }

    public static emu.grasscutter.net.proto.SelectEffigyChallengeConditionRspOuterClass.SelectEffigyChallengeConditionRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SelectEffigyChallengeConditionRsp>
        PARSER = new com.google.protobuf.AbstractParser<SelectEffigyChallengeConditionRsp>() {
      @java.lang.Override
      public SelectEffigyChallengeConditionRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SelectEffigyChallengeConditionRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SelectEffigyChallengeConditionRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SelectEffigyChallengeConditionRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SelectEffigyChallengeConditionRspOuterClass.SelectEffigyChallengeConditionRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SelectEffigyChallengeConditionRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SelectEffigyChallengeConditionRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'SelectEffigyChallengeConditionRsp.prot" +
      "o\"|\n!SelectEffigyChallengeConditionRsp\022\017" +
      "\n\007retcode\030\t \001(\005\022\024\n\014challenge_id\030\016 \001(\r\022\025\n" +
      "\rdifficulty_id\030\013 \001(\r\022\031\n\021condition_id_lis" +
      "t\030\014 \003(\rB\033\n\031emu.grasscutter.net.protob\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SelectEffigyChallengeConditionRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SelectEffigyChallengeConditionRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SelectEffigyChallengeConditionRsp_descriptor,
        new java.lang.String[] { "Retcode", "ChallengeId", "DifficultyId", "ConditionIdList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
