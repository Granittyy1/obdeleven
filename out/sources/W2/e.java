package W2;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import coil.request.k;

/* JADX INFO: compiled from: ResourceIntMapper.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e implements d<Integer, Uri> {
    @Override // W2.d
    public final Uri a(Integer num, k kVar) {
        Context context = kVar.f23098a;
        int iIntValue = num.intValue();
        try {
            if (context.getResources().getResourceEntryName(iIntValue) != null) {
                return Uri.parse("android.resource://" + context.getPackageName() + '/' + iIntValue);
            }
        } catch (Resources.NotFoundException unused) {
        }
        return null;
    }
}
