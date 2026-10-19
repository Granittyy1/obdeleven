package androidx.compose.ui.platform;

import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import java.util.Comparator;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements Comparator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15089c;

    public /* synthetic */ r(int i10, Object obj) {
        this.f15088b = i10;
        this.f15089c = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f15088b) {
            case 0:
                return ((Number) ((Ia.p) this.f15089c).invoke(obj, obj2)).intValue();
            default:
                MediaCodecUtil.e eVar = (MediaCodecUtil.e) this.f15089c;
                return eVar.b(obj2) - eVar.b(obj);
        }
    }
}
