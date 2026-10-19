package p138l;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.f;
import androidx.collection.X;
import java.util.ArrayList;
import p150m.c;
import p246u0.b;

/* JADX INFO: compiled from: SupportActionModeWrapper.java */
/* JADX INFO: loaded from: classes.dex */
public final class e extends ActionMode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f44053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p138l.a f44054b;

    /* JADX INFO: compiled from: SupportActionModeWrapper.java */
    public static class a implements p138l.a.InterfaceC0502a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ActionMode.Callback f44055a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Context f44056b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList<e> f44057c = new ArrayList<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final X<Menu, Menu> f44058d = new X<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f44056b = context;
            this.f44055a = callback;
        }

        @Override // p138l.a.InterfaceC0502a
        public final void a(p138l.a aVar) {
            this.f44055a.onDestroyActionMode(e(aVar));
        }

        @Override // p138l.a.InterfaceC0502a
        public final boolean b(p138l.a aVar, MenuItem menuItem) {
            return this.f44055a.onActionItemClicked(e(aVar), new c(this.f44056b, (b) menuItem));
        }

        @Override // p138l.a.InterfaceC0502a
        public final boolean c(p138l.a aVar, f fVar) {
            e eVarE = e(aVar);
            X<Menu, Menu> x10 = this.f44058d;
            Menu eVar = x10.get(fVar);
            if (eVar == null) {
                eVar = new p150m.e(this.f44056b, fVar);
                x10.put(fVar, eVar);
            }
            return this.f44055a.onPrepareActionMode(eVarE, eVar);
        }

        @Override // p138l.a.InterfaceC0502a
        public final boolean d(p138l.a aVar, f fVar) {
            e eVarE = e(aVar);
            X<Menu, Menu> x10 = this.f44058d;
            Menu eVar = x10.get(fVar);
            if (eVar == null) {
                eVar = new p150m.e(this.f44056b, fVar);
                x10.put(fVar, eVar);
            }
            return this.f44055a.onCreateActionMode(eVarE, eVar);
        }

        public final e e(p138l.a aVar) {
            ArrayList<e> arrayList = this.f44057c;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                e eVar = arrayList.get(i10);
                if (eVar != null && eVar.f44054b == aVar) {
                    return eVar;
                }
            }
            e eVar2 = new e(this.f44056b, aVar);
            arrayList.add(eVar2);
            return eVar2;
        }
    }

    public e(Context context, p138l.a aVar) {
        this.f44053a = context;
        this.f44054b = aVar;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f44054b.c();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f44054b.d();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new p150m.e(this.f44053a, this.f44054b.e());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f44054b.f();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f44054b.g();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f44054b.f44039b;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f44054b.h();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f44054b.f44040c;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f44054b.i();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f44054b.j();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f44054b.k(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f44054b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f44054b.f44039b = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f44054b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z10) {
        this.f44054b.p(z10);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i10) {
        this.f44054b.l(i10);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i10) {
        this.f44054b.n(i10);
    }
}
