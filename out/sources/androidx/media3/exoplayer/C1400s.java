package androidx.media3.exoplayer;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;

/* JADX INFO: renamed from: androidx.media3.exoplayer.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1400s implements com.google.common.base.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f18603b;

    @Override // com.google.common.base.j
    public final Object get() {
        p272w1.f fVar;
        Context context = this.f18603b;
        ImmutableList<Long> immutableList = p272w1.f.f47704p;
        synchronized (p272w1.f.class) {
            try {
                if (p272w1.f.f47710v == null) {
                    Context applicationContext = context == null ? null : context.getApplicationContext();
                    HashMap map = new HashMap(8);
                    map.put(0, 1000000L);
                    map.put(2, -9223372036854775807L);
                    map.put(3, -9223372036854775807L);
                    map.put(4, -9223372036854775807L);
                    map.put(5, -9223372036854775807L);
                    map.put(10, -9223372036854775807L);
                    map.put(9, -9223372036854775807L);
                    map.put(7, -9223372036854775807L);
                    p272w1.f.f47710v = new p272w1.f(applicationContext, map);
                }
                fVar = p272w1.f.f47710v;
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }
}
