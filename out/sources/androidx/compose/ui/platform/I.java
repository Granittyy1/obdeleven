package androidx.compose.ui.platform;

import android.view.ActionMode;

/* JADX INFO: compiled from: AndroidTextToolbar.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class I implements P0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AndroidComposeView f14923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ActionMode f14924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final S.b f14925c = new S.b(new Ia.a<p293xa.r>() { // from class: androidx.compose.ui.platform.AndroidTextToolbar$textActionModeCallback$1
        {
            super(0);
        }

        @Override // Ia.a
        public final p293xa.r invoke() {
            this.this$0.f14924b = null;
            return p293xa.r.f47939a;
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextToolbarStatus f14926d = TextToolbarStatus.f14968c;

    public I(AndroidComposeView androidComposeView) {
        this.f14923a = androidComposeView;
    }

    @Override // androidx.compose.ui.platform.P0
    public final void b() {
        this.f14926d = TextToolbarStatus.f14968c;
        ActionMode actionMode = this.f14924b;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.f14924b = null;
    }

    @Override // androidx.compose.ui.platform.P0
    public final TextToolbarStatus d() {
        return this.f14926d;
    }

    @Override // androidx.compose.ui.platform.P0
    public final void e(I.f fVar, Ia.a<p293xa.r> aVar, Ia.a<p293xa.r> aVar2, Ia.a<p293xa.r> aVar3, Ia.a<p293xa.r> aVar4) {
        f(fVar, aVar, aVar2, aVar3, aVar4, null);
    }

    @Override // androidx.compose.ui.platform.P0
    public final void f(I.f fVar, Ia.a<p293xa.r> aVar, Ia.a<p293xa.r> aVar2, Ia.a<p293xa.r> aVar3, Ia.a<p293xa.r> aVar4, Ia.a<p293xa.r> aVar5) {
        S.b bVar = this.f14925c;
        bVar.f5338b = fVar;
        bVar.f5339c = aVar;
        bVar.f5341e = aVar3;
        bVar.f5340d = aVar2;
        bVar.f5342f = aVar4;
        bVar.f5343g = aVar5;
        ActionMode actionMode = this.f14924b;
        if (actionMode != null) {
            actionMode.invalidate();
            return;
        }
        this.f14926d = TextToolbarStatus.f14967b;
        this.f14924b = this.f14923a.startActionMode(new S.a(bVar), 1);
    }
}
