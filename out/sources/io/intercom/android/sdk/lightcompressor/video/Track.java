package io.intercom.android.sdk.lightcompressor.video;

import Ub.a;
import Ub.d;
import Ub.e;
import Ub.g;
import Vb.o;
import Yb.b;
import Yb.c;
import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.y;
import kotlin.jvm.internal.i;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: Track.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class Track {
    private final Date creationTime;
    private long duration;
    private boolean first;
    private String handler;
    private int height;
    private final boolean isAudio;
    private long lastPresentationTimeUs;
    private o sampleDescriptionBox;
    private final ArrayList<Long> sampleDurations;
    private final ArrayList<Sample> samples;
    private Map<Integer, Integer> samplingFrequencyIndexMap;
    private LinkedList<Integer> syncSamples;
    private int timeScale;
    private long trackId;
    private float volume;
    private int width;

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
    public Track(int i10, MediaFormat format, boolean z10) {
        int i11;
        i.e(format, "format");
        this.samples = new ArrayList<>();
        this.creationTime = new Date();
        ArrayList<Long> arrayList = new ArrayList<>();
        this.sampleDurations = arrayList;
        this.isAudio = z10;
        this.samplingFrequencyIndexMap = new HashMap();
        this.first = true;
        this.samplingFrequencyIndexMap = y.s(new Pair(96000, 0), new Pair(88200, 1), new Pair(64000, 2), new Pair(48000, 3), new Pair(44100, 4), new Pair(32000, 5), new Pair(24000, 6), new Pair(22050, 7), new Pair(16000, 8), new Pair(12000, 9), new Pair(11025, 10), new Pair(8000, 11));
        this.trackId = i10;
        if (z10) {
            arrayList.add(1024L);
            this.duration = 1024L;
            this.volume = 1.0f;
            this.timeScale = format.getInteger("sample-rate");
            this.handler = "soun";
            this.sampleDescriptionBox = new o();
            b upVar = setup(new b("mp4a"), format);
            Wb.b bVar = new Wb.b();
            e eVar = new e();
            eVar.f6609c = 0;
            g gVar = new g();
            gVar.f6614c = 2;
            eVar.f6612f = gVar;
            d upVar2 = setup(new d());
            a aVar = new a();
            aVar.f6588c = 2;
            Integer num = this.samplingFrequencyIndexMap.get(Integer.valueOf((int) upVar.f7659g));
            i.b(num);
            aVar.f6589d = num.intValue();
            aVar.f6590e = upVar.f7657e;
            upVar2.f6606h = aVar;
            eVar.f6611e = upVar2;
            ByteBuffer byteBufferK = eVar.k();
            Ab.b bVarC = Ab.a.c(Wb.b.f7099p, bVar, bVar, eVar);
            Zb.e.a();
            Zb.e.b(bVarC);
            Ab.b bVarC2 = Ab.a.c(Wb.a.f7096n, bVar, bVar, eVar);
            Zb.e.a();
            Zb.e.b(bVarC2);
            bVar.f7097i = eVar;
            Ab.b bVarC3 = Ab.a.c(Wb.a.f7094l, bVar, bVar, byteBufferK);
            Zb.e.a();
            Zb.e.b(bVarC3);
            bVar.j = byteBufferK;
            upVar.b(bVar);
            this.sampleDescriptionBox.b(upVar);
            return;
        }
        arrayList.add(3015L);
        this.duration = 3015L;
        this.width = format.getInteger("width");
        this.height = format.getInteger("height");
        this.timeScale = 90000;
        this.syncSamples = new LinkedList<>();
        this.handler = "vide";
        this.sampleDescriptionBox = new o();
        String string = format.getString("mime");
        if (!i.a(string, "video/avc")) {
            if (i.a(string, "video/mp4v")) {
                this.sampleDescriptionBox.b(setup(new c("mp4v"), this.width, this.height));
                return;
            }
            return;
        }
        c upVar3 = setup(new c("avc1"), this.width, this.height);
        Xb.a aVar2 = new Xb.a();
        if (format.getByteBuffer("csd-0") != null) {
            ArrayList arrayList2 = new ArrayList();
            ByteBuffer byteBuffer = format.getByteBuffer("csd-0");
            i.b(byteBuffer);
            byteBuffer.position(4);
            arrayList2.add(byteBuffer.slice());
            ArrayList arrayList3 = new ArrayList();
            ByteBuffer byteBuffer2 = format.getByteBuffer("csd-1");
            if (byteBuffer2 != null) {
                byteBuffer2.position(4);
                arrayList3.add(byteBuffer2.slice());
                Ab.b bVarC4 = Ab.a.c(Xb.a.f7452k, aVar2, aVar2, arrayList2);
                Zb.e.a();
                Zb.e.b(bVarC4);
                aVar2.f7460e.f7466f = arrayList2;
                Ab.b bVarC5 = Ab.a.c(Xb.a.f7453l, aVar2, aVar2, arrayList3);
                Zb.e.a();
                Zb.e.b(bVarC5);
                aVar2.f7460e.f7467g = arrayList3;
            }
        }
        if (format.containsKey("level")) {
            int integer = format.getInteger("level");
            if (integer == 1) {
                i11 = 3;
                aVar2.c(1);
            } else if (integer != 2) {
                switch (integer) {
                    case 4:
                        i11 = 3;
                        aVar2.c(11);
                        break;
                    case 8:
                        i11 = 3;
                        aVar2.c(12);
                        break;
                    case 16:
                        i11 = 3;
                        aVar2.c(13);
                        break;
                    case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                        i11 = 3;
                        aVar2.c(2);
                        break;
                    case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                        i11 = 3;
                        aVar2.c(21);
                        break;
                    case 128:
                        i11 = 3;
                        aVar2.c(22);
                        break;
                    case 256:
                        i11 = 3;
                        aVar2.c(3);
                        break;
                    case 512:
                        aVar2.c(31);
                        i11 = 3;
                        break;
                    case 1024:
                        aVar2.c(32);
                        i11 = 3;
                        break;
                    case 2048:
                        aVar2.c(4);
                        i11 = 3;
                        break;
                    case 4096:
                        aVar2.c(41);
                        i11 = 3;
                        break;
                    case 8192:
                        aVar2.c(42);
                        i11 = 3;
                        break;
                    case 16384:
                        aVar2.c(5);
                        i11 = 3;
                        break;
                    case 32768:
                        aVar2.c(51);
                        i11 = 3;
                        break;
                    case 65536:
                        aVar2.c(52);
                        i11 = 3;
                        break;
                    default:
                        aVar2.c(13);
                        i11 = 3;
                        break;
                }
            } else {
                i11 = 3;
                aVar2.c(27);
            }
        } else {
            i11 = 3;
            aVar2.c(13);
        }
        Ab.b bVarC6 = Ab.a.c(Xb.a.f7449g, aVar2, aVar2, 100);
        Zb.e.a();
        Zb.e.b(bVarC6);
        aVar2.f7460e.f7462b = 100;
        Ab.b bVarC7 = Ab.a.c(Xb.a.f7455n, aVar2, aVar2, -1);
        Zb.e.a();
        Zb.e.b(bVarC7);
        aVar2.f7460e.j = -1;
        Ab.b bVarC8 = Ab.a.c(Xb.a.f7456o, aVar2, aVar2, -1);
        Zb.e.a();
        Zb.e.b(bVarC8);
        aVar2.f7460e.f7470k = -1;
        Ab.b bVarC9 = Ab.a.c(Xb.a.f7454m, aVar2, aVar2, -1);
        Zb.e.a();
        Zb.e.b(bVarC9);
        aVar2.f7460e.f7469i = -1;
        Ab.b bVarC10 = Ab.a.c(Xb.a.f7448f, aVar2, aVar2, 1);
        Zb.e.a();
        Zb.e.b(bVarC10);
        aVar2.f7460e.f7461a = 1;
        Ab.b bVarC11 = Ab.a.c(Xb.a.j, aVar2, aVar2, Integer.valueOf(i11));
        Zb.e.a();
        Zb.e.b(bVarC11);
        aVar2.f7460e.f7465e = i11;
        Ab.b bVarC12 = Ab.a.c(Xb.a.f7450h, aVar2, aVar2, 0);
        Zb.e.a();
        Zb.e.b(bVarC12);
        aVar2.f7460e.f7463c = 0;
        upVar3.b(aVar2);
        this.sampleDescriptionBox.b(upVar3);
    }

    private final c setup(c cVar, int i10, int i11) {
        cVar.f7655d = 1;
        cVar.f7665k = 24;
        cVar.f7664i = 1;
        cVar.f7662g = 72.0d;
        cVar.f7663h = 72.0d;
        cVar.f7660e = i10;
        cVar.f7661f = i11;
        cVar.j = "AVC Coding";
        return cVar;
    }

    public final void addSample(long j, MediaCodec.BufferInfo bufferInfo) {
        i.e(bufferInfo, "bufferInfo");
        boolean z10 = (this.isAudio || (bufferInfo.flags & 1) == 0) ? false : true;
        this.samples.add(new Sample(j, bufferInfo.size));
        LinkedList<Integer> linkedList = this.syncSamples;
        if (linkedList != null && z10 && linkedList != null) {
            linkedList.add(Integer.valueOf(this.samples.size()));
        }
        long j10 = bufferInfo.presentationTimeUs;
        long j11 = j10 - this.lastPresentationTimeUs;
        this.lastPresentationTimeUs = j10;
        long j12 = ((j11 * ((long) this.timeScale)) + 500000) / 1000000;
        if (!this.first) {
            ArrayList<Long> arrayList = this.sampleDurations;
            arrayList.add(arrayList.size() - 1, Long.valueOf(j12));
            this.duration += j12;
        }
        this.first = false;
    }

    public final Date getCreationTime() {
        return this.creationTime;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final String getHandler() {
        return this.handler;
    }

    public final int getHeight() {
        return this.height;
    }

    public final o getSampleDescriptionBox() {
        return this.sampleDescriptionBox;
    }

    public final ArrayList<Long> getSampleDurations() {
        return this.sampleDurations;
    }

    public final ArrayList<Sample> getSamples() {
        return this.samples;
    }

    public final long[] getSyncSamples() {
        LinkedList<Integer> linkedList = this.syncSamples;
        if (linkedList == null) {
            return null;
        }
        i.b(linkedList);
        if (linkedList.isEmpty()) {
            return null;
        }
        LinkedList<Integer> linkedList2 = this.syncSamples;
        i.b(linkedList2);
        long[] jArr = new long[linkedList2.size()];
        LinkedList<Integer> linkedList3 = this.syncSamples;
        i.b(linkedList3);
        int size = linkedList3.size();
        for (int i10 = 0; i10 < size; i10++) {
            LinkedList<Integer> linkedList4 = this.syncSamples;
            i.b(linkedList4);
            jArr[i10] = linkedList4.get(i10).intValue();
        }
        return jArr;
    }

    public final int getTimeScale() {
        return this.timeScale;
    }

    public final long getTrackId() {
        return this.trackId;
    }

    public final float getVolume() {
        return this.volume;
    }

    public final int getWidth() {
        return this.width;
    }

    public final boolean isAudio() {
        return this.isAudio;
    }

    private final d setup(d dVar) {
        dVar.f6601c = 64;
        dVar.f6602d = 5;
        dVar.f6603e = 1536;
        dVar.f6604f = 96000L;
        dVar.f6605g = 96000L;
        return dVar;
    }

    private final b setup(b bVar, MediaFormat mediaFormat) {
        bVar.f7657e = mediaFormat.getInteger("channel-count") == 1 ? 2 : mediaFormat.getInteger("channel-count");
        bVar.f7659g = mediaFormat.getInteger("sample-rate");
        bVar.f7655d = 1;
        bVar.f7658f = 16;
        return bVar;
    }
}
