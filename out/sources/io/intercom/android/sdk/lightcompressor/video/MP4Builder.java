package io.intercom.android.sdk.lightcompressor.video;

import Ab.a;
import Ab.b;
import D2.V;
import Vb.c;
import Vb.f;
import Vb.g;
import Vb.h;
import Vb.j;
import Vb.k;
import Vb.m;
import Vb.n;
import Vb.p;
import Vb.q;
import Vb.r;
import Vb.s;
import Vb.t;
import Vb.u;
import Vb.v;
import Vb.w;
import Vb.x;
import Vb.y;
import Vb.z;
import Zb.d;
import Zb.e;
import android.media.MediaCodec;
import android.media.MediaFormat;
import io.intercom.android.sdk.models.AttributeType;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.collections.l;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: MP4Builder.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class MP4Builder {
    private Mp4Movie currentMp4Movie;
    private long dataOffset;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private FileChannel f38143fc;
    private FileOutputStream fos;
    private Mdat mdat;
    private ByteBuffer sizeBuffer;
    private long wroteSinceLastMdat;
    private boolean writeNewMdat = true;
    private final HashMap<Track, long[]> track2SampleSizes = new HashMap<>();

    private final f createFileTypeBox() {
        List<String> listS = l.s("isom", "iso2", "mp41");
        f fVar = new f("ftyp");
        Collections.emptyList();
        fVar.f6881e = "mp42";
        fVar.f6882f = 0L;
        fVar.f6883g = listS;
        return fVar;
    }

    private final Vb.l createMovieBox(Mp4Movie mp4Movie) {
        Vb.l lVar = new Vb.l("moov");
        m mVar = new m();
        Date date = new Date();
        b bVarC = a.c(m.f6915s, mVar, mVar, date);
        e.a();
        e.b(bVarC);
        mVar.f6923i = date;
        if (V.g(date) >= 4294967296L) {
            mVar.d();
        }
        Date date2 = new Date();
        b bVarC2 = a.c(m.f6917u, mVar, mVar, date2);
        e.a();
        e.b(bVarC2);
        mVar.j = date2;
        if (V.g(date2) >= 4294967296L) {
            mVar.d();
        }
        d dVar = d.j;
        b bVarC3 = a.c(m.f6909B, mVar, mVar, dVar);
        e.a();
        e.b(bVarC3);
        mVar.f6928o = dVar;
        long timescale = getTimescale(mp4Movie);
        Iterator<Track> it = mp4Movie.getTracks().iterator();
        i.d(it, "iterator(...)");
        long j = 0;
        while (it.hasNext()) {
            Track next = it.next();
            i.d(next, "next(...)");
            Track track = next;
            long duration = (track.getDuration() * timescale) / ((long) track.getTimeScale());
            if (duration > j) {
                j = duration;
            }
        }
        b bVarC4 = a.c(m.f6921y, mVar, mVar, Long.valueOf(j));
        e.a();
        e.b(bVarC4);
        mVar.f6925l = j;
        if (j >= 4294967296L) {
            mVar.d();
        }
        b bVarC5 = a.c(m.f6919w, mVar, mVar, Long.valueOf(timescale));
        e.a();
        e.b(bVarC5);
        mVar.f6924k = timescale;
        long size = mp4Movie.getTracks().size() + 1;
        b bVarC6 = a.c(m.f6911D, mVar, mVar, Long.valueOf(size));
        e.a();
        e.b(bVarC6);
        mVar.f6929p = size;
        lVar.b(mVar);
        Iterator<Track> it2 = mp4Movie.getTracks().iterator();
        i.d(it2, "iterator(...)");
        while (it2.hasNext()) {
            Track next2 = it2.next();
            i.d(next2, "next(...)");
            lVar.b(createTrackBox(next2, mp4Movie));
        }
        return lVar;
    }

    private final Tb.b createStbl(Track track) {
        q qVar = new q("stbl");
        createStsd(track, qVar);
        createStts(track, qVar);
        createStss(track, qVar);
        createStsc(track, qVar);
        createStsz(track, qVar);
        createStco(track, qVar);
        return qVar;
    }

    private final void createStco(Track track, q qVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<Sample> it = track.getSamples().iterator();
        i.d(it, "iterator(...)");
        long size = -1;
        while (it.hasNext()) {
            Sample next = it.next();
            i.d(next, "next(...)");
            Sample sample = next;
            long offset = sample.getOffset();
            if (size != -1 && size != offset) {
                size = -1;
            }
            if (size == -1) {
                arrayList.add(Long.valueOf(offset));
            }
            size = sample.getSize() + offset;
        }
        long[] jArr = new long[arrayList.size()];
        int size2 = arrayList.size();
        for (int i10 = 0; i10 < size2; i10++) {
            Object obj = arrayList.get(i10);
            i.d(obj, "get(...)");
            jArr[i10] = ((Number) obj).longValue();
        }
        t tVar = new t();
        b bVarC = a.c(t.f6942l, tVar, tVar, jArr);
        e.a();
        e.b(bVarC);
        tVar.j = jArr;
        qVar.b(tVar);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:9:0x005e  */
    private final void createStsc(Track track, q qVar) {
        r rVar = new r();
        LinkedList linkedList = new LinkedList();
        b bVarC = a.c(r.f6934k, rVar, rVar, linkedList);
        e.a();
        e.b(bVarC);
        rVar.f6936i = linkedList;
        int size = track.getSamples().size();
        int i10 = -1;
        int i11 = 1;
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            Sample sample = track.getSamples().get(i13);
            i.d(sample, "get(...)");
            Sample sample2 = sample;
            long size2 = sample2.getSize() + sample2.getOffset();
            i12++;
            if (i13 != size - 1) {
                Sample sample3 = track.getSamples().get(i13 + 1);
                i.d(sample3, "get(...)");
                if (size2 != sample3.getOffset()) {
                    if (i10 != i12) {
                        b bVarB = a.b(r.j, rVar, rVar);
                        e.a();
                        e.b(bVarB);
                        rVar.f6936i.add(new r.a(i11, i12, 1L));
                        i10 = i12;
                    }
                    i11++;
                    i12 = 0;
                }
            } else {
                if (i10 != i12) {
                    b bVarB2 = a.b(r.j, rVar, rVar);
                    e.a();
                    e.b(bVarB2);
                    rVar.f6936i.add(new r.a(i11, i12, 1L));
                    i10 = i12;
                }
                i11++;
                i12 = 0;
            }
        }
        qVar.b(rVar);
    }

    private final void createStsd(Track track, q qVar) {
        qVar.b(track.getSampleDescriptionBox());
    }

    private final void createStss(Track track, q qVar) {
        long[] syncSamples = track.getSyncSamples();
        if (syncSamples == null || syncSamples.length == 0) {
            return;
        }
        v vVar = new v();
        b bVarC = a.c(v.j, vVar, vVar, syncSamples);
        e.a();
        e.b(bVarC);
        vVar.f6945i = syncSamples;
        qVar.b(vVar);
    }

    private final void createStsz(Track track, q qVar) {
        p pVar = new p();
        long[] jArr = this.track2SampleSizes.get(track);
        b bVarC = a.c(p.f6931l, pVar, pVar, jArr);
        e.a();
        e.b(bVarC);
        pVar.f6933i = jArr;
        qVar.b(pVar);
    }

    private final void createStts(Track track, q qVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<Long> it = track.getSampleDurations().iterator();
        i.d(it, "iterator(...)");
        w.a aVar = null;
        while (it.hasNext()) {
            Long next = it.next();
            i.d(next, "next(...)");
            long jLongValue = next.longValue();
            if (aVar == null || aVar.f6949b != jLongValue) {
                aVar = new w.a(1L, jLongValue);
                arrayList.add(aVar);
            } else {
                aVar.f6948a++;
            }
        }
        w wVar = new w();
        b bVarC = a.c(w.j, wVar, wVar, arrayList);
        e.a();
        e.b(bVarC);
        wVar.f6947i = arrayList;
        qVar.b(wVar);
    }

    private final x createTrackBox(Track track, Mp4Movie mp4Movie) {
        x xVar = new x("trak");
        y yVar = new y();
        b.a aVar = y.f6964O;
        Boolean bool = Boolean.TRUE;
        b bVarC = a.c(aVar, yVar, yVar, bool);
        e.a();
        e.b(bVarC);
        yVar.c(yVar.f7977f | 1);
        b bVarC2 = a.c(y.f6966Q, yVar, yVar, bool);
        e.a();
        e.b(bVarC2);
        yVar.c(yVar.f7977f | 4);
        b bVarC3 = a.c(y.f6965P, yVar, yVar, bool);
        e.a();
        e.b(bVarC3);
        yVar.c(yVar.f7977f | 2);
        d matrix = track.isAudio() ? d.j : mp4Movie.getMatrix();
        b bVarC4 = a.c(y.f6957H, yVar, yVar, matrix);
        e.a();
        e.b(bVarC4);
        yVar.f6981p = matrix;
        b bVarC5 = a.c(y.f6954E, yVar, yVar, 0);
        e.a();
        e.b(bVarC5);
        yVar.f6979n = 0;
        Date creationTime = track.getCreationTime();
        b bVarC6 = a.c(y.f6969u, yVar, yVar, creationTime);
        e.a();
        e.b(bVarC6);
        yVar.f6975i = creationTime;
        if (V.g(creationTime) >= 4294967296L) {
            yVar.d();
        }
        long duration = (track.getDuration() * getTimescale(mp4Movie)) / ((long) track.getTimeScale());
        b bVarC7 = a.c(y.f6950A, yVar, yVar, Long.valueOf(duration));
        e.a();
        e.b(bVarC7);
        yVar.f6977l = duration;
        if (duration >= 4294967296L) {
            yVar.c(1);
        }
        double height = track.getHeight();
        b bVarC8 = a.c(y.f6961L, yVar, yVar, Double.valueOf(height));
        e.a();
        e.b(bVarC8);
        yVar.f6983r = height;
        double width = track.getWidth();
        b bVarC9 = a.c(y.f6959J, yVar, yVar, Double.valueOf(width));
        e.a();
        e.b(bVarC9);
        yVar.f6982q = width;
        b bVarC10 = a.c(y.f6952C, yVar, yVar, 0);
        e.a();
        e.b(bVarC10);
        yVar.f6978m = 0;
        Date date = new Date();
        b bVarC11 = a.c(y.f6971w, yVar, yVar, date);
        e.a();
        e.b(bVarC11);
        yVar.j = date;
        if (V.g(date) >= 4294967296L) {
            yVar.d();
        }
        long trackId = track.getTrackId() + 1;
        b bVarC12 = a.c(y.f6973y, yVar, yVar, Long.valueOf(trackId));
        e.a();
        e.b(bVarC12);
        yVar.f6976k = trackId;
        float volume = track.getVolume();
        b bVarC13 = a.c(y.f6956G, yVar, yVar, Float.valueOf(volume));
        e.a();
        e.b(bVarC13);
        yVar.f6980o = volume;
        xVar.b(yVar);
        Vb.i iVar = new Vb.i("mdia");
        xVar.b(iVar);
        j jVar = new j();
        Date creationTime2 = track.getCreationTime();
        b bVarC14 = a.c(j.f6895p, jVar, jVar, creationTime2);
        e.a();
        e.b(bVarC14);
        jVar.f6904i = creationTime2;
        long duration2 = track.getDuration();
        b bVarC15 = a.c(j.f6900u, jVar, jVar, Long.valueOf(duration2));
        e.a();
        e.b(bVarC15);
        jVar.f6906l = duration2;
        long timeScale = track.getTimeScale();
        b bVarC16 = a.c(j.f6898s, jVar, jVar, Long.valueOf(timeScale));
        e.a();
        e.b(bVarC16);
        jVar.f6905k = timeScale;
        b bVarC17 = a.c(j.f6902w, jVar, jVar, "eng");
        e.a();
        e.b(bVarC17);
        jVar.f6907m = "eng";
        iVar.b(jVar);
        g gVar = new g();
        String str = track.isAudio() ? "SoundHandle" : "VideoHandle";
        b bVarC18 = a.c(g.f6888p, gVar, gVar, str);
        e.a();
        e.b(bVarC18);
        gVar.j = str;
        String handler = track.getHandler();
        b bVarC19 = a.c(g.f6886n, gVar, gVar, handler);
        e.a();
        e.b(bVarC19);
        gVar.f6890i = handler;
        iVar.b(gVar);
        k kVar = new k("minf");
        if (i.a(track.getHandler(), "vide")) {
            kVar.b(new z());
        } else if (i.a(track.getHandler(), "soun")) {
            kVar.b(new s());
        } else if (i.a(track.getHandler(), AttributeType.TEXT)) {
            kVar.b(new n());
        } else if (i.a(track.getHandler(), "subt")) {
            kVar.b(new u());
        } else if (i.a(track.getHandler(), "hint")) {
            kVar.b(new h());
        } else if (i.a(track.getHandler(), "sbtl")) {
            kVar.b(new n());
        }
        Vb.d dVar = new Vb.d("dinf");
        Vb.e eVar = new Vb.e("dref");
        dVar.b(eVar);
        c cVar = new c();
        cVar.c(1);
        eVar.b(cVar);
        kVar.b(dVar);
        kVar.b(createStbl(track));
        iVar.b(kVar);
        return xVar;
    }

    private final void flushCurrentMdat() throws Exception {
        FileChannel fileChannel = this.f38143fc;
        if (fileChannel == null) {
            i.m("fc");
            throw null;
        }
        long jPosition = fileChannel.position();
        FileChannel fileChannel2 = this.f38143fc;
        if (fileChannel2 == null) {
            i.m("fc");
            throw null;
        }
        Mdat mdat = this.mdat;
        if (mdat == null) {
            i.m("mdat");
            throw null;
        }
        fileChannel2.position(mdat.getOffset());
        Mdat mdat2 = this.mdat;
        if (mdat2 == null) {
            i.m("mdat");
            throw null;
        }
        FileChannel fileChannel3 = this.f38143fc;
        if (fileChannel3 == null) {
            i.m("fc");
            throw null;
        }
        mdat2.getBox(fileChannel3);
        FileChannel fileChannel4 = this.f38143fc;
        if (fileChannel4 == null) {
            i.m("fc");
            throw null;
        }
        fileChannel4.position(jPosition);
        Mdat mdat3 = this.mdat;
        if (mdat3 == null) {
            i.m("mdat");
            throw null;
        }
        mdat3.setDataOffset(0L);
        Mdat mdat4 = this.mdat;
        if (mdat4 == null) {
            i.m("mdat");
            throw null;
        }
        mdat4.setContentSize(0L);
        FileOutputStream fileOutputStream = this.fos;
        if (fileOutputStream != null) {
            fileOutputStream.flush();
        } else {
            i.m("fos");
            throw null;
        }
    }

    private final long gcd(long j, long j10) {
        return j10 == 0 ? j : gcd(j10, j % j10);
    }

    private final long getTimescale(Mp4Movie mp4Movie) {
        long timeScale = !mp4Movie.getTracks().isEmpty() ? mp4Movie.getTracks().iterator().next().getTimeScale() : 0L;
        Iterator<Track> it = mp4Movie.getTracks().iterator();
        i.d(it, "iterator(...)");
        while (it.hasNext()) {
            Track next = it.next();
            i.d(next, "next(...)");
            timeScale = gcd(next.getTimeScale(), timeScale);
        }
        return timeScale;
    }

    public final int addTrack(MediaFormat mediaFormat, boolean z10) {
        i.e(mediaFormat, "mediaFormat");
        Mp4Movie mp4Movie = this.currentMp4Movie;
        if (mp4Movie != null) {
            return mp4Movie.addTrack(mediaFormat, z10);
        }
        i.m("currentMp4Movie");
        throw null;
    }

    public final MP4Builder createMovie(Mp4Movie mp4Movie) throws Exception {
        i.e(mp4Movie, "mp4Movie");
        this.currentMp4Movie = mp4Movie;
        FileOutputStream fileOutputStream = new FileOutputStream(mp4Movie.getCacheFile());
        this.fos = fileOutputStream;
        this.f38143fc = fileOutputStream.getChannel();
        f fVarCreateFileTypeBox = createFileTypeBox();
        FileChannel fileChannel = this.f38143fc;
        if (fileChannel == null) {
            i.m("fc");
            throw null;
        }
        fVarCreateFileTypeBox.getBox(fileChannel);
        long size = fVarCreateFileTypeBox.getSize() + this.dataOffset;
        this.dataOffset = size;
        this.wroteSinceLastMdat = size;
        this.mdat = new Mdat();
        this.sizeBuffer = ByteBuffer.allocateDirect(4);
        return this;
    }

    public final void finishMovie() throws Exception {
        Mdat mdat = this.mdat;
        if (mdat == null) {
            i.m("mdat");
            throw null;
        }
        if (mdat.getContentSize() != 0) {
            flushCurrentMdat();
        }
        Mp4Movie mp4Movie = this.currentMp4Movie;
        if (mp4Movie == null) {
            i.m("currentMp4Movie");
            throw null;
        }
        Iterator<Track> it = mp4Movie.getTracks().iterator();
        i.d(it, "iterator(...)");
        while (it.hasNext()) {
            Track next = it.next();
            i.d(next, "next(...)");
            Track track = next;
            ArrayList<Sample> samples = track.getSamples();
            int size = samples.size();
            long[] jArr = new long[size];
            for (int i10 = 0; i10 < size; i10++) {
                jArr[i10] = samples.get(i10).getSize();
            }
            this.track2SampleSizes.put(track, jArr);
        }
        Mp4Movie mp4Movie2 = this.currentMp4Movie;
        if (mp4Movie2 == null) {
            i.m("currentMp4Movie");
            throw null;
        }
        Vb.l lVarCreateMovieBox = createMovieBox(mp4Movie2);
        FileChannel fileChannel = this.f38143fc;
        if (fileChannel == null) {
            i.m("fc");
            throw null;
        }
        lVarCreateMovieBox.getBox(fileChannel);
        FileOutputStream fileOutputStream = this.fos;
        if (fileOutputStream == null) {
            i.m("fos");
            throw null;
        }
        fileOutputStream.flush();
        FileChannel fileChannel2 = this.f38143fc;
        if (fileChannel2 == null) {
            i.m("fc");
            throw null;
        }
        fileChannel2.close();
        FileOutputStream fileOutputStream2 = this.fos;
        if (fileOutputStream2 == null) {
            i.m("fos");
            throw null;
        }
        fileOutputStream2.close();
    }

    public final void writeSampleData(int i10, ByteBuffer byteBuf, MediaCodec.BufferInfo bufferInfo, boolean z10) throws Exception {
        boolean z11;
        i.e(byteBuf, "byteBuf");
        i.e(bufferInfo, "bufferInfo");
        if (this.writeNewMdat) {
            Mdat mdat = this.mdat;
            if (mdat == null) {
                i.m("mdat");
                throw null;
            }
            mdat.setContentSize(0L);
            FileChannel fileChannel = this.f38143fc;
            if (fileChannel == null) {
                i.m("fc");
                throw null;
            }
            mdat.getBox(fileChannel);
            mdat.setDataOffset(this.dataOffset);
            long j = 16;
            this.dataOffset += j;
            this.wroteSinceLastMdat += j;
            this.writeNewMdat = false;
        }
        Mdat mdat2 = this.mdat;
        if (mdat2 == null) {
            i.m("mdat");
            throw null;
        }
        if (mdat2 == null) {
            i.m("mdat");
            throw null;
        }
        mdat2.setContentSize(mdat2.getContentSize() + ((long) bufferInfo.size));
        long j10 = this.wroteSinceLastMdat + ((long) bufferInfo.size);
        this.wroteSinceLastMdat = j10;
        if (j10 >= 32768) {
            flushCurrentMdat();
            z11 = true;
            this.writeNewMdat = true;
            this.wroteSinceLastMdat = 0L;
        } else {
            z11 = false;
        }
        Mp4Movie mp4Movie = this.currentMp4Movie;
        if (mp4Movie == null) {
            i.m("currentMp4Movie");
            throw null;
        }
        mp4Movie.addSample(i10, this.dataOffset, bufferInfo);
        if (z10) {
            byteBuf.position(bufferInfo.offset);
            byteBuf.limit(bufferInfo.offset + bufferInfo.size);
        } else {
            byteBuf.position(bufferInfo.offset + 4);
            byteBuf.limit(bufferInfo.offset + bufferInfo.size);
            ByteBuffer byteBuffer = this.sizeBuffer;
            if (byteBuffer == null) {
                i.m("sizeBuffer");
                throw null;
            }
            byteBuffer.position(0);
            ByteBuffer byteBuffer2 = this.sizeBuffer;
            if (byteBuffer2 == null) {
                i.m("sizeBuffer");
                throw null;
            }
            byteBuffer2.putInt(bufferInfo.size - 4);
            ByteBuffer byteBuffer3 = this.sizeBuffer;
            if (byteBuffer3 == null) {
                i.m("sizeBuffer");
                throw null;
            }
            byteBuffer3.position(0);
            FileChannel fileChannel2 = this.f38143fc;
            if (fileChannel2 == null) {
                i.m("fc");
                throw null;
            }
            ByteBuffer byteBuffer4 = this.sizeBuffer;
            if (byteBuffer4 == null) {
                i.m("sizeBuffer");
                throw null;
            }
            fileChannel2.write(byteBuffer4);
        }
        FileChannel fileChannel3 = this.f38143fc;
        if (fileChannel3 == null) {
            i.m("fc");
            throw null;
        }
        fileChannel3.write(byteBuf);
        this.dataOffset += (long) bufferInfo.size;
        if (z11) {
            FileOutputStream fileOutputStream = this.fos;
            if (fileOutputStream != null) {
                fileOutputStream.flush();
            } else {
                i.m("fos");
                throw null;
            }
        }
    }
}
