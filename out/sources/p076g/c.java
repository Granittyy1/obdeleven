package p076g;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.i;
import p186p0.a;

/* JADX INFO: compiled from: ActivityResultContracts.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c extends a<String, Boolean> {
    @Override // p076g.a
    public final Intent createIntent(Context context, String str) {
        String input = str;
        i.e(context, "context");
        i.e(input, "input");
        Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{input});
        i.d(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
        return intentPutExtra;
    }

    @Override // p076g.a
    public final a.C0368a<Boolean> getSynchronousResult(Context context, String str) {
        String input = str;
        i.e(context, "context");
        i.e(input, "input");
        if (a.a(context, input) == 0) {
            return new a.C0368a<>(Boolean.TRUE);
        }
        return null;
    }

    @Override // p076g.a
    public final Boolean parseResult(int i10, Intent intent) {
        if (intent == null || i10 != -1) {
            return Boolean.FALSE;
        }
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        boolean z10 = false;
        if (intArrayExtra != null) {
            for (int i11 : intArrayExtra) {
                if (i11 == 0) {
                    z10 = true;
                    break;
                }
            }
        }
        return Boolean.valueOf(z10);
    }
}
