// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGLevelChallengeFinishNotify.proto

package emu.grasscutter.net.proto;

public final class GCGLevelChallengeFinishNotifyOuterClass {
  private GCGLevelChallengeFinishNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGLevelChallengeFinishNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGLevelChallengeFinishNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 finished_challenge_id_list = 15;</code>
     * @return A list containing the finishedChallengeIdList.
     */
    java.util.List<java.lang.Integer> getFinishedChallengeIdListList();
    /**
     * <code>repeated uint32 finished_challenge_id_list = 15;</code>
     * @return The count of finishedChallengeIdList.
     */
    int getFinishedChallengeIdListCount();
    /**
     * <code>repeated uint32 finished_challenge_id_list = 15;</code>
     * @param index The index of the element to return.
     * @return The finishedChallengeIdList at the given index.
     */
    int getFinishedChallengeIdList(int index);

    /**
     * <code>uint32 level_id = 1;</code>
     * @return The levelId.
     */
    int getLevelId();
  }
  /**
   * <pre>
   * CmdId: 7207
   * Obf: DCGKGHOFDMC
   * </pre>
   *
   * Protobuf type {@code GCGLevelChallengeFinishNotify}
   */
  public static final class GCGLevelChallengeFinishNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGLevelChallengeFinishNotify)
      GCGLevelChallengeFinishNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGLevelChallengeFinishNotify.newBuilder() to construct.
    private GCGLevelChallengeFinishNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGLevelChallengeFinishNotify() {
      finishedChallengeIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGLevelChallengeFinishNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GCGLevelChallengeFinishNotify(
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
            case 8: {

              levelId_ = input.readUInt32();
              break;
            }
            case 120: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                finishedChallengeIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              finishedChallengeIdList_.addInt(input.readUInt32());
              break;
            }
            case 122: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                finishedChallengeIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                finishedChallengeIdList_.addInt(input.readUInt32());
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
          finishedChallengeIdList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GCGLevelChallengeFinishNotifyOuterClass.internal_static_GCGLevelChallengeFinishNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GCGLevelChallengeFinishNotifyOuterClass.internal_static_GCGLevelChallengeFinishNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GCGLevelChallengeFinishNotifyOuterClass.GCGLevelChallengeFinishNotify.class, emu.grasscutter.net.proto.GCGLevelChallengeFinishNotifyOuterClass.GCGLevelChallengeFinishNotify.Builder.class);
    }

    public static final int FINISHED_CHALLENGE_ID_LIST_FIELD_NUMBER = 15;
    private com.google.protobuf.Internal.IntList finishedChallengeIdList_;
    /**
     * <code>repeated uint32 finished_challenge_id_list = 15;</code>
     * @return A list containing the finishedChallengeIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getFinishedChallengeIdListList() {
      return finishedChallengeIdList_;
    }
    /**
     * <code>repeated uint32 finished_challenge_id_list = 15;</code>
     * @return The count of finishedChallengeIdList.
     */
    public int getFinishedChallengeIdListCount() {
      return finishedChallengeIdList_.size();
    }
    /**
     * <code>repeated uint32 finished_challenge_id_list = 15;</code>
     * @param index The index of the element to return.
     * @return The finishedChallengeIdList at the given index.
     */
    public int getFinishedChallengeIdList(int index) {
      return finishedChallengeIdList_.getInt(index);
    }
    private int finishedChallengeIdListMemoizedSerializedSize = -1;

    public static final int LEVEL_ID_FIELD_NUMBER = 1;
    private int levelId_;
    /**
     * <code>uint32 level_id = 1;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
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
      getSerializedSize();
      if (levelId_ != 0) {
        output.writeUInt32(1, levelId_);
      }
      if (getFinishedChallengeIdListList().size() > 0) {
        output.writeUInt32NoTag(122);
        output.writeUInt32NoTag(finishedChallengeIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < finishedChallengeIdList_.size(); i++) {
        output.writeUInt32NoTag(finishedChallengeIdList_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, levelId_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < finishedChallengeIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(finishedChallengeIdList_.getInt(i));
        }
        size += dataSize;
        if (!getFinishedChallengeIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        finishedChallengeIdListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.GCGLevelChallengeFinishNotifyOuterClass.GCGLevelChallengeFinishNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GCGLevelChallengeFinishNotifyOuterClass.GCGLevelChallengeFinishNotify other = (emu.grasscutter.net.proto.GCGLevelChallengeFinishNotifyOuterClass.GCGLevelChallengeFinishNotify) obj;

      if (!getFinishedChallengeIdListList()
          .equals(other.getFinishedChallengeIdListList())) return false;
      if (getLevelId()
          != other.getLevelId()) return false;
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
      if (getFinishedChallengeIdListCount() > 0) {
        hash = (37 * hash) + FINISHED_CHALLENGE_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getFinishedChallengeIdListList().hashCode();
      }
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GCGLevelChallengeFinishNotifyOuterClass.GCGLevelChallengeFinishNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGLevelChallengeFinishNotifyOuterClass.GCGLevelChallengeFinishNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGLevelChallengeFinishNotifyOuterClass.GCGLevelChallengeFinishNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGLevelChallengeFinishNotifyOuterClass.GCGLevelChallengeFinishNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGLevelChallengeFinishNotifyOuterClass.GCGLevelChallengeFinishNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGLevelChallengeFinishNotifyOuterClass.GCGLevelChallengeFinishNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGLevelChallengeFinishNotifyOuterClass.GCGLevelChallengeFinishNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGLevelChallengeFinishNotifyOuterClass.GCGLevelChallengeFinishNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGLevelChallengeFinishNotifyOuterClass.GCGLevelChallengeFinishNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGLevelChallengeFinishNotifyOuterClass.GCGLevelChallengeFinishNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGLevelChallengeFinishNotifyOuterClass.GCGLevelChallengeFinishNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGLevelChallengeFinishNotifyOuterClass.GCGLevelChallengeFinishNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GCGLevelChallengeFinishNotifyOuterClass.GCGLevelChallengeFinishNotify prototype) {
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
     * CmdId: 7207
     * Obf: DCGKGHOFDMC
     * </pre>
     *
     * Protobuf type {@code GCGLevelChallengeFinishNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGLevelChallengeFinishNotify)
        emu.grasscutter.net.proto.GCGLevelChallengeFinishNotifyOuterClass.GCGLevelChallengeFinishNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GCGLevelChallengeFinishNotifyOuterClass.internal_static_GCGLevelChallengeFinishNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GCGLevelChallengeFinishNotifyOuterClass.internal_static_GCGLevelChallengeFinishNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GCGLevelChallengeFinishNotifyOuterClass.GCGLevelChallengeFinishNotify.class, emu.grasscutter.net.proto.GCGLevelChallengeFinishNotifyOuterClass.GCGLevelChallengeFinishNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GCGLevelChallengeFinishNotifyOuterClass.GCGLevelChallengeFinishNotify.newBuilder()
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
        finishedChallengeIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        levelId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GCGLevelChallengeFinishNotifyOuterClass.internal_static_GCGLevelChallengeFinishNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGLevelChallengeFinishNotifyOuterClass.GCGLevelChallengeFinishNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GCGLevelChallengeFinishNotifyOuterClass.GCGLevelChallengeFinishNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGLevelChallengeFinishNotifyOuterClass.GCGLevelChallengeFinishNotify build() {
        emu.grasscutter.net.proto.GCGLevelChallengeFinishNotifyOuterClass.GCGLevelChallengeFinishNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGLevelChallengeFinishNotifyOuterClass.GCGLevelChallengeFinishNotify buildPartial() {
        emu.grasscutter.net.proto.GCGLevelChallengeFinishNotifyOuterClass.GCGLevelChallengeFinishNotify result = new emu.grasscutter.net.proto.GCGLevelChallengeFinishNotifyOuterClass.GCGLevelChallengeFinishNotify(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          finishedChallengeIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.finishedChallengeIdList_ = finishedChallengeIdList_;
        result.levelId_ = levelId_;
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
        if (other instanceof emu.grasscutter.net.proto.GCGLevelChallengeFinishNotifyOuterClass.GCGLevelChallengeFinishNotify) {
          return mergeFrom((emu.grasscutter.net.proto.GCGLevelChallengeFinishNotifyOuterClass.GCGLevelChallengeFinishNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GCGLevelChallengeFinishNotifyOuterClass.GCGLevelChallengeFinishNotify other) {
        if (other == emu.grasscutter.net.proto.GCGLevelChallengeFinishNotifyOuterClass.GCGLevelChallengeFinishNotify.getDefaultInstance()) return this;
        if (!other.finishedChallengeIdList_.isEmpty()) {
          if (finishedChallengeIdList_.isEmpty()) {
            finishedChallengeIdList_ = other.finishedChallengeIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFinishedChallengeIdListIsMutable();
            finishedChallengeIdList_.addAll(other.finishedChallengeIdList_);
          }
          onChanged();
        }
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
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
        emu.grasscutter.net.proto.GCGLevelChallengeFinishNotifyOuterClass.GCGLevelChallengeFinishNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GCGLevelChallengeFinishNotifyOuterClass.GCGLevelChallengeFinishNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList finishedChallengeIdList_ = emptyIntList();
      private void ensureFinishedChallengeIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          finishedChallengeIdList_ = mutableCopy(finishedChallengeIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 finished_challenge_id_list = 15;</code>
       * @return A list containing the finishedChallengeIdList.
       */
      public java.util.List<java.lang.Integer>
          getFinishedChallengeIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(finishedChallengeIdList_) : finishedChallengeIdList_;
      }
      /**
       * <code>repeated uint32 finished_challenge_id_list = 15;</code>
       * @return The count of finishedChallengeIdList.
       */
      public int getFinishedChallengeIdListCount() {
        return finishedChallengeIdList_.size();
      }
      /**
       * <code>repeated uint32 finished_challenge_id_list = 15;</code>
       * @param index The index of the element to return.
       * @return The finishedChallengeIdList at the given index.
       */
      public int getFinishedChallengeIdList(int index) {
        return finishedChallengeIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 finished_challenge_id_list = 15;</code>
       * @param index The index to set the value at.
       * @param value The finishedChallengeIdList to set.
       * @return This builder for chaining.
       */
      public Builder setFinishedChallengeIdList(
          int index, int value) {
        ensureFinishedChallengeIdListIsMutable();
        finishedChallengeIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 finished_challenge_id_list = 15;</code>
       * @param value The finishedChallengeIdList to add.
       * @return This builder for chaining.
       */
      public Builder addFinishedChallengeIdList(int value) {
        ensureFinishedChallengeIdListIsMutable();
        finishedChallengeIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 finished_challenge_id_list = 15;</code>
       * @param values The finishedChallengeIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllFinishedChallengeIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureFinishedChallengeIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, finishedChallengeIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 finished_challenge_id_list = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearFinishedChallengeIdList() {
        finishedChallengeIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 1;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 1;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        
        levelId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GCGLevelChallengeFinishNotify)
    }

    // @@protoc_insertion_point(class_scope:GCGLevelChallengeFinishNotify)
    private static final emu.grasscutter.net.proto.GCGLevelChallengeFinishNotifyOuterClass.GCGLevelChallengeFinishNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GCGLevelChallengeFinishNotifyOuterClass.GCGLevelChallengeFinishNotify();
    }

    public static emu.grasscutter.net.proto.GCGLevelChallengeFinishNotifyOuterClass.GCGLevelChallengeFinishNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGLevelChallengeFinishNotify>
        PARSER = new com.google.protobuf.AbstractParser<GCGLevelChallengeFinishNotify>() {
      @java.lang.Override
      public GCGLevelChallengeFinishNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GCGLevelChallengeFinishNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GCGLevelChallengeFinishNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGLevelChallengeFinishNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GCGLevelChallengeFinishNotifyOuterClass.GCGLevelChallengeFinishNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGLevelChallengeFinishNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGLevelChallengeFinishNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#GCGLevelChallengeFinishNotify.proto\"U\n" +
      "\035GCGLevelChallengeFinishNotify\022\"\n\032finish" +
      "ed_challenge_id_list\030\017 \003(\r\022\020\n\010level_id\030\001" +
      " \001(\rB\033\n\031emu.grasscutter.net.protob\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GCGLevelChallengeFinishNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGLevelChallengeFinishNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGLevelChallengeFinishNotify_descriptor,
        new java.lang.String[] { "FinishedChallengeIdList", "LevelId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
