package S;

import I.f;
import android.R;
import android.os.Build;
import android.view.Menu;
import androidx.compose.ui.platform.actionmodecallback.MenuItemOption;
import kotlin.NoWhenBranchMatchedException;
import p293xa.r;

/* JADX INFO: compiled from: TextActionModeCallback.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ia.a<r> f5337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f5338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Ia.a<r> f5339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Ia.a<r> f5340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Ia.a<r> f5341e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Ia.a<r> f5342f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Ia.a<r> f5343g;

    public b(Ia.a aVar) {
        f fVar = f.f3756e;
        this.f5337a = aVar;
        this.f5338b = fVar;
        this.f5339c = null;
        this.f5340d = null;
        this.f5341e = null;
        this.f5342f = null;
        this.f5343g = null;
    }

    public static void a(Menu menu, MenuItemOption menuItemOption) {
        int i10;
        int iA = menuItemOption.a();
        int iB = menuItemOption.b();
        int iOrdinal = menuItemOption.ordinal();
        if (iOrdinal == 0) {
            i10 = R.string.copy;
        } else if (iOrdinal == 1) {
            i10 = R.string.paste;
        } else if (iOrdinal == 2) {
            i10 = R.string.cut;
        } else if (iOrdinal == 3) {
            i10 = R.string.selectAll;
        } else {
            if (iOrdinal != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i10 = Build.VERSION.SDK_INT <= 26 ? com.voltasit.obdeleven.R.string.autofill : R.string.autofill;
        }
        menu.add(0, iA, iB, i10).setShowAsAction(1);
    }

    public static void b(Menu menu, MenuItemOption menuItemOption, Ia.a aVar) {
        if (aVar != null && menu.findItem(menuItemOption.a()) == null) {
            a(menu, menuItemOption);
        } else {
            if (aVar != null || menu.findItem(menuItemOption.a()) == null) {
                return;
            }
            menu.removeItem(menuItemOption.a());
        }
    }
}
