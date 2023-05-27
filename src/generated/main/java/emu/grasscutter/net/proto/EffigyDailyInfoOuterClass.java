// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EffigyDailyInfo.proto

package emu.grasscutter.net.proto;

public final class EffigyDailyInfoOuterClass {
  private EffigyDailyInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EffigyDailyInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EffigyDailyInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 day_index = 13;</code>
     * @return The dayIndex.
     */
    int getDayIndex();

    /**
     * <code>uint32 PGANOOFALKA = 10;</code>
     * @return The pGANOOFALKA.
     */
    int getPGANOOFALKA();

    /**
     * <code>uint32 challenge_max_score = 5;</code>
     * @return The challengeMaxScore.
     */
    int getChallengeMaxScore();

    /**
     * <code>uint32 IDEMGOMLJNO = 3;</code>
     * @return The iDEMGOMLJNO.
     */
    int getIDEMGOMLJNO();

    /**
     * <code>uint32 challenge_id = 2;</code>
     * @return The challengeId.
     */
    int getChallengeId();

    /**
     * <code>uint32 begin_time = 9;</code>
     * @return The beginTime.
     */
    int getBeginTime();

    /**
     * <code>bool is_first_pass_reward_taken = 12;</code>
     * @return The isFirstPassRewardTaken.
     */
    boolean getIsFirstPassRewardTaken();
  }
  /**
   * <pre>
   * Obf: AOAIBCIBMAF
   * </pre>
   *
   * Protobuf type {@code EffigyDailyInfo}
   */
  public static final class EffigyDailyInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EffigyDailyInfo)
      EffigyDailyInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EffigyDailyInfo.newBuilder() to construct.
    private EffigyDailyInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EffigyDailyInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EffigyDailyInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EffigyDailyInfo(
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
            case 16: {

              challengeId_ = input.readUInt32();
              break;
            }
            case 24: {

              iDEMGOMLJNO_ = input.readUInt32();
              break;
            }
            case 40: {

              challengeMaxScore_ = input.readUInt32();
              break;
            }
            case 72: {

              beginTime_ = input.readUInt32();
              break;
            }
            case 80: {

              pGANOOFALKA_ = input.readUInt32();
              break;
            }
            case 96: {

              isFirstPassRewardTaken_ = input.readBool();
              break;
            }
            case 104: {

              dayIndex_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.EffigyDailyInfoOuterClass.internal_static_EffigyDailyInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.EffigyDailyInfoOuterClass.internal_static_EffigyDailyInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.EffigyDailyInfoOuterClass.EffigyDailyInfo.class, emu.grasscutter.net.proto.EffigyDailyInfoOuterClass.EffigyDailyInfo.Builder.class);
    }

    public static final int DAY_INDEX_FIELD_NUMBER = 13;
    private int dayIndex_;
    /**
     * <code>uint32 day_index = 13;</code>
     * @return The dayIndex.
     */
    @java.lang.Override
    public int getDayIndex() {
      return dayIndex_;
    }

    public static final int PGANOOFALKA_FIELD_NUMBER = 10;
    private int pGANOOFALKA_;
    /**
     * <code>uint32 PGANOOFALKA = 10;</code>
     * @return The pGANOOFALKA.
     */
    @java.lang.Override
    public int getPGANOOFALKA() {
      return pGANOOFALKA_;
    }

    public static final int CHALLENGE_MAX_SCORE_FIELD_NUMBER = 5;
    private int challengeMaxScore_;
    /**
     * <code>uint32 challenge_max_score = 5;</code>
     * @return The challengeMaxScore.
     */
    @java.lang.Override
    public int getChallengeMaxScore() {
      return challengeMaxScore_;
    }

    public static final int IDEMGOMLJNO_FIELD_NUMBER = 3;
    private int iDEMGOMLJNO_;
    /**
     * <code>uint32 IDEMGOMLJNO = 3;</code>
     * @return The iDEMGOMLJNO.
     */
    @java.lang.Override
    public int getIDEMGOMLJNO() {
      return iDEMGOMLJNO_;
    }

    public static final int CHALLENGE_ID_FIELD_NUMBER = 2;
    private int challengeId_;
    /**
     * <code>uint32 challenge_id = 2;</code>
     * @return The challengeId.
     */
    @java.lang.Override
    public int getChallengeId() {
      return challengeId_;
    }

    public static final int BEGIN_TIME_FIELD_NUMBER = 9;
    private int beginTime_;
    /**
     * <code>uint32 begin_time = 9;</code>
     * @return The beginTime.
     */
    @java.lang.Override
    public int getBeginTime() {
      return beginTime_;
    }

    public static final int IS_FIRST_PASS_REWARD_TAKEN_FIELD_NUMBER = 12;
    private boolean isFirstPassRewardTaken_;
    /**
     * <code>bool is_first_pass_reward_taken = 12;</code>
     * @return The isFirstPassRewardTaken.
     */
    @java.lang.Override
    public boolean getIsFirstPassRewardTaken() {
      return isFirstPassRewardTaken_;
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
      if (challengeId_ != 0) {
        output.writeUInt32(2, challengeId_);
      }
      if (iDEMGOMLJNO_ != 0) {
        output.writeUInt32(3, iDEMGOMLJNO_);
      }
      if (challengeMaxScore_ != 0) {
        output.writeUInt32(5, challengeMaxScore_);
      }
      if (beginTime_ != 0) {
        output.writeUInt32(9, beginTime_);
      }
      if (pGANOOFALKA_ != 0) {
        output.writeUInt32(10, pGANOOFALKA_);
      }
      if (isFirstPassRewardTaken_ != false) {
        output.writeBool(12, isFirstPassRewardTaken_);
      }
      if (dayIndex_ != 0) {
        output.writeUInt32(13, dayIndex_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (challengeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, challengeId_);
      }
      if (iDEMGOMLJNO_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, iDEMGOMLJNO_);
      }
      if (challengeMaxScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, challengeMaxScore_);
      }
      if (beginTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, beginTime_);
      }
      if (pGANOOFALKA_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, pGANOOFALKA_);
      }
      if (isFirstPassRewardTaken_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(12, isFirstPassRewardTaken_);
      }
      if (dayIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, dayIndex_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.EffigyDailyInfoOuterClass.EffigyDailyInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.EffigyDailyInfoOuterClass.EffigyDailyInfo other = (emu.grasscutter.net.proto.EffigyDailyInfoOuterClass.EffigyDailyInfo) obj;

      if (getDayIndex()
          != other.getDayIndex()) return false;
      if (getPGANOOFALKA()
          != other.getPGANOOFALKA()) return false;
      if (getChallengeMaxScore()
          != other.getChallengeMaxScore()) return false;
      if (getIDEMGOMLJNO()
          != other.getIDEMGOMLJNO()) return false;
      if (getChallengeId()
          != other.getChallengeId()) return false;
      if (getBeginTime()
          != other.getBeginTime()) return false;
      if (getIsFirstPassRewardTaken()
          != other.getIsFirstPassRewardTaken()) return false;
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
      hash = (37 * hash) + DAY_INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getDayIndex();
      hash = (37 * hash) + PGANOOFALKA_FIELD_NUMBER;
      hash = (53 * hash) + getPGANOOFALKA();
      hash = (37 * hash) + CHALLENGE_MAX_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getChallengeMaxScore();
      hash = (37 * hash) + IDEMGOMLJNO_FIELD_NUMBER;
      hash = (53 * hash) + getIDEMGOMLJNO();
      hash = (37 * hash) + CHALLENGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getChallengeId();
      hash = (37 * hash) + BEGIN_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getBeginTime();
      hash = (37 * hash) + IS_FIRST_PASS_REWARD_TAKEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsFirstPassRewardTaken());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.EffigyDailyInfoOuterClass.EffigyDailyInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EffigyDailyInfoOuterClass.EffigyDailyInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EffigyDailyInfoOuterClass.EffigyDailyInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EffigyDailyInfoOuterClass.EffigyDailyInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EffigyDailyInfoOuterClass.EffigyDailyInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EffigyDailyInfoOuterClass.EffigyDailyInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EffigyDailyInfoOuterClass.EffigyDailyInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EffigyDailyInfoOuterClass.EffigyDailyInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EffigyDailyInfoOuterClass.EffigyDailyInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EffigyDailyInfoOuterClass.EffigyDailyInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EffigyDailyInfoOuterClass.EffigyDailyInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EffigyDailyInfoOuterClass.EffigyDailyInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.EffigyDailyInfoOuterClass.EffigyDailyInfo prototype) {
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
     * Obf: AOAIBCIBMAF
     * </pre>
     *
     * Protobuf type {@code EffigyDailyInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EffigyDailyInfo)
        emu.grasscutter.net.proto.EffigyDailyInfoOuterClass.EffigyDailyInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.EffigyDailyInfoOuterClass.internal_static_EffigyDailyInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.EffigyDailyInfoOuterClass.internal_static_EffigyDailyInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.EffigyDailyInfoOuterClass.EffigyDailyInfo.class, emu.grasscutter.net.proto.EffigyDailyInfoOuterClass.EffigyDailyInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.EffigyDailyInfoOuterClass.EffigyDailyInfo.newBuilder()
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
        dayIndex_ = 0;

        pGANOOFALKA_ = 0;

        challengeMaxScore_ = 0;

        iDEMGOMLJNO_ = 0;

        challengeId_ = 0;

        beginTime_ = 0;

        isFirstPassRewardTaken_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.EffigyDailyInfoOuterClass.internal_static_EffigyDailyInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EffigyDailyInfoOuterClass.EffigyDailyInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.EffigyDailyInfoOuterClass.EffigyDailyInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EffigyDailyInfoOuterClass.EffigyDailyInfo build() {
        emu.grasscutter.net.proto.EffigyDailyInfoOuterClass.EffigyDailyInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EffigyDailyInfoOuterClass.EffigyDailyInfo buildPartial() {
        emu.grasscutter.net.proto.EffigyDailyInfoOuterClass.EffigyDailyInfo result = new emu.grasscutter.net.proto.EffigyDailyInfoOuterClass.EffigyDailyInfo(this);
        result.dayIndex_ = dayIndex_;
        result.pGANOOFALKA_ = pGANOOFALKA_;
        result.challengeMaxScore_ = challengeMaxScore_;
        result.iDEMGOMLJNO_ = iDEMGOMLJNO_;
        result.challengeId_ = challengeId_;
        result.beginTime_ = beginTime_;
        result.isFirstPassRewardTaken_ = isFirstPassRewardTaken_;
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
        if (other instanceof emu.grasscutter.net.proto.EffigyDailyInfoOuterClass.EffigyDailyInfo) {
          return mergeFrom((emu.grasscutter.net.proto.EffigyDailyInfoOuterClass.EffigyDailyInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.EffigyDailyInfoOuterClass.EffigyDailyInfo other) {
        if (other == emu.grasscutter.net.proto.EffigyDailyInfoOuterClass.EffigyDailyInfo.getDefaultInstance()) return this;
        if (other.getDayIndex() != 0) {
          setDayIndex(other.getDayIndex());
        }
        if (other.getPGANOOFALKA() != 0) {
          setPGANOOFALKA(other.getPGANOOFALKA());
        }
        if (other.getChallengeMaxScore() != 0) {
          setChallengeMaxScore(other.getChallengeMaxScore());
        }
        if (other.getIDEMGOMLJNO() != 0) {
          setIDEMGOMLJNO(other.getIDEMGOMLJNO());
        }
        if (other.getChallengeId() != 0) {
          setChallengeId(other.getChallengeId());
        }
        if (other.getBeginTime() != 0) {
          setBeginTime(other.getBeginTime());
        }
        if (other.getIsFirstPassRewardTaken() != false) {
          setIsFirstPassRewardTaken(other.getIsFirstPassRewardTaken());
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
        emu.grasscutter.net.proto.EffigyDailyInfoOuterClass.EffigyDailyInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.EffigyDailyInfoOuterClass.EffigyDailyInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int dayIndex_ ;
      /**
       * <code>uint32 day_index = 13;</code>
       * @return The dayIndex.
       */
      @java.lang.Override
      public int getDayIndex() {
        return dayIndex_;
      }
      /**
       * <code>uint32 day_index = 13;</code>
       * @param value The dayIndex to set.
       * @return This builder for chaining.
       */
      public Builder setDayIndex(int value) {
        
        dayIndex_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 day_index = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearDayIndex() {
        
        dayIndex_ = 0;
        onChanged();
        return this;
      }

      private int pGANOOFALKA_ ;
      /**
       * <code>uint32 PGANOOFALKA = 10;</code>
       * @return The pGANOOFALKA.
       */
      @java.lang.Override
      public int getPGANOOFALKA() {
        return pGANOOFALKA_;
      }
      /**
       * <code>uint32 PGANOOFALKA = 10;</code>
       * @param value The pGANOOFALKA to set.
       * @return This builder for chaining.
       */
      public Builder setPGANOOFALKA(int value) {
        
        pGANOOFALKA_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 PGANOOFALKA = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearPGANOOFALKA() {
        
        pGANOOFALKA_ = 0;
        onChanged();
        return this;
      }

      private int challengeMaxScore_ ;
      /**
       * <code>uint32 challenge_max_score = 5;</code>
       * @return The challengeMaxScore.
       */
      @java.lang.Override
      public int getChallengeMaxScore() {
        return challengeMaxScore_;
      }
      /**
       * <code>uint32 challenge_max_score = 5;</code>
       * @param value The challengeMaxScore to set.
       * @return This builder for chaining.
       */
      public Builder setChallengeMaxScore(int value) {
        
        challengeMaxScore_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 challenge_max_score = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearChallengeMaxScore() {
        
        challengeMaxScore_ = 0;
        onChanged();
        return this;
      }

      private int iDEMGOMLJNO_ ;
      /**
       * <code>uint32 IDEMGOMLJNO = 3;</code>
       * @return The iDEMGOMLJNO.
       */
      @java.lang.Override
      public int getIDEMGOMLJNO() {
        return iDEMGOMLJNO_;
      }
      /**
       * <code>uint32 IDEMGOMLJNO = 3;</code>
       * @param value The iDEMGOMLJNO to set.
       * @return This builder for chaining.
       */
      public Builder setIDEMGOMLJNO(int value) {
        
        iDEMGOMLJNO_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 IDEMGOMLJNO = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearIDEMGOMLJNO() {
        
        iDEMGOMLJNO_ = 0;
        onChanged();
        return this;
      }

      private int challengeId_ ;
      /**
       * <code>uint32 challenge_id = 2;</code>
       * @return The challengeId.
       */
      @java.lang.Override
      public int getChallengeId() {
        return challengeId_;
      }
      /**
       * <code>uint32 challenge_id = 2;</code>
       * @param value The challengeId to set.
       * @return This builder for chaining.
       */
      public Builder setChallengeId(int value) {
        
        challengeId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 challenge_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearChallengeId() {
        
        challengeId_ = 0;
        onChanged();
        return this;
      }

      private int beginTime_ ;
      /**
       * <code>uint32 begin_time = 9;</code>
       * @return The beginTime.
       */
      @java.lang.Override
      public int getBeginTime() {
        return beginTime_;
      }
      /**
       * <code>uint32 begin_time = 9;</code>
       * @param value The beginTime to set.
       * @return This builder for chaining.
       */
      public Builder setBeginTime(int value) {
        
        beginTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 begin_time = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearBeginTime() {
        
        beginTime_ = 0;
        onChanged();
        return this;
      }

      private boolean isFirstPassRewardTaken_ ;
      /**
       * <code>bool is_first_pass_reward_taken = 12;</code>
       * @return The isFirstPassRewardTaken.
       */
      @java.lang.Override
      public boolean getIsFirstPassRewardTaken() {
        return isFirstPassRewardTaken_;
      }
      /**
       * <code>bool is_first_pass_reward_taken = 12;</code>
       * @param value The isFirstPassRewardTaken to set.
       * @return This builder for chaining.
       */
      public Builder setIsFirstPassRewardTaken(boolean value) {
        
        isFirstPassRewardTaken_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_first_pass_reward_taken = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsFirstPassRewardTaken() {
        
        isFirstPassRewardTaken_ = false;
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


      // @@protoc_insertion_point(builder_scope:EffigyDailyInfo)
    }

    // @@protoc_insertion_point(class_scope:EffigyDailyInfo)
    private static final emu.grasscutter.net.proto.EffigyDailyInfoOuterClass.EffigyDailyInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.EffigyDailyInfoOuterClass.EffigyDailyInfo();
    }

    public static emu.grasscutter.net.proto.EffigyDailyInfoOuterClass.EffigyDailyInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EffigyDailyInfo>
        PARSER = new com.google.protobuf.AbstractParser<EffigyDailyInfo>() {
      @java.lang.Override
      public EffigyDailyInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EffigyDailyInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EffigyDailyInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EffigyDailyInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.EffigyDailyInfoOuterClass.EffigyDailyInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EffigyDailyInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EffigyDailyInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025EffigyDailyInfo.proto\"\271\001\n\017EffigyDailyI" +
      "nfo\022\021\n\tday_index\030\r \001(\r\022\023\n\013PGANOOFALKA\030\n " +
      "\001(\r\022\033\n\023challenge_max_score\030\005 \001(\r\022\023\n\013IDEM" +
      "GOMLJNO\030\003 \001(\r\022\024\n\014challenge_id\030\002 \001(\r\022\022\n\nb" +
      "egin_time\030\t \001(\r\022\"\n\032is_first_pass_reward_" +
      "taken\030\014 \001(\010B\033\n\031emu.grasscutter.net.proto" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_EffigyDailyInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EffigyDailyInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EffigyDailyInfo_descriptor,
        new java.lang.String[] { "DayIndex", "PGANOOFALKA", "ChallengeMaxScore", "IDEMGOMLJNO", "ChallengeId", "BeginTime", "IsFirstPassRewardTaken", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
