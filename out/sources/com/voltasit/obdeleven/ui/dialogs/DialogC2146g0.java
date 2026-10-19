package com.voltasit.obdeleven.ui.dialogs;

import android.app.Dialog;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Toast;
import com.bumptech.glide.load.engine.GlideException;
import com.parse.ParseFile;
import com.parse.boltsinternal.Task;
import com.parse.boltsinternal.TaskCompletionSource;
import com.voltasit.obdeleven.Application;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.core.BodyType;
import com.voltasit.obdeleven.interfaces.SimpleAnimationListener;
import com.voltasit.obdeleven.presentation.controlUnit.ViewOnClickListenerC2130d;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import com.voltasit.obdeleven.ui.dialogs.DialogC2146g0.a;
import com.voltasit.obdeleven.ui.view.SpinnerDropDown;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p220r9.C2786s;

/* JADX INFO: renamed from: com.voltasit.obdeleven.ui.dialogs.g0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ModelDialog.java */
/* JADX INFO: loaded from: classes3.dex */
public final class DialogC2146g0 extends Dialog {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f33952l = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SpinnerDropDown f33953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SpinnerDropDown f33954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SpinnerDropDown f33955d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ProgressBar f33956e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public LinearLayout f33957f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ImageView f33958g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final MainActivity f33959h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<p315z8.c> f33960i;
    public p255u9.F j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c f33961k;

    /* JADX INFO: renamed from: com.voltasit.obdeleven.ui.dialogs.g0$a */
    /* JADX INFO: compiled from: ModelDialog.java */
    public class a implements T3.c<Drawable> {
        public a() {
        }

        @Override // T3.c
        public final void b(Object obj) {
            DialogC2146g0 dialogC2146g0 = DialogC2146g0.this;
            dialogC2146g0.f33956e.setVisibility(8);
            dialogC2146g0.f33958g.setVisibility(0);
        }

        @Override // T3.c
        public final void c(GlideException glideException) {
            DialogC2146g0 dialogC2146g0 = DialogC2146g0.this;
            dialogC2146g0.f33956e.setVisibility(8);
            MainActivity mainActivity = dialogC2146g0.f33959h;
            if (com.voltasit.obdeleven.domain.usecases.device.u.k(mainActivity)) {
                Toast.makeText(mainActivity, mainActivity.getString(R.string.common_something_went_wrong), 1).show();
            } else {
                Toast.makeText(mainActivity, mainActivity.getString(R.string.common_check_network), 1).show();
            }
        }
    }

    /* JADX INFO: renamed from: com.voltasit.obdeleven.ui.dialogs.g0$b */
    /* JADX INFO: compiled from: ModelDialog.java */
    public class b implements c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TaskCompletionSource f33963b;

        public b(TaskCompletionSource taskCompletionSource) {
            this.f33963b = taskCompletionSource;
        }

        @Override // com.voltasit.obdeleven.ui.dialogs.DialogC2146g0.c
        public final void b() {
            this.f33963b.setResult(null);
        }

        @Override // com.voltasit.obdeleven.ui.dialogs.DialogC2146g0.c
        public final void c(p255u9.F f10) {
            this.f33963b.setResult(f10);
        }
    }

    /* JADX INFO: renamed from: com.voltasit.obdeleven.ui.dialogs.g0$c */
    /* JADX INFO: compiled from: ModelDialog.java */
    public interface c {
        void b();

        void c(p255u9.F f10);
    }

    public DialogC2146g0(MainActivity mainActivity, List<p315z8.c> list) {
        super(mainActivity);
        this.f33959h = mainActivity;
        this.f33960i = list;
        setCancelable(false);
    }

    public final void a(SpinnerDropDown spinnerDropDown, ArrayList arrayList) {
        this.j = null;
        spinnerDropDown.setItems(arrayList);
        spinnerDropDown.setSelection(spinnerDropDown.getCount() - 1);
    }

    public final Task<p255u9.F> b() {
        p279w9.b bVar = Application.f29634b;
        P8.c.a(3, "ModelDialog", "showTask", Arrays.copyOf(new Object[0], 0));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f33961k = new b(taskCompletionSource);
        show();
        return taskCompletionSource.getTask();
    }

    public final void c(ParseFile parseFile) {
        final String url = parseFile != null ? parseFile.getUrl() : "";
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(getContext(), android.R.anim.fade_out);
        Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(getContext(), android.R.anim.fade_in);
        animationLoadAnimation.setDuration(250L);
        animationLoadAnimation2.setDuration(250L);
        animationLoadAnimation.setAnimationListener(new SimpleAnimationListener() { // from class: com.voltasit.obdeleven.ui.dialogs.e0
            @Override // com.voltasit.obdeleven.interfaces.SimpleAnimationListener
            public final void a(SimpleAnimationListener.AnimationState animationState) {
                SimpleAnimationListener.AnimationState animationState2 = SimpleAnimationListener.AnimationState.f31115c;
                DialogC2146g0 dialogC2146g0 = this.f33931a;
                if (animationState != animationState2) {
                    dialogC2146g0.getClass();
                    return;
                }
                dialogC2146g0.f33956e.setVisibility(0);
                dialogC2146g0.f33958g.setVisibility(4);
                com.bumptech.glide.d<Drawable> dVarM = com.bumptech.glide.b.d(dialogC2146g0.f33958g).m(url);
                T3.d dVarJ = ((T3.d) B8.E0.a(R.drawable.vehicle_default)).f(R.drawable.vehicle_default).j(R.drawable.vehicle_default);
                kotlin.jvm.internal.i.d(dVarJ, "placeholder(...)");
                com.bumptech.glide.d<Drawable> dVarA = dVarM.a(dVarJ);
                dVarA.y(dialogC2146g0.new a());
                dVarA.x(dialogC2146g0.f33958g);
            }
        });
        this.f33958g.startAnimation(animationLoadAnimation);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        if (getWindow() != null) {
            getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        }
        setContentView(R.layout.dialog_model);
        this.f33957f = (LinearLayout) findViewById(R.id.modelDialog_root);
        this.f33953b = (SpinnerDropDown) findViewById(R.id.modelDialog_model);
        this.f33954c = (SpinnerDropDown) findViewById(R.id.modelDialog_modification);
        this.f33955d = (SpinnerDropDown) findViewById(R.id.modelDialog_body);
        Button button = (Button) findViewById(R.id.modelDialog_cancel);
        Button button2 = (Button) findViewById(R.id.modelDialog_ok);
        this.f33958g = (ImageView) findViewById(R.id.modelDialog_image);
        this.f33956e = (ProgressBar) findViewById(R.id.modelDialog_progress);
        MainActivity mainActivity = this.f33959h;
        if (mainActivity.E()) {
            this.f33958g.setMaxHeight(W8.a.a(mainActivity) / 2);
            this.f33957f.getLayoutParams().width = (C2786s.b(mainActivity) / 100) * 40;
        } else {
            this.f33957f.getLayoutParams().width = (int) (((double) getContext().getResources().getDisplayMetrics().widthPixels) * 0.9d);
        }
        this.f33953b.setTitle(mainActivity.getString(R.string.common_select) + ":");
        this.f33954c.setTitle(mainActivity.getString(R.string.common_select) + ":");
        this.f33955d.setTitle(mainActivity.getString(R.string.common_select) + ":");
        this.f33953b.setOnItemSelectedListener(new O8.e() { // from class: com.voltasit.obdeleven.ui.dialogs.b0
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public final void onItemSelected(AdapterView adapterView, View view, int i10, long j) {
                DialogC2146g0 dialogC2146g0 = this.f33907b;
                List<p315z8.c> list = dialogC2146g0.f33960i;
                if (list.size() <= i10) {
                    dialogC2146g0.a(dialogC2146g0.f33954c, new ArrayList());
                    return;
                }
                p315z8.c cVar = list.get(i10);
                ArrayList arrayList = new ArrayList();
                Iterator it = cVar.f48949b.iterator();
                while (it.hasNext()) {
                    arrayList.add(((p315z8.d) it.next()).f48950a);
                }
                dialogC2146g0.a(dialogC2146g0.f33954c, arrayList);
            }
        });
        this.f33954c.setOnItemSelectedListener(new O8.e() { // from class: com.voltasit.obdeleven.ui.dialogs.c0
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public final void onItemSelected(AdapterView adapterView, View view, int i10, long j) {
                DialogC2146g0 dialogC2146g0 = this.f33910b;
                p315z8.c cVar = dialogC2146g0.f33960i.get(dialogC2146g0.f33953b.getSelectedItemPosition());
                if (i10 >= cVar.f48949b.size()) {
                    dialogC2146g0.a(dialogC2146g0.f33955d, new ArrayList());
                    return;
                }
                p315z8.d dVar = (p315z8.d) cVar.f48949b.get(i10);
                ArrayList arrayList = new ArrayList();
                Collections.sort(dVar.f48951b, new C2144f0());
                Iterator it = dVar.f48951b.iterator();
                while (it.hasNext()) {
                    arrayList.add(BodyType.a(((p255u9.F) it.next()).getInt("body")).c(dialogC2146g0.getContext()));
                }
                dialogC2146g0.a(dialogC2146g0.f33955d, arrayList);
            }
        });
        this.f33955d.setOnItemSelectedListener(new O8.e() { // from class: com.voltasit.obdeleven.ui.dialogs.d0
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public final void onItemSelected(AdapterView adapterView, View view, int i10, long j) {
                DialogC2146g0 dialogC2146g0 = this.f33913b;
                p315z8.d dVar = (p315z8.d) dialogC2146g0.f33960i.get(dialogC2146g0.f33953b.getSelectedItemPosition()).f48949b.get(dialogC2146g0.f33954c.getSelectedItemPosition());
                if (dialogC2146g0.f33955d.getSelectedItemPosition() >= dVar.f48951b.size()) {
                    return;
                }
                p255u9.F f10 = (p255u9.F) dVar.f48951b.get(dialogC2146g0.f33955d.getSelectedItemPosition());
                dialogC2146g0.j = f10;
                dialogC2146g0.c(f10.getParseFile("picture"));
            }
        });
        button.setOnClickListener(new com.braze.ui.inappmessage.views.d(1, this));
        button2.setOnClickListener(new ViewOnClickListenerC2130d(this, 1));
        ArrayList arrayList = new ArrayList();
        Iterator<p315z8.c> it = this.f33960i.iterator();
        while (it.hasNext()) {
            p255u9.D d10 = it.next().f48948a;
            StringBuilder sbE = C4.b.e(d10.a().concat(" ("));
            sbE.append(d10.getInt("startYear"));
            String strB = androidx.compose.ui.text.font.s.b(sbE.toString(), "…");
            if (d10.getInt("endYear") > 0) {
                StringBuilder sbE2 = C4.b.e(strB);
                sbE2.append(d10.getInt("endYear"));
                strB = sbE2.toString();
            }
            arrayList.add(strB + ")");
            c(d10.getParseFile("picture"));
        }
        a(this.f33953b, arrayList);
    }

    /* JADX INFO: renamed from: com.voltasit.obdeleven.ui.dialogs.g0$d */
    /* JADX INFO: compiled from: ModelDialog.java */
    public interface d extends c {
        @Override // com.voltasit.obdeleven.ui.dialogs.DialogC2146g0.c
        default void b() {
        }
    }
}
