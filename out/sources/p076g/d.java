package p076g;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.i;
import p063f.a;

/* JADX INFO: compiled from: ActivityResultContracts.kt */
/* JADX INFO: loaded from: classes.dex */
public final class d extends a<Intent, a> {
    @Override // p076g.a
    public final Intent createIntent(Context context, Intent intent) {
        Intent input = intent;
        i.e(context, "context");
        i.e(input, "input");
        return input;
    }

    @Override // p076g.a
    public final a parseResult(int i10, Intent intent) {
        return new a(i10, intent);
    }
}
