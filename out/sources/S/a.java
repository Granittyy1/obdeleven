package S;

import I.f;
import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.compose.ui.platform.actionmodecallback.MenuItemOption;
import kotlin.jvm.internal.i;
import p293xa.r;

/* JADX INFO: compiled from: FloatingTextActionModeCallback.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a extends ActionMode.Callback2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f5336a;

    public a(b bVar) {
        this.f5336a = bVar;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        b bVar = this.f5336a;
        bVar.getClass();
        i.b(menuItem);
        int itemId = menuItem.getItemId();
        if (itemId == MenuItemOption.Copy.a()) {
            Ia.a<r> aVar = bVar.f5339c;
            if (aVar != null) {
                aVar.invoke();
            }
        } else if (itemId == MenuItemOption.Paste.a()) {
            Ia.a<r> aVar2 = bVar.f5340d;
            if (aVar2 != null) {
                aVar2.invoke();
            }
        } else if (itemId == MenuItemOption.Cut.a()) {
            Ia.a<r> aVar3 = bVar.f5341e;
            if (aVar3 != null) {
                aVar3.invoke();
            }
        } else if (itemId == MenuItemOption.SelectAll.a()) {
            Ia.a<r> aVar4 = bVar.f5342f;
            if (aVar4 != null) {
                aVar4.invoke();
            }
        } else {
            if (itemId != MenuItemOption.Autofill.a()) {
                return false;
            }
            Ia.a<r> aVar5 = bVar.f5343g;
            if (aVar5 != null) {
                aVar5.invoke();
            }
        }
        if (actionMode != null) {
            actionMode.finish();
        }
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        b bVar = this.f5336a;
        bVar.getClass();
        if (menu == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null menu");
        }
        if (actionMode == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null mode");
        }
        if (bVar.f5339c != null) {
            b.a(menu, MenuItemOption.Copy);
        }
        if (bVar.f5340d != null) {
            b.a(menu, MenuItemOption.Paste);
        }
        if (bVar.f5341e != null) {
            b.a(menu, MenuItemOption.Cut);
        }
        if (bVar.f5342f != null) {
            b.a(menu, MenuItemOption.SelectAll);
        }
        if (bVar.f5343g == null) {
            return true;
        }
        b.a(menu, MenuItemOption.Autofill);
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        Ia.a<r> aVar = this.f5336a.f5337a;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        f fVar = this.f5336a.f5338b;
        if (rect != null) {
            rect.set((int) fVar.f3757a, (int) fVar.f3758b, (int) fVar.f3759c, (int) fVar.f3760d);
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        b bVar = this.f5336a;
        bVar.getClass();
        if (actionMode == null || menu == null) {
            return false;
        }
        b.b(menu, MenuItemOption.Copy, bVar.f5339c);
        b.b(menu, MenuItemOption.Paste, bVar.f5340d);
        b.b(menu, MenuItemOption.Cut, bVar.f5341e);
        b.b(menu, MenuItemOption.SelectAll, bVar.f5342f);
        b.b(menu, MenuItemOption.Autofill, bVar.f5343g);
        return true;
    }
}
