package io.intercom.android.sdk.lightcompressor.compressor;

import Aa.c;
import Ia.p;
import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.Surface;
import com.braze.Constants;
import io.intercom.android.sdk.lightcompressor.CompressionProgressListener;
import io.intercom.android.sdk.lightcompressor.config.Configuration;
import io.intercom.android.sdk.lightcompressor.utils.CompressorUtils;
import io.intercom.android.sdk.lightcompressor.utils.StreamableVideo;
import io.intercom.android.sdk.lightcompressor.video.InputSurface;
import io.intercom.android.sdk.lightcompressor.video.MP4Builder;
import io.intercom.android.sdk.lightcompressor.video.OutputSurface;
import io.intercom.android.sdk.lightcompressor.video.Result;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Map;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.N;
import p293xa.r;

/* JADX INFO: compiled from: Compressor.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class Compressor {
    private static final String INVALID_BITRATE = "The provided bitrate is smaller than what is needed for compression try to set isMinBitRateEnabled to false";
    private static final long MEDIACODEC_TIMEOUT_DEFAULT = 100;
    private static final String MIME_TYPE = "video/avc";
    private static final int MIN_BITRATE = 2000000;
    public static final Compressor INSTANCE = new Compressor();
    private static boolean isRunning = true;

    /* JADX INFO: renamed from: io.intercom.android.sdk.lightcompressor.compressor.Compressor$compressVideo$2, reason: invalid class name */
    /* JADX INFO: compiled from: Compressor.kt */
    @c(c = "io.intercom.android.sdk.lightcompressor.compressor.Compressor$compressVideo$2", f = "Compressor.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super Result>, Object> {
        final /* synthetic */ Configuration $configuration;
        final /* synthetic */ Context $context;
        final /* synthetic */ String $destination;
        final /* synthetic */ int $index;
        final /* synthetic */ CompressionProgressListener $listener;
        final /* synthetic */ Uri $srcUri;
        final /* synthetic */ String $streamableFile;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Context context, Uri uri, int i10, Configuration configuration, String str, String str2, CompressionProgressListener compressionProgressListener, kotlin.coroutines.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$context = context;
            this.$srcUri = uri;
            this.$index = i10;
            this.$configuration = configuration;
            this.$destination = str;
            this.$streamableFile = str2;
            this.$listener = compressionProgressListener;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$context, this.$srcUri, this.$index, this.$configuration, this.$destination, this.$streamableFile, this.$listener, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX WARN: Code duplicated, block: B:56:0x0154  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int iIntValue;
            Pair<Integer, Integer> pairGenerateWidthAndHeight;
            int i10;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
            MediaExtractor mediaExtractor = new MediaExtractor();
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                mediaMetadataRetriever.setDataSource(this.$context, this.$srcUri);
                try {
                    mediaExtractor.setDataSource(this.$context, this.$srcUri, (Map<String, String>) null);
                    r rVar = r.f47939a;
                } catch (Throwable th) {
                    b.a(th);
                }
                CompressorUtils compressorUtils = CompressorUtils.INSTANCE;
                double dPrepareVideoHeight = compressorUtils.prepareVideoHeight(mediaMetadataRetriever);
                double dPrepareVideoWidth = compressorUtils.prepareVideoWidth(mediaMetadataRetriever);
                String strExtractMetadata = mediaMetadataRetriever.extractMetadata(24);
                String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(20);
                String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(9);
                if (strExtractMetadata == null || strExtractMetadata.length() == 0 || strExtractMetadata2 == null || strExtractMetadata2.length() == 0 || strExtractMetadata3 == null || strExtractMetadata3.length() == 0) {
                    return new Result(this.$index, false, "Failed to extract video meta-data, please try again", 0L, null, 24, null);
                }
                try {
                    Triple triple = new Triple(new Integer(Integer.parseInt(strExtractMetadata)), new Integer(Integer.parseInt(strExtractMetadata2)), new Long(Long.parseLong(strExtractMetadata3) * ((long) Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS)));
                    int iIntValue2 = ((Number) triple.a()).intValue();
                    int iIntValue3 = ((Number) triple.b()).intValue();
                    long jLongValue = ((Number) triple.c()).longValue();
                    if (this.$configuration.isMinBitrateCheckEnabled() && iIntValue3 <= Compressor.MIN_BITRATE) {
                        return new Result(this.$index, false, Compressor.INVALID_BITRATE, 0L, null, 24, null);
                    }
                    if (this.$configuration.getVideoBitrateInMbps() == null) {
                        iIntValue = compressorUtils.getBitrate(iIntValue3, this.$configuration.getQuality());
                    } else {
                        Integer videoBitrateInMbps = this.$configuration.getVideoBitrateInMbps();
                        i.b(videoBitrateInMbps);
                        iIntValue = videoBitrateInMbps.intValue() * 1000000;
                    }
                    int i11 = iIntValue;
                    if (this.$configuration.getVideoHeight() != null) {
                        Double videoWidth = this.$configuration.getVideoWidth();
                        Integer num = videoWidth != null ? new Integer((int) videoWidth.doubleValue()) : null;
                        Double videoHeight = this.$configuration.getVideoHeight();
                        pairGenerateWidthAndHeight = new Pair<>(num, videoHeight != null ? new Integer((int) videoHeight.doubleValue()) : null);
                    } else {
                        pairGenerateWidthAndHeight = compressorUtils.generateWidthAndHeight(dPrepareVideoWidth, dPrepareVideoHeight, this.$configuration.getKeepOriginalResolution());
                    }
                    Integer numA = pairGenerateWidthAndHeight.a();
                    Integer numB = pairGenerateWidthAndHeight.b();
                    if (iIntValue2 == 90) {
                        i10 = 0;
                        numA = numB;
                        numB = numA;
                    } else if (iIntValue2 == 180) {
                        i10 = 0;
                    } else if (iIntValue2 != 270) {
                        i10 = iIntValue2;
                    } else {
                        i10 = 0;
                        numA = numB;
                        numB = numA;
                    }
                    Compressor compressor = Compressor.INSTANCE;
                    int i12 = this.$index;
                    i.b(numA);
                    int iIntValue4 = numA.intValue();
                    i.b(numB);
                    return compressor.start(i12, iIntValue4, numB.intValue(), this.$destination, i11, this.$streamableFile, this.$configuration.getDisableAudio(), mediaExtractor, this.$listener, jLongValue, i10);
                } catch (Exception unused) {
                    return new Result(this.$index, false, "Failed to extract video meta-data, please try again", 0L, null, 24, null);
                }
            } catch (IllegalArgumentException e10) {
                CompressorUtils.INSTANCE.printException(e10);
                return new Result(this.$index, false, String.valueOf(e10.getMessage()), 0L, null, 24, null);
            }
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super Result> cVar) {
            return ((AnonymousClass2) create(a10, cVar)).invokeSuspend(r.f47939a);
        }
    }

    private Compressor() {
    }

    private final void dispose(int i10, MediaCodec mediaCodec, MediaCodec mediaCodec2, InputSurface inputSurface, OutputSurface outputSurface, MediaExtractor mediaExtractor) {
        mediaExtractor.unselectTrack(i10);
        mediaCodec.stop();
        mediaCodec.release();
        mediaCodec2.stop();
        mediaCodec2.release();
        inputSurface.release();
        outputSurface.release();
    }

    private final MediaCodec prepareDecoder(MediaFormat mediaFormat, OutputSurface outputSurface) throws IOException {
        String string = mediaFormat.getString("mime");
        i.b(string);
        MediaCodec mediaCodecCreateDecoderByType = MediaCodec.createDecoderByType(string);
        i.d(mediaCodecCreateDecoderByType, "createDecoderByType(...)");
        mediaCodecCreateDecoderByType.configure(mediaFormat, outputSurface.getSurface(), (MediaCrypto) null, 0);
        return mediaCodecCreateDecoderByType;
    }

    private final MediaCodec prepareEncoder(MediaFormat mediaFormat, boolean z10) throws IOException {
        MediaCodec mediaCodecCreateByCodecName = z10 ? MediaCodec.createByCodecName("c2.android.avc.encoder") : MediaCodec.createEncoderByType(MIME_TYPE);
        i.b(mediaCodecCreateByCodecName);
        try {
            mediaCodecCreateByCodecName.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
            return mediaCodecCreateByCodecName;
        } catch (Exception unused) {
            MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(MIME_TYPE);
            mediaCodecCreateEncoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
            return mediaCodecCreateEncoderByType;
        }
    }

    private final void processAudio(MP4Builder mP4Builder, MediaCodec.BufferInfo bufferInfo, boolean z10, MediaExtractor mediaExtractor) throws Exception {
        int iFindTrack = CompressorUtils.INSTANCE.findTrack(mediaExtractor, false);
        if (iFindTrack < 0 || z10) {
            return;
        }
        mediaExtractor.selectTrack(iFindTrack);
        MediaFormat trackFormat = mediaExtractor.getTrackFormat(iFindTrack);
        i.d(trackFormat, "getTrackFormat(...)");
        int iAddTrack = mP4Builder.addTrack(trackFormat, true);
        int integer = trackFormat.getInteger("max-input-size");
        if (integer <= 0) {
            integer = 65536;
        }
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(integer);
        i.d(byteBufferAllocateDirect, "allocateDirect(...)");
        if (Build.VERSION.SDK_INT >= 28) {
            long sampleSize = mediaExtractor.getSampleSize();
            if (sampleSize > integer) {
                byteBufferAllocateDirect = ByteBuffer.allocateDirect((int) (sampleSize + ((long) 1024)));
            }
        }
        mediaExtractor.seekTo(0L, 0);
        boolean z11 = false;
        while (!z11) {
            int sampleTrackIndex = mediaExtractor.getSampleTrackIndex();
            if (sampleTrackIndex == iFindTrack) {
                int sampleData = mediaExtractor.readSampleData(byteBufferAllocateDirect, 0);
                bufferInfo.size = sampleData;
                if (sampleData >= 0) {
                    bufferInfo.presentationTimeUs = mediaExtractor.getSampleTime();
                    bufferInfo.offset = 0;
                    bufferInfo.flags = 1;
                    mP4Builder.writeSampleData(iAddTrack, byteBufferAllocateDirect, bufferInfo, true);
                    mediaExtractor.advance();
                } else {
                    bufferInfo.size = 0;
                    z11 = true;
                }
            } else if (sampleTrackIndex == -1) {
                z11 = true;
            }
        }
        mediaExtractor.unselectTrack(iFindTrack);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:143:0x02fd A[Catch: Exception -> 0x0301, TRY_LEAVE, TryCatch #12 {Exception -> 0x0301, blocks: (B:141:0x02f7, B:143:0x02fd), top: B:176:0x02f7 }] */
    /* JADX WARN: Code duplicated, block: B:150:0x030b  */
    /* JADX WARN: Code duplicated, block: B:172:0x02e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x02f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [io.intercom.android.sdk.lightcompressor.utils.StreamableVideo] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [io.intercom.android.sdk.lightcompressor.CompressionProgressListener] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8, types: [int] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.io.File] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Result start(int i10, int i11, int i12, String str, int i13, String str2, boolean z10, MediaExtractor mediaExtractor, CompressionProgressListener compressionProgressListener, long j, int i14) throws Throwable {
        ?? r10;
        Object obj;
        ?? r11;
        ?? r12;
        ?? file;
        boolean zStart;
        ?? r14;
        Object obj2;
        Object obj3;
        File file2;
        int iDequeueInputBuffer;
        Object obj4;
        ?? r13;
        ?? r15;
        CompressionProgressListener compressionProgressListener2;
        ?? r16 = i10;
        Object obj5 = str2;
        mediaExtractor = mediaExtractor;
        ?? r17 = compressionProgressListener;
        if (i11 == 0 || i12 == 0) {
            return new Result(i10, false, "Something went wrong, please try again", 0L, null, 24, null);
        }
        File file3 = new File(str);
        try {
            try {
                MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                CompressorUtils compressorUtils = CompressorUtils.INSTANCE;
                MP4Builder mP4BuilderCreateMovie = new MP4Builder().createMovie(compressorUtils.setUpMP4Movie(i14, file3));
                int iFindTrack = compressorUtils.findTrack(mediaExtractor, true);
                mediaExtractor.selectTrack(iFindTrack);
                mediaExtractor.seekTo(0L, 0);
                MediaFormat trackFormat = mediaExtractor.getTrackFormat(iFindTrack);
                i.d(trackFormat, "getTrackFormat(...)");
                MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(MIME_TYPE, i11, i12);
                i.d(mediaFormatCreateVideoFormat, "createVideoFormat(...)");
                compressorUtils.setOutputFileParameters(trackFormat, mediaFormatCreateVideoFormat, i13);
                MediaCodec mediaCodecPrepareEncoder = prepareEncoder(mediaFormatCreateVideoFormat, compressorUtils.hasQTI());
                try {
                    InputSurface inputSurface = new InputSurface(mediaCodecPrepareEncoder.createInputSurface());
                    inputSurface.makeCurrent();
                    mediaCodecPrepareEncoder.start();
                    OutputSurface outputSurface = new OutputSurface();
                    MediaCodec mediaCodecPrepareDecoder = prepareDecoder(trackFormat, outputSurface);
                    mediaCodecPrepareDecoder.start();
                    boolean z11 = false;
                    boolean z12 = false;
                    int i15 = -5;
                    Object obj6 = obj5;
                    ?? r18 = r16;
                    while (!z11) {
                        if (!z12) {
                            try {
                                int sampleTrackIndex = mediaExtractor.getSampleTrackIndex();
                                if (sampleTrackIndex != iFindTrack) {
                                    if (sampleTrackIndex == -1 && (iDequeueInputBuffer = mediaCodecPrepareDecoder.dequeueInputBuffer(MEDIACODEC_TIMEOUT_DEFAULT)) >= 0) {
                                        mediaCodecPrepareDecoder.queueInputBuffer(iDequeueInputBuffer, 0, 0, 0L, 4);
                                        z12 = true;
                                    }
                                    CompressorUtils.INSTANCE.printException(e);
                                    obj = file2;
                                    r10 = obj3;
                                    try {
                                        return new Result(i10, false, e.getMessage(), 0L, null, 24, null);
                                    } catch (Exception e10) {
                                        e = e10;
                                        CompressorUtils.INSTANCE.printException(e);
                                        r12 = r10;
                                        r11 = obj;
                                        if (r12 != 0) {
                                            try {
                                                zStart = StreamableVideo.INSTANCE.start(r11, new File((String) r12));
                                                file = new File((String) r12);
                                                r14 = file;
                                                if (zStart) {
                                                    try {
                                                        r14 = file;
                                                        if (r11.exists()) {
                                                            r11.delete();
                                                            r14 = file;
                                                        }
                                                    } catch (Exception e11) {
                                                        e = e11;
                                                        CompressorUtils.INSTANCE.printException(e);
                                                        r14 = file;
                                                    }
                                                }
                                            } catch (Exception e12) {
                                                e = e12;
                                                file = r11;
                                            }
                                        } else {
                                            r14 = r11;
                                        }
                                        return new Result(i10, true, null, r14.length(), r14.getPath());
                                    }
                                }
                                int iDequeueInputBuffer2 = mediaCodecPrepareDecoder.dequeueInputBuffer(MEDIACODEC_TIMEOUT_DEFAULT);
                                if (iDequeueInputBuffer2 >= 0) {
                                    ByteBuffer inputBuffer = mediaCodecPrepareDecoder.getInputBuffer(iDequeueInputBuffer2);
                                    i.b(inputBuffer);
                                    int sampleData = mediaExtractor.readSampleData(inputBuffer, 0);
                                    if (sampleData < 0) {
                                        mediaCodecPrepareDecoder.queueInputBuffer(iDequeueInputBuffer2, 0, 0, 0L, 4);
                                        z12 = true;
                                    } else {
                                        mediaCodecPrepareDecoder.queueInputBuffer(iDequeueInputBuffer2, 0, sampleData, mediaExtractor.getSampleTime(), 0);
                                        mediaExtractor.advance();
                                    }
                                }
                            } catch (Exception e13) {
                                e = e13;
                                obj2 = obj6;
                                obj3 = obj2;
                                file2 = file3;
                            }
                        }
                        int iAddTrack = i15;
                        boolean z13 = true;
                        boolean z14 = true;
                        ?? r19 = r17;
                        Object obj7 = obj6;
                        ?? r110 = r18;
                        while (true) {
                            if (z14 || z13) {
                                try {
                                    if (isRunning) {
                                        outputSurface = outputSurface;
                                        boolean z15 = z14;
                                        File file4 = file3;
                                        InputSurface inputSurface2 = inputSurface;
                                        ?? r20 = r110;
                                        obj4 = obj7;
                                        file2 = file4;
                                        try {
                                            int iDequeueOutputBuffer = mediaCodecPrepareEncoder.dequeueOutputBuffer(bufferInfo, MEDIACODEC_TIMEOUT_DEFAULT);
                                            int i16 = -1;
                                            if (iDequeueOutputBuffer == -1) {
                                                z11 = z11;
                                                iAddTrack = iAddTrack;
                                                z13 = false;
                                            } else {
                                                if (iDequeueOutputBuffer == -2) {
                                                    MediaFormat outputFormat = mediaCodecPrepareEncoder.getOutputFormat();
                                                    i.d(outputFormat, "getOutputFormat(...)");
                                                    if (iAddTrack == -5) {
                                                        iAddTrack = mP4BuilderCreateMovie.addTrack(outputFormat, false);
                                                        i16 = -1;
                                                    }
                                                    z13 = z13;
                                                    z11 = z11;
                                                } else {
                                                    if (iDequeueOutputBuffer != -3) {
                                                        if (iDequeueOutputBuffer < 0) {
                                                            throw new RuntimeException("unexpected result from encoder.dequeueOutputBuffer: " + iDequeueOutputBuffer);
                                                        }
                                                        ByteBuffer outputBuffer = mediaCodecPrepareEncoder.getOutputBuffer(iDequeueOutputBuffer);
                                                        if (outputBuffer == null) {
                                                            throw new RuntimeException("encoderOutputBuffer " + iDequeueOutputBuffer + " was null");
                                                        }
                                                        if (bufferInfo.size > 1 && (bufferInfo.flags & 2) == 0) {
                                                            mP4BuilderCreateMovie.writeSampleData(iAddTrack, outputBuffer, bufferInfo, false);
                                                        }
                                                        z11 = (bufferInfo.flags & 4) != 0;
                                                        mediaCodecPrepareEncoder.releaseOutputBuffer(iDequeueOutputBuffer, false);
                                                    }
                                                    iAddTrack = iAddTrack;
                                                    i16 = -1;
                                                    z13 = z13;
                                                    z11 = z11;
                                                }
                                                iAddTrack = iAddTrack;
                                                i16 = -1;
                                                z13 = z13;
                                                z11 = z11;
                                            }
                                            if (iDequeueOutputBuffer == i16) {
                                                int iDequeueOutputBuffer2 = mediaCodecPrepareDecoder.dequeueOutputBuffer(bufferInfo, MEDIACODEC_TIMEOUT_DEFAULT);
                                                if (iDequeueOutputBuffer2 == i16) {
                                                    r15 = compressionProgressListener;
                                                } else if (iDequeueOutputBuffer2 == -3 || iDequeueOutputBuffer2 == -2) {
                                                    r13 = compressionProgressListener;
                                                } else {
                                                    if (iDequeueOutputBuffer2 < 0) {
                                                        throw new RuntimeException("unexpected result from decoder.dequeueOutputBuffer: " + iDequeueOutputBuffer2);
                                                    }
                                                    boolean z16 = bufferInfo.size != 0;
                                                    mediaCodecPrepareDecoder.releaseOutputBuffer(iDequeueOutputBuffer2, z16);
                                                    if (z16) {
                                                        try {
                                                            outputSurface.awaitNewImage();
                                                            outputSurface.drawImage();
                                                            inputSurface2.setPresentationTime(bufferInfo.presentationTimeUs * ((long) Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS));
                                                            CompressionProgressListener compressionProgressListener3 = compressionProgressListener;
                                                            compressionProgressListener3.onProgressChanged(r20 == true ? 1 : 0, (bufferInfo.presentationTimeUs / j) * 100);
                                                            inputSurface2.swapBuffers();
                                                            compressionProgressListener2 = compressionProgressListener3;
                                                        } catch (Exception e14) {
                                                            compressionProgressListener2 = compressionProgressListener;
                                                            String message = e14.getMessage();
                                                            if (message == null) {
                                                                message = "Compression failed at swapping buffer";
                                                            }
                                                            Log.e("Compressor", message);
                                                        }
                                                    } else {
                                                        compressionProgressListener2 = compressionProgressListener;
                                                    }
                                                    r13 = compressionProgressListener2;
                                                    if ((bufferInfo.flags & 4) != 0) {
                                                        mediaCodecPrepareEncoder.signalEndOfInputStream();
                                                        r15 = compressionProgressListener2;
                                                    }
                                                    r110 = r20 == true ? 1 : 0;
                                                    inputSurface = inputSurface2;
                                                    file3 = file2;
                                                    obj7 = obj4;
                                                    r19 = r15;
                                                }
                                                z14 = false;
                                                r110 = r20 == true ? 1 : 0;
                                                inputSurface = inputSurface2;
                                                file3 = file2;
                                                obj7 = obj4;
                                                r19 = r15;
                                            } else {
                                                r13 = r19;
                                            }
                                            z14 = z15;
                                            mediaExtractor = mediaExtractor;
                                            r15 = r13;
                                            r110 = r20 == true ? 1 : 0;
                                            inputSurface = inputSurface2;
                                            file3 = file2;
                                            obj7 = obj4;
                                            r19 = r15;
                                        } catch (Exception e15) {
                                            e = e15;
                                            obj3 = obj4;
                                            CompressorUtils.INSTANCE.printException(e);
                                            obj = file2;
                                            r10 = obj3;
                                            return new Result(i10, false, e.getMessage(), 0L, null, 24, null);
                                        }
                                    } else {
                                        try {
                                            dispose(iFindTrack, mediaCodecPrepareDecoder, mediaCodecPrepareEncoder, inputSurface, outputSurface, mediaExtractor);
                                            r19.onProgressCancelled(r110);
                                            try {
                                                return new Result(i10, false, "The compression has stopped!", 0L, null, 24, null);
                                            } catch (Exception e16) {
                                                e = e16;
                                                file2 = file3;
                                                obj3 = obj7;
                                                CompressorUtils.INSTANCE.printException(e);
                                                obj = file2;
                                                r10 = obj3;
                                                return new Result(i10, false, e.getMessage(), 0L, null, 24, null);
                                            }
                                        } catch (Exception e17) {
                                            e = e17;
                                        }
                                    }
                                } catch (Exception e18) {
                                    e = e18;
                                    obj4 = obj7;
                                    file2 = file3;
                                }
                            }
                        }
                        i15 = iAddTrack;
                        r17 = r19;
                        obj6 = obj7;
                        r18 = r110;
                    }
                    OutputSurface outputSurface2 = outputSurface;
                    File file5 = file3;
                    InputSurface inputSurface3 = inputSurface;
                    boolean z17 = r18 == true ? 1 : 0;
                    r16 = obj6;
                    obj5 = file5;
                    try {
                        dispose(iFindTrack, mediaCodecPrepareDecoder, mediaCodecPrepareEncoder, inputSurface3, outputSurface2, mediaExtractor);
                        processAudio(mP4BuilderCreateMovie, bufferInfo, z10, mediaExtractor);
                        mediaExtractor.release();
                        try {
                            mP4BuilderCreateMovie.finishMovie();
                        } catch (Exception e19) {
                            CompressorUtils.INSTANCE.printException(e19);
                        }
                        r11 = obj5;
                        r12 = r16;
                    } catch (Exception e20) {
                        e = e20;
                        obj = obj5;
                        r10 = r16;
                        CompressorUtils.INSTANCE.printException(e);
                        r12 = r10;
                        r11 = obj;
                    }
                } catch (Exception e21) {
                    e = e21;
                    obj2 = obj5;
                }
            } catch (Exception e22) {
                e = e22;
            }
        } catch (Exception e23) {
            e = e23;
            r10 = obj5;
            obj = file3;
        }
        if (r12 != 0) {
            zStart = StreamableVideo.INSTANCE.start(r11, new File((String) r12));
            file = new File((String) r12);
            r14 = file;
            if (zStart) {
                r14 = file;
                if (r11.exists()) {
                    r11.delete();
                    r14 = file;
                }
            }
        } else {
            r14 = r11;
        }
        return new Result(i10, true, null, r14.length(), r14.getPath());
    }

    public final Object compressVideo(int i10, Context context, Uri uri, String str, String str2, Configuration configuration, CompressionProgressListener compressionProgressListener, kotlin.coroutines.c<? super Result> cVar) {
        return C2680e.f(N.f43198a, new AnonymousClass2(context, uri, i10, configuration, str, str2, compressionProgressListener, null), cVar);
    }

    public final boolean isRunning() {
        return isRunning;
    }

    public final void setRunning(boolean z10) {
        isRunning = z10;
    }
}
