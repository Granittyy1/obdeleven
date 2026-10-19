package p162n1;

import android.util.Base64;
import com.google.common.base.j;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements j {
    @Override // com.google.common.base.j
    public final Object get() {
        byte[] bArr = new byte[12];
        h.f44697i.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }
}
