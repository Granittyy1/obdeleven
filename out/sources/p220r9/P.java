package p220r9;

import U5.g;
import android.app.Activity;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import androidx.fragment.app.ActivityC1347l;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.controlunitlist.online.OnlineControlUnitListFragment;
import java.util.ArrayList;
import kotlin.jvm.internal.i;
import p033c7.b0;

/* JADX INFO: compiled from: SnackbarHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public final class P {

    /* JADX INFO: compiled from: SnackbarHelper.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Activity f46430a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f46431b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public View.OnClickListener f46432c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f46433d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f46434e = R.color.snackbar_negative;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public View f46435f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public b0 f46436g;

        /* JADX INFO: renamed from: r9.P$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: SnackbarHelper.java */
        public class C0525a extends BaseTransientBottomBar.e<Snackbar> {
            public C0525a() {
            }

            @Override // com.google.android.material.snackbar.BaseTransientBottomBar.e
            public final void a(BaseTransientBottomBar baseTransientBottomBar, int i10) {
                OnlineControlUnitListFragment this$0 = (OnlineControlUnitListFragment) a.this.f46436g.f22427b;
                i.e(this$0, "this$0");
                this$0.E(R.string.snackbar_failed_to_save_history);
            }
        }

        public a(Activity activity) {
            this.f46430a = activity;
        }

        public final Snackbar a() {
            View viewFindViewById = this.f46435f;
            Activity activity = this.f46430a;
            if (viewFindViewById == null) {
                viewFindViewById = activity.findViewById(android.R.id.content);
            }
            Snackbar snackbarH = Snackbar.h(viewFindViewById, this.f46431b, 0);
            View.OnClickListener onClickListener = this.f46432c;
            BaseTransientBottomBar.g gVar = snackbarH.f27396i;
            if (onClickListener != null) {
                CharSequence text = snackbarH.f27395h.getText(this.f46433d);
                Button actionView = ((SnackbarContentLayout) gVar.getChildAt(0)).getActionView();
                if (TextUtils.isEmpty(text)) {
                    actionView.setVisibility(8);
                    actionView.setOnClickListener(null);
                    snackbarH.f27429D = false;
                } else {
                    snackbarH.f27429D = true;
                    actionView.setVisibility(0);
                    actionView.setText(text);
                    actionView.setOnClickListener(new g(snackbarH, 0, onClickListener));
                }
            }
            if (this.f46436g != null) {
                C0525a c0525a = new C0525a();
                if (snackbarH.f27407u == null) {
                    snackbarH.f27407u = new ArrayList();
                }
                snackbarH.f27407u.add(c0525a);
            }
            ((SnackbarContentLayout) gVar.getChildAt(0)).getActionView().setTextColor(activity.getResources().getColor(android.R.color.white));
            GradientDrawable gradientDrawable = (GradientDrawable) activity.getResources().getDrawable(R.drawable.snackbar_background_all_round_corners);
            gradientDrawable.setColor(activity.getResources().getColor(this.f46434e));
            gVar.setBackground(gradientDrawable);
            return snackbarH;
        }

        public final void b(int i10) {
            this.f46431b = this.f46430a.getString(i10);
        }
    }

    public static Snackbar a(Activity activity, String str) {
        a aVar = new a(activity);
        aVar.f46431b = str;
        aVar.f46434e = R.color.snackbar_negative;
        Snackbar snackbarA = aVar.a();
        snackbarA.i();
        return snackbarA;
    }

    public static void b(Activity activity, int i10) {
        a(activity, activity.getString(i10));
    }

    public static void c(View view, ActivityC1347l activityC1347l, String str) {
        a aVar = new a(activityC1347l);
        aVar.f46431b = str;
        aVar.f46435f = view;
        aVar.f46434e = R.color.snackbar_negative;
        aVar.a().i();
    }

    public static Snackbar d(ActivityC1347l activityC1347l, int i10, int i11, View.OnClickListener onClickListener) {
        a aVar = new a(activityC1347l);
        aVar.b(i10);
        aVar.f46434e = R.color.snackbar_negative;
        aVar.f46433d = i11;
        aVar.f46432c = onClickListener;
        Snackbar snackbarA = aVar.a();
        snackbarA.i();
        return snackbarA;
    }

    public static Snackbar e(Activity activity, String str) {
        a aVar = new a(activity);
        aVar.f46431b = str;
        aVar.f46434e = R.color.snackbar_positive;
        Snackbar snackbarA = aVar.a();
        snackbarA.i();
        return snackbarA;
    }

    public static void f(Activity activity, int i10) {
        e(activity, activity.getString(i10));
    }

    public static void g(View view, ActivityC1347l activityC1347l, int i10) {
        a aVar = new a(activityC1347l);
        aVar.b(i10);
        aVar.f46434e = R.color.snackbar_positive;
        aVar.f46435f = view;
        aVar.a().i();
    }
}
