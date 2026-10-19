package com.voltasit.obdeleven.presentation.dialogs.bonus;

import android.view.View;
import androidx.media3.exoplayer.C;
import kotlin.jvm.internal.i;
import p110i9.d;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f32216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f32217c;

    public /* synthetic */ b(int i10, Object obj) {
        this.f32216b = i10;
        this.f32217c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f32216b) {
            case 0:
                BonusDialog this$0 = (BonusDialog) this.f32217c;
                i.e(this$0, "this$0");
                this$0.y();
                break;
            case 1:
                p048d9.a this$1 = (p048d9.a) this.f32217c;
                i.e(this$1, "this$0");
                this$1.r().g("https://support.obdeleven.com/en/articles/5627134-how-to-set-up-2-step-authentication-2fa");
                break;
            case 2:
                d.a aVar = (d.a) this.f32217c;
                int adapterPosition = aVar.getAdapterPosition();
                d dVar = d.this;
                C c10 = dVar.f36783e;
                if (c10 != null && adapterPosition != -1) {
                    c10.a((Q8.b) dVar.f36779a.get(adapterPosition));
                    break;
                }
                break;
            default:
                androidx.media3.ui.c.f fVar = (androidx.media3.ui.c.f) this.f32217c;
                int bindingAdapterPosition = fVar.getBindingAdapterPosition();
                androidx.media3.ui.c cVar = androidx.media3.ui.c.this;
                View view2 = cVar.f18919A;
                if (bindingAdapterPosition == 0) {
                    view2.getClass();
                    cVar.d(cVar.f18964h, view2);
                } else if (bindingAdapterPosition != 1) {
                    cVar.f18967l.dismiss();
                } else {
                    view2.getClass();
                    cVar.d(cVar.j, view2);
                }
                break;
        }
    }
}
