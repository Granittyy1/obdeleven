package io.intercom.android.sdk.lightcompressor.video;

import Zb.d;
import android.media.MediaCodec;
import android.media.MediaFormat;
import java.io.File;
import java.util.ArrayList;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: Mp4Movie.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class Mp4Movie {
    private File cacheFile;
    private d matrix = d.j;
    private final ArrayList<Track> tracks = new ArrayList<>();

    public final void addSample(int i10, long j, MediaCodec.BufferInfo bufferInfo) {
        i.e(bufferInfo, "bufferInfo");
        if (i10 < 0 || i10 >= this.tracks.size()) {
            return;
        }
        Track track = this.tracks.get(i10);
        i.d(track, "get(...)");
        track.addSample(j, bufferInfo);
    }

    public final int addTrack(MediaFormat mediaFormat, boolean z10) {
        i.e(mediaFormat, "mediaFormat");
        ArrayList<Track> arrayList = this.tracks;
        arrayList.add(new Track(arrayList.size(), mediaFormat, z10));
        return this.tracks.size() - 1;
    }

    public final File getCacheFile() {
        return this.cacheFile;
    }

    public final d getMatrix() {
        return this.matrix;
    }

    public final ArrayList<Track> getTracks() {
        return this.tracks;
    }

    public final void setCacheFile(File file) {
        i.e(file, "file");
        this.cacheFile = file;
    }

    public final void setRotation(int i10) {
        if (i10 == 0) {
            this.matrix = d.j;
            return;
        }
        if (i10 == 90) {
            this.matrix = d.f7978k;
        } else if (i10 == 180) {
            this.matrix = d.f7979l;
        } else {
            if (i10 != 270) {
                return;
            }
            this.matrix = d.f7980m;
        }
    }
}
