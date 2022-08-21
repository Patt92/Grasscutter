// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetPlayerAskFriendListRsp.proto

package emu.grasscutter.net.proto;

public final class GetPlayerAskFriendListRspOuterClass {
  private GetPlayerAskFriendListRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetPlayerAskFriendListRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetPlayerAskFriendListRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 13;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>repeated .FriendBrief ask_friend_list = 15;</code>
     */
    java.util.List<emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief> 
        getAskFriendListList();
    /**
     * <code>repeated .FriendBrief ask_friend_list = 15;</code>
     */
    emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief getAskFriendList(int index);
    /**
     * <code>repeated .FriendBrief ask_friend_list = 15;</code>
     */
    int getAskFriendListCount();
    /**
     * <code>repeated .FriendBrief ask_friend_list = 15;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBriefOrBuilder> 
        getAskFriendListOrBuilderList();
    /**
     * <code>repeated .FriendBrief ask_friend_list = 15;</code>
     */
    emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBriefOrBuilder getAskFriendListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * CmdId: 4066
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code GetPlayerAskFriendListRsp}
   */
  public static final class GetPlayerAskFriendListRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetPlayerAskFriendListRsp)
      GetPlayerAskFriendListRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetPlayerAskFriendListRsp.newBuilder() to construct.
    private GetPlayerAskFriendListRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetPlayerAskFriendListRsp() {
      askFriendList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetPlayerAskFriendListRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GetPlayerAskFriendListRsp(
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
            case 104: {

              retcode_ = input.readInt32();
              break;
            }
            case 122: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                askFriendList_ = new java.util.ArrayList<emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief>();
                mutable_bitField0_ |= 0x00000001;
              }
              askFriendList_.add(
                  input.readMessage(emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief.parser(), extensionRegistry));
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
          askFriendList_ = java.util.Collections.unmodifiableList(askFriendList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GetPlayerAskFriendListRspOuterClass.internal_static_GetPlayerAskFriendListRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GetPlayerAskFriendListRspOuterClass.internal_static_GetPlayerAskFriendListRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GetPlayerAskFriendListRspOuterClass.GetPlayerAskFriendListRsp.class, emu.grasscutter.net.proto.GetPlayerAskFriendListRspOuterClass.GetPlayerAskFriendListRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 13;
    private int retcode_;
    /**
     * <code>int32 retcode = 13;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int ASK_FRIEND_LIST_FIELD_NUMBER = 15;
    private java.util.List<emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief> askFriendList_;
    /**
     * <code>repeated .FriendBrief ask_friend_list = 15;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief> getAskFriendListList() {
      return askFriendList_;
    }
    /**
     * <code>repeated .FriendBrief ask_friend_list = 15;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBriefOrBuilder> 
        getAskFriendListOrBuilderList() {
      return askFriendList_;
    }
    /**
     * <code>repeated .FriendBrief ask_friend_list = 15;</code>
     */
    @java.lang.Override
    public int getAskFriendListCount() {
      return askFriendList_.size();
    }
    /**
     * <code>repeated .FriendBrief ask_friend_list = 15;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief getAskFriendList(int index) {
      return askFriendList_.get(index);
    }
    /**
     * <code>repeated .FriendBrief ask_friend_list = 15;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBriefOrBuilder getAskFriendListOrBuilder(
        int index) {
      return askFriendList_.get(index);
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
      if (retcode_ != 0) {
        output.writeInt32(13, retcode_);
      }
      for (int i = 0; i < askFriendList_.size(); i++) {
        output.writeMessage(15, askFriendList_.get(i));
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
          .computeInt32Size(13, retcode_);
      }
      for (int i = 0; i < askFriendList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(15, askFriendList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.GetPlayerAskFriendListRspOuterClass.GetPlayerAskFriendListRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GetPlayerAskFriendListRspOuterClass.GetPlayerAskFriendListRsp other = (emu.grasscutter.net.proto.GetPlayerAskFriendListRspOuterClass.GetPlayerAskFriendListRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (!getAskFriendListList()
          .equals(other.getAskFriendListList())) return false;
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
      if (getAskFriendListCount() > 0) {
        hash = (37 * hash) + ASK_FRIEND_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getAskFriendListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GetPlayerAskFriendListRspOuterClass.GetPlayerAskFriendListRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetPlayerAskFriendListRspOuterClass.GetPlayerAskFriendListRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetPlayerAskFriendListRspOuterClass.GetPlayerAskFriendListRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetPlayerAskFriendListRspOuterClass.GetPlayerAskFriendListRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetPlayerAskFriendListRspOuterClass.GetPlayerAskFriendListRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetPlayerAskFriendListRspOuterClass.GetPlayerAskFriendListRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetPlayerAskFriendListRspOuterClass.GetPlayerAskFriendListRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetPlayerAskFriendListRspOuterClass.GetPlayerAskFriendListRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetPlayerAskFriendListRspOuterClass.GetPlayerAskFriendListRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetPlayerAskFriendListRspOuterClass.GetPlayerAskFriendListRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetPlayerAskFriendListRspOuterClass.GetPlayerAskFriendListRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetPlayerAskFriendListRspOuterClass.GetPlayerAskFriendListRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GetPlayerAskFriendListRspOuterClass.GetPlayerAskFriendListRsp prototype) {
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
     * CmdId: 4066
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code GetPlayerAskFriendListRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetPlayerAskFriendListRsp)
        emu.grasscutter.net.proto.GetPlayerAskFriendListRspOuterClass.GetPlayerAskFriendListRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GetPlayerAskFriendListRspOuterClass.internal_static_GetPlayerAskFriendListRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GetPlayerAskFriendListRspOuterClass.internal_static_GetPlayerAskFriendListRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GetPlayerAskFriendListRspOuterClass.GetPlayerAskFriendListRsp.class, emu.grasscutter.net.proto.GetPlayerAskFriendListRspOuterClass.GetPlayerAskFriendListRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GetPlayerAskFriendListRspOuterClass.GetPlayerAskFriendListRsp.newBuilder()
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
          getAskFriendListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        retcode_ = 0;

        if (askFriendListBuilder_ == null) {
          askFriendList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          askFriendListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GetPlayerAskFriendListRspOuterClass.internal_static_GetPlayerAskFriendListRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetPlayerAskFriendListRspOuterClass.GetPlayerAskFriendListRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GetPlayerAskFriendListRspOuterClass.GetPlayerAskFriendListRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetPlayerAskFriendListRspOuterClass.GetPlayerAskFriendListRsp build() {
        emu.grasscutter.net.proto.GetPlayerAskFriendListRspOuterClass.GetPlayerAskFriendListRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetPlayerAskFriendListRspOuterClass.GetPlayerAskFriendListRsp buildPartial() {
        emu.grasscutter.net.proto.GetPlayerAskFriendListRspOuterClass.GetPlayerAskFriendListRsp result = new emu.grasscutter.net.proto.GetPlayerAskFriendListRspOuterClass.GetPlayerAskFriendListRsp(this);
        int from_bitField0_ = bitField0_;
        result.retcode_ = retcode_;
        if (askFriendListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            askFriendList_ = java.util.Collections.unmodifiableList(askFriendList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.askFriendList_ = askFriendList_;
        } else {
          result.askFriendList_ = askFriendListBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.proto.GetPlayerAskFriendListRspOuterClass.GetPlayerAskFriendListRsp) {
          return mergeFrom((emu.grasscutter.net.proto.GetPlayerAskFriendListRspOuterClass.GetPlayerAskFriendListRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GetPlayerAskFriendListRspOuterClass.GetPlayerAskFriendListRsp other) {
        if (other == emu.grasscutter.net.proto.GetPlayerAskFriendListRspOuterClass.GetPlayerAskFriendListRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (askFriendListBuilder_ == null) {
          if (!other.askFriendList_.isEmpty()) {
            if (askFriendList_.isEmpty()) {
              askFriendList_ = other.askFriendList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureAskFriendListIsMutable();
              askFriendList_.addAll(other.askFriendList_);
            }
            onChanged();
          }
        } else {
          if (!other.askFriendList_.isEmpty()) {
            if (askFriendListBuilder_.isEmpty()) {
              askFriendListBuilder_.dispose();
              askFriendListBuilder_ = null;
              askFriendList_ = other.askFriendList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              askFriendListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getAskFriendListFieldBuilder() : null;
            } else {
              askFriendListBuilder_.addAllMessages(other.askFriendList_);
            }
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
        emu.grasscutter.net.proto.GetPlayerAskFriendListRspOuterClass.GetPlayerAskFriendListRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GetPlayerAskFriendListRspOuterClass.GetPlayerAskFriendListRsp) e.getUnfinishedMessage();
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
       * <code>int32 retcode = 13;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 13;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief> askFriendList_ =
        java.util.Collections.emptyList();
      private void ensureAskFriendListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          askFriendList_ = new java.util.ArrayList<emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief>(askFriendList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief, emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief.Builder, emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBriefOrBuilder> askFriendListBuilder_;

      /**
       * <code>repeated .FriendBrief ask_friend_list = 15;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief> getAskFriendListList() {
        if (askFriendListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(askFriendList_);
        } else {
          return askFriendListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .FriendBrief ask_friend_list = 15;</code>
       */
      public int getAskFriendListCount() {
        if (askFriendListBuilder_ == null) {
          return askFriendList_.size();
        } else {
          return askFriendListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .FriendBrief ask_friend_list = 15;</code>
       */
      public emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief getAskFriendList(int index) {
        if (askFriendListBuilder_ == null) {
          return askFriendList_.get(index);
        } else {
          return askFriendListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .FriendBrief ask_friend_list = 15;</code>
       */
      public Builder setAskFriendList(
          int index, emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief value) {
        if (askFriendListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAskFriendListIsMutable();
          askFriendList_.set(index, value);
          onChanged();
        } else {
          askFriendListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .FriendBrief ask_friend_list = 15;</code>
       */
      public Builder setAskFriendList(
          int index, emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief.Builder builderForValue) {
        if (askFriendListBuilder_ == null) {
          ensureAskFriendListIsMutable();
          askFriendList_.set(index, builderForValue.build());
          onChanged();
        } else {
          askFriendListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .FriendBrief ask_friend_list = 15;</code>
       */
      public Builder addAskFriendList(emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief value) {
        if (askFriendListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAskFriendListIsMutable();
          askFriendList_.add(value);
          onChanged();
        } else {
          askFriendListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .FriendBrief ask_friend_list = 15;</code>
       */
      public Builder addAskFriendList(
          int index, emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief value) {
        if (askFriendListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAskFriendListIsMutable();
          askFriendList_.add(index, value);
          onChanged();
        } else {
          askFriendListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .FriendBrief ask_friend_list = 15;</code>
       */
      public Builder addAskFriendList(
          emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief.Builder builderForValue) {
        if (askFriendListBuilder_ == null) {
          ensureAskFriendListIsMutable();
          askFriendList_.add(builderForValue.build());
          onChanged();
        } else {
          askFriendListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .FriendBrief ask_friend_list = 15;</code>
       */
      public Builder addAskFriendList(
          int index, emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief.Builder builderForValue) {
        if (askFriendListBuilder_ == null) {
          ensureAskFriendListIsMutable();
          askFriendList_.add(index, builderForValue.build());
          onChanged();
        } else {
          askFriendListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .FriendBrief ask_friend_list = 15;</code>
       */
      public Builder addAllAskFriendList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief> values) {
        if (askFriendListBuilder_ == null) {
          ensureAskFriendListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, askFriendList_);
          onChanged();
        } else {
          askFriendListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .FriendBrief ask_friend_list = 15;</code>
       */
      public Builder clearAskFriendList() {
        if (askFriendListBuilder_ == null) {
          askFriendList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          askFriendListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .FriendBrief ask_friend_list = 15;</code>
       */
      public Builder removeAskFriendList(int index) {
        if (askFriendListBuilder_ == null) {
          ensureAskFriendListIsMutable();
          askFriendList_.remove(index);
          onChanged();
        } else {
          askFriendListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .FriendBrief ask_friend_list = 15;</code>
       */
      public emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief.Builder getAskFriendListBuilder(
          int index) {
        return getAskFriendListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .FriendBrief ask_friend_list = 15;</code>
       */
      public emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBriefOrBuilder getAskFriendListOrBuilder(
          int index) {
        if (askFriendListBuilder_ == null) {
          return askFriendList_.get(index);  } else {
          return askFriendListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .FriendBrief ask_friend_list = 15;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBriefOrBuilder> 
           getAskFriendListOrBuilderList() {
        if (askFriendListBuilder_ != null) {
          return askFriendListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(askFriendList_);
        }
      }
      /**
       * <code>repeated .FriendBrief ask_friend_list = 15;</code>
       */
      public emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief.Builder addAskFriendListBuilder() {
        return getAskFriendListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief.getDefaultInstance());
      }
      /**
       * <code>repeated .FriendBrief ask_friend_list = 15;</code>
       */
      public emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief.Builder addAskFriendListBuilder(
          int index) {
        return getAskFriendListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief.getDefaultInstance());
      }
      /**
       * <code>repeated .FriendBrief ask_friend_list = 15;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief.Builder> 
           getAskFriendListBuilderList() {
        return getAskFriendListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief, emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief.Builder, emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBriefOrBuilder> 
          getAskFriendListFieldBuilder() {
        if (askFriendListBuilder_ == null) {
          askFriendListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief, emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief.Builder, emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBriefOrBuilder>(
                  askFriendList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          askFriendList_ = null;
        }
        return askFriendListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:GetPlayerAskFriendListRsp)
    }

    // @@protoc_insertion_point(class_scope:GetPlayerAskFriendListRsp)
    private static final emu.grasscutter.net.proto.GetPlayerAskFriendListRspOuterClass.GetPlayerAskFriendListRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GetPlayerAskFriendListRspOuterClass.GetPlayerAskFriendListRsp();
    }

    public static emu.grasscutter.net.proto.GetPlayerAskFriendListRspOuterClass.GetPlayerAskFriendListRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetPlayerAskFriendListRsp>
        PARSER = new com.google.protobuf.AbstractParser<GetPlayerAskFriendListRsp>() {
      @java.lang.Override
      public GetPlayerAskFriendListRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetPlayerAskFriendListRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GetPlayerAskFriendListRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetPlayerAskFriendListRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GetPlayerAskFriendListRspOuterClass.GetPlayerAskFriendListRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetPlayerAskFriendListRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetPlayerAskFriendListRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037GetPlayerAskFriendListRsp.proto\032\021Frien" +
      "dBrief.proto\"S\n\031GetPlayerAskFriendListRs" +
      "p\022\017\n\007retcode\030\r \001(\005\022%\n\017ask_friend_list\030\017 " +
      "\003(\0132\014.FriendBriefB\033\n\031emu.grasscutter.net" +
      ".protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.FriendBriefOuterClass.getDescriptor(),
        });
    internal_static_GetPlayerAskFriendListRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetPlayerAskFriendListRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetPlayerAskFriendListRsp_descriptor,
        new java.lang.String[] { "Retcode", "AskFriendList", });
    emu.grasscutter.net.proto.FriendBriefOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
