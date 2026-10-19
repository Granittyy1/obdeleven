package io.intercom.android.sdk.survey.ui.questiontype.dropdown;

import android.net.Uri;
import androidx.compose.runtime.X;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.i;
import p141l2.z;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Ia.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f39703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f39704c;

    public /* synthetic */ d(int i10, Object obj) {
        this.f39703b = i10;
        this.f39704c = obj;
    }

    @Override // Ia.a
    public final Object invoke() {
        switch (this.f39703b) {
            case 0:
                return DropDownQuestionKt.DropDownQuestion$lambda$10$lambda$9$lambda$8$lambda$4$lambda$3((X) this.f39704c);
            default:
                String str = ((z) this.f39704c).f44327a;
                Uri uri = Uri.parse(str);
                i.d(uri, "parse(...)");
                if (uri.getFragment() == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                Uri uri2 = Uri.parse(str);
                i.d(uri2, "parse(...)");
                String fragment = uri2.getFragment();
                StringBuilder sb2 = new StringBuilder();
                i.b(fragment);
                z.a(fragment, arrayList, sb2);
                return new Pair(arrayList, sb2.toString());
        }
    }
}
