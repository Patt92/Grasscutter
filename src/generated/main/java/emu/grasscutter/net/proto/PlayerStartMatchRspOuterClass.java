// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerStartMatchRsp.proto

package emu.grasscutter.net.proto;

public final class PlayerStartMatchRspOuterClass {
  private PlayerStartMatchRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerStartMatchRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerStartMatchRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.MatchType match_type = 12;</code>
     * @return The enum numeric value on the wire for matchType.
     */
    int getMatchTypeValue();
    /**
     * <code>.MatchType match_type = 12;</code>
     * @return The matchType.
     */
    emu.grasscutter.net.proto.MatchTypeOuterClass.MatchType getMatchType();

    /**
     * <code>uint32 match_id = 14;</code>
     * @return The matchId.
     */
    int getMatchId();

    /**
     * <code>uint32 mechanicus_difficult_level = 15;</code>
     * @return The mechanicusDifficultLevel.
     */
    int getMechanicusDifficultLevel();

    /**
     * <code>int32 retcode = 7;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 punish_end_time = 10;</code>
     * @return The punishEndTime.
     */
    int getPunishEndTime();

    /**
     * <code>uint32 mp_play_id = 4;</code>
     * @return The mpPlayId.
     */
    int getMpPlayId();

    /**
     * <code>uint32 param = 13;</code>
     * @return The param.
     */
    int getParam();

    /**
     * <code>uint32 dungeon_id = 5;</code>
     * @return The dungeonId.
     */
    int getDungeonId();
  }
  /**
   * <pre>
   * CmdId: 21172
   * Obf: AAJPPGMIGOE
   * </pre>
   *
   * Protobuf type {@code PlayerStartMatchRsp}
   */
  public static final class PlayerStartMatchRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerStartMatchRsp)
      PlayerStartMatchRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerStartMatchRsp.newBuilder() to construct.
    private PlayerStartMatchRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerStartMatchRsp() {
      matchType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerStartMatchRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PlayerStartMatchRsp(
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
            case 32: {

              mpPlayId_ = input.readUInt32();
              break;
            }
            case 40: {

              dungeonId_ = input.readUInt32();
              break;
            }
            case 56: {

              retcode_ = input.readInt32();
              break;
            }
            case 80: {

              punishEndTime_ = input.readUInt32();
              break;
            }
            case 96: {
              int rawValue = input.readEnum();

              matchType_ = rawValue;
              break;
            }
            case 104: {

              param_ = input.readUInt32();
              break;
            }
            case 112: {

              matchId_ = input.readUInt32();
              break;
            }
            case 120: {

              mechanicusDifficultLevel_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.PlayerStartMatchRspOuterClass.internal_static_PlayerStartMatchRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PlayerStartMatchRspOuterClass.internal_static_PlayerStartMatchRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp.class, emu.grasscutter.net.proto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp.Builder.class);
    }

    public static final int MATCH_TYPE_FIELD_NUMBER = 12;
    private int matchType_;
    /**
     * <code>.MatchType match_type = 12;</code>
     * @return The enum numeric value on the wire for matchType.
     */
    @java.lang.Override public int getMatchTypeValue() {
      return matchType_;
    }
    /**
     * <code>.MatchType match_type = 12;</code>
     * @return The matchType.
     */
    @java.lang.Override public emu.grasscutter.net.proto.MatchTypeOuterClass.MatchType getMatchType() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.MatchTypeOuterClass.MatchType result = emu.grasscutter.net.proto.MatchTypeOuterClass.MatchType.valueOf(matchType_);
      return result == null ? emu.grasscutter.net.proto.MatchTypeOuterClass.MatchType.UNRECOGNIZED : result;
    }

    public static final int MATCH_ID_FIELD_NUMBER = 14;
    private int matchId_;
    /**
     * <code>uint32 match_id = 14;</code>
     * @return The matchId.
     */
    @java.lang.Override
    public int getMatchId() {
      return matchId_;
    }

    public static final int MECHANICUS_DIFFICULT_LEVEL_FIELD_NUMBER = 15;
    private int mechanicusDifficultLevel_;
    /**
     * <code>uint32 mechanicus_difficult_level = 15;</code>
     * @return The mechanicusDifficultLevel.
     */
    @java.lang.Override
    public int getMechanicusDifficultLevel() {
      return mechanicusDifficultLevel_;
    }

    public static final int RETCODE_FIELD_NUMBER = 7;
    private int retcode_;
    /**
     * <code>int32 retcode = 7;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int PUNISH_END_TIME_FIELD_NUMBER = 10;
    private int punishEndTime_;
    /**
     * <code>uint32 punish_end_time = 10;</code>
     * @return The punishEndTime.
     */
    @java.lang.Override
    public int getPunishEndTime() {
      return punishEndTime_;
    }

    public static final int MP_PLAY_ID_FIELD_NUMBER = 4;
    private int mpPlayId_;
    /**
     * <code>uint32 mp_play_id = 4;</code>
     * @return The mpPlayId.
     */
    @java.lang.Override
    public int getMpPlayId() {
      return mpPlayId_;
    }

    public static final int PARAM_FIELD_NUMBER = 13;
    private int param_;
    /**
     * <code>uint32 param = 13;</code>
     * @return The param.
     */
    @java.lang.Override
    public int getParam() {
      return param_;
    }

    public static final int DUNGEON_ID_FIELD_NUMBER = 5;
    private int dungeonId_;
    /**
     * <code>uint32 dungeon_id = 5;</code>
     * @return The dungeonId.
     */
    @java.lang.Override
    public int getDungeonId() {
      return dungeonId_;
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
      if (mpPlayId_ != 0) {
        output.writeUInt32(4, mpPlayId_);
      }
      if (dungeonId_ != 0) {
        output.writeUInt32(5, dungeonId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(7, retcode_);
      }
      if (punishEndTime_ != 0) {
        output.writeUInt32(10, punishEndTime_);
      }
      if (matchType_ != emu.grasscutter.net.proto.MatchTypeOuterClass.MatchType.MATCH_TYPE_NONE.getNumber()) {
        output.writeEnum(12, matchType_);
      }
      if (param_ != 0) {
        output.writeUInt32(13, param_);
      }
      if (matchId_ != 0) {
        output.writeUInt32(14, matchId_);
      }
      if (mechanicusDifficultLevel_ != 0) {
        output.writeUInt32(15, mechanicusDifficultLevel_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (mpPlayId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, mpPlayId_);
      }
      if (dungeonId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, dungeonId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(7, retcode_);
      }
      if (punishEndTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, punishEndTime_);
      }
      if (matchType_ != emu.grasscutter.net.proto.MatchTypeOuterClass.MatchType.MATCH_TYPE_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(12, matchType_);
      }
      if (param_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, param_);
      }
      if (matchId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, matchId_);
      }
      if (mechanicusDifficultLevel_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, mechanicusDifficultLevel_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp other = (emu.grasscutter.net.proto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp) obj;

      if (matchType_ != other.matchType_) return false;
      if (getMatchId()
          != other.getMatchId()) return false;
      if (getMechanicusDifficultLevel()
          != other.getMechanicusDifficultLevel()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getPunishEndTime()
          != other.getPunishEndTime()) return false;
      if (getMpPlayId()
          != other.getMpPlayId()) return false;
      if (getParam()
          != other.getParam()) return false;
      if (getDungeonId()
          != other.getDungeonId()) return false;
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
      hash = (37 * hash) + MATCH_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + matchType_;
      hash = (37 * hash) + MATCH_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMatchId();
      hash = (37 * hash) + MECHANICUS_DIFFICULT_LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getMechanicusDifficultLevel();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + PUNISH_END_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getPunishEndTime();
      hash = (37 * hash) + MP_PLAY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMpPlayId();
      hash = (37 * hash) + PARAM_FIELD_NUMBER;
      hash = (53 * hash) + getParam();
      hash = (37 * hash) + DUNGEON_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDungeonId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp prototype) {
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
     * CmdId: 21172
     * Obf: AAJPPGMIGOE
     * </pre>
     *
     * Protobuf type {@code PlayerStartMatchRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerStartMatchRsp)
        emu.grasscutter.net.proto.PlayerStartMatchRspOuterClass.PlayerStartMatchRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PlayerStartMatchRspOuterClass.internal_static_PlayerStartMatchRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PlayerStartMatchRspOuterClass.internal_static_PlayerStartMatchRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp.class, emu.grasscutter.net.proto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp.newBuilder()
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
        matchType_ = 0;

        matchId_ = 0;

        mechanicusDifficultLevel_ = 0;

        retcode_ = 0;

        punishEndTime_ = 0;

        mpPlayId_ = 0;

        param_ = 0;

        dungeonId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PlayerStartMatchRspOuterClass.internal_static_PlayerStartMatchRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp build() {
        emu.grasscutter.net.proto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp buildPartial() {
        emu.grasscutter.net.proto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp result = new emu.grasscutter.net.proto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp(this);
        result.matchType_ = matchType_;
        result.matchId_ = matchId_;
        result.mechanicusDifficultLevel_ = mechanicusDifficultLevel_;
        result.retcode_ = retcode_;
        result.punishEndTime_ = punishEndTime_;
        result.mpPlayId_ = mpPlayId_;
        result.param_ = param_;
        result.dungeonId_ = dungeonId_;
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
        if (other instanceof emu.grasscutter.net.proto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp) {
          return mergeFrom((emu.grasscutter.net.proto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp other) {
        if (other == emu.grasscutter.net.proto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp.getDefaultInstance()) return this;
        if (other.matchType_ != 0) {
          setMatchTypeValue(other.getMatchTypeValue());
        }
        if (other.getMatchId() != 0) {
          setMatchId(other.getMatchId());
        }
        if (other.getMechanicusDifficultLevel() != 0) {
          setMechanicusDifficultLevel(other.getMechanicusDifficultLevel());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getPunishEndTime() != 0) {
          setPunishEndTime(other.getPunishEndTime());
        }
        if (other.getMpPlayId() != 0) {
          setMpPlayId(other.getMpPlayId());
        }
        if (other.getParam() != 0) {
          setParam(other.getParam());
        }
        if (other.getDungeonId() != 0) {
          setDungeonId(other.getDungeonId());
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
        emu.grasscutter.net.proto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int matchType_ = 0;
      /**
       * <code>.MatchType match_type = 12;</code>
       * @return The enum numeric value on the wire for matchType.
       */
      @java.lang.Override public int getMatchTypeValue() {
        return matchType_;
      }
      /**
       * <code>.MatchType match_type = 12;</code>
       * @param value The enum numeric value on the wire for matchType to set.
       * @return This builder for chaining.
       */
      public Builder setMatchTypeValue(int value) {
        
        matchType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.MatchType match_type = 12;</code>
       * @return The matchType.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.MatchTypeOuterClass.MatchType getMatchType() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.MatchTypeOuterClass.MatchType result = emu.grasscutter.net.proto.MatchTypeOuterClass.MatchType.valueOf(matchType_);
        return result == null ? emu.grasscutter.net.proto.MatchTypeOuterClass.MatchType.UNRECOGNIZED : result;
      }
      /**
       * <code>.MatchType match_type = 12;</code>
       * @param value The matchType to set.
       * @return This builder for chaining.
       */
      public Builder setMatchType(emu.grasscutter.net.proto.MatchTypeOuterClass.MatchType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        matchType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.MatchType match_type = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearMatchType() {
        
        matchType_ = 0;
        onChanged();
        return this;
      }

      private int matchId_ ;
      /**
       * <code>uint32 match_id = 14;</code>
       * @return The matchId.
       */
      @java.lang.Override
      public int getMatchId() {
        return matchId_;
      }
      /**
       * <code>uint32 match_id = 14;</code>
       * @param value The matchId to set.
       * @return This builder for chaining.
       */
      public Builder setMatchId(int value) {
        
        matchId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 match_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearMatchId() {
        
        matchId_ = 0;
        onChanged();
        return this;
      }

      private int mechanicusDifficultLevel_ ;
      /**
       * <code>uint32 mechanicus_difficult_level = 15;</code>
       * @return The mechanicusDifficultLevel.
       */
      @java.lang.Override
      public int getMechanicusDifficultLevel() {
        return mechanicusDifficultLevel_;
      }
      /**
       * <code>uint32 mechanicus_difficult_level = 15;</code>
       * @param value The mechanicusDifficultLevel to set.
       * @return This builder for chaining.
       */
      public Builder setMechanicusDifficultLevel(int value) {
        
        mechanicusDifficultLevel_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 mechanicus_difficult_level = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearMechanicusDifficultLevel() {
        
        mechanicusDifficultLevel_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 7;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 7;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int punishEndTime_ ;
      /**
       * <code>uint32 punish_end_time = 10;</code>
       * @return The punishEndTime.
       */
      @java.lang.Override
      public int getPunishEndTime() {
        return punishEndTime_;
      }
      /**
       * <code>uint32 punish_end_time = 10;</code>
       * @param value The punishEndTime to set.
       * @return This builder for chaining.
       */
      public Builder setPunishEndTime(int value) {
        
        punishEndTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 punish_end_time = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearPunishEndTime() {
        
        punishEndTime_ = 0;
        onChanged();
        return this;
      }

      private int mpPlayId_ ;
      /**
       * <code>uint32 mp_play_id = 4;</code>
       * @return The mpPlayId.
       */
      @java.lang.Override
      public int getMpPlayId() {
        return mpPlayId_;
      }
      /**
       * <code>uint32 mp_play_id = 4;</code>
       * @param value The mpPlayId to set.
       * @return This builder for chaining.
       */
      public Builder setMpPlayId(int value) {
        
        mpPlayId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 mp_play_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearMpPlayId() {
        
        mpPlayId_ = 0;
        onChanged();
        return this;
      }

      private int param_ ;
      /**
       * <code>uint32 param = 13;</code>
       * @return The param.
       */
      @java.lang.Override
      public int getParam() {
        return param_;
      }
      /**
       * <code>uint32 param = 13;</code>
       * @param value The param to set.
       * @return This builder for chaining.
       */
      public Builder setParam(int value) {
        
        param_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 param = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearParam() {
        
        param_ = 0;
        onChanged();
        return this;
      }

      private int dungeonId_ ;
      /**
       * <code>uint32 dungeon_id = 5;</code>
       * @return The dungeonId.
       */
      @java.lang.Override
      public int getDungeonId() {
        return dungeonId_;
      }
      /**
       * <code>uint32 dungeon_id = 5;</code>
       * @param value The dungeonId to set.
       * @return This builder for chaining.
       */
      public Builder setDungeonId(int value) {
        
        dungeonId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 dungeon_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearDungeonId() {
        
        dungeonId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:PlayerStartMatchRsp)
    }

    // @@protoc_insertion_point(class_scope:PlayerStartMatchRsp)
    private static final emu.grasscutter.net.proto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp();
    }

    public static emu.grasscutter.net.proto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerStartMatchRsp>
        PARSER = new com.google.protobuf.AbstractParser<PlayerStartMatchRsp>() {
      @java.lang.Override
      public PlayerStartMatchRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PlayerStartMatchRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PlayerStartMatchRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerStartMatchRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerStartMatchRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerStartMatchRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031PlayerStartMatchRsp.proto\032\017MatchType.p" +
      "roto\"\314\001\n\023PlayerStartMatchRsp\022\036\n\nmatch_ty" +
      "pe\030\014 \001(\0162\n.MatchType\022\020\n\010match_id\030\016 \001(\r\022\"" +
      "\n\032mechanicus_difficult_level\030\017 \001(\r\022\017\n\007re" +
      "tcode\030\007 \001(\005\022\027\n\017punish_end_time\030\n \001(\r\022\022\n\n" +
      "mp_play_id\030\004 \001(\r\022\r\n\005param\030\r \001(\r\022\022\n\ndunge" +
      "on_id\030\005 \001(\rB\033\n\031emu.grasscutter.net.proto" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.MatchTypeOuterClass.getDescriptor(),
        });
    internal_static_PlayerStartMatchRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerStartMatchRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerStartMatchRsp_descriptor,
        new java.lang.String[] { "MatchType", "MatchId", "MechanicusDifficultLevel", "Retcode", "PunishEndTime", "MpPlayId", "Param", "DungeonId", });
    emu.grasscutter.net.proto.MatchTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
