package p076g;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.i;
import p063f.a;
import p063f.h;

/* JADX INFO: compiled from: ActivityResultContracts.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e extends a<h, a> {
    @Override // p076g.a
    public final Intent createIntent(Context context, h hVar) {
        h input = hVar;
        i.e(context, "context");
        i.e(input, "input");
        Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", input);
        i.d(intentPutExtra, "Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)");
        return intentPutExtra;
    }

    @Override // p076g.a
    public final a parseResult(int i10, Intent intent) {
        return new a(i10, intent);
    }
}
