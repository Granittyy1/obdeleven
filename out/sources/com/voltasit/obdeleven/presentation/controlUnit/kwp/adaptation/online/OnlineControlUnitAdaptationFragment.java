package com.voltasit.obdeleven.presentation.controlUnit.kwp.adaptation.online;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.D;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.obdeleven.service.exception.CommandException;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.util.Texttabe;
import com.parse.ParseException;
import com.parse.ParseUser;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.core.app.C2086b;
import com.voltasit.obdeleven.presentation.pro.BaseProFragment;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import com.voltasit.obdeleven.ui.dialogs.C2134a0;
import com.voltasit.obdeleven.utils.UserTrackingUtils;
import com.voltasit.parse.model.AdaptationType;
import com.voltasit.parse.model.HistoryDB;
import java.util.Arrays;
import java.util.concurrent.Callable;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.n;
import org.json.JSONException;
import org.json.JSONObject;
import p220r9.P;
import p255u9.E;
import p255u9.z;
import p293xa.r;

/* JADX INFO: compiled from: OnlineControlUnitAdaptationFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class OnlineControlUnitAdaptationFragment extends com.voltasit.obdeleven.presentation.controlUnit.kwp.adaptation.a implements View.OnLongClickListener, Jb.a {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final Object f31692L = kotlin.a.b(LazyThreadSafetyMode.f42971b, new Ia.a<J8.a>(this) { // from class: com.voltasit.obdeleven.presentation.controlUnit.kwp.adaptation.online.OnlineControlUnitAdaptationFragment$special$$inlined$inject$default$1
        final /* synthetic */ Jb.a $this_inject;
        final /* synthetic */ Pb.a $qualifier = null;
        final /* synthetic */ Ia.a $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
            this.$this_inject = this;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [J8.a, java.lang.Object] */
        @Override // Ia.a
        public final J8.a invoke() {
            Jb.a aVar = this.$this_inject;
            Pb.a aVar2 = this.$qualifier;
            return (aVar instanceof Jb.b ? ((Jb.b) aVar).b() : aVar.i().f3935a.f5143b).a(this.$parameters, aVar2, l.a(J8.a.class));
        }
    });

    /* JADX INFO: compiled from: OnlineControlUnitAdaptationFragment.kt */
    public static final class a implements D, f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Lambda f31693b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Ia.l lVar) {
            this.f31693b = (Lambda) lVar;
        }

        @Override // kotlin.jvm.internal.f
        public final p293xa.e<?> b() {
            return this.f31693b;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Ia.l, kotlin.jvm.internal.Lambda] */
        @Override // androidx.lifecycle.D
        public final /* synthetic */ void d(Object obj) {
            this.f31693b.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof D) || !(obj instanceof f)) {
                return false;
            }
            return this.f31693b.equals(((f) obj).b());
        }

        public final int hashCode() {
            return this.f31693b.hashCode();
        }
    }

    /* JADX INFO: compiled from: OnlineControlUnitAdaptationFragment.kt */
    public static final class b<TTaskResult, TContinuationResult> implements Continuation {
        public b() {
        }

        @Override // com.parse.boltsinternal.Continuation
        public final Object then(Task task) {
            i.e(task, "task");
            boolean zIsFaulted = task.isFaulted();
            OnlineControlUnitAdaptationFragment onlineControlUnitAdaptationFragment = OnlineControlUnitAdaptationFragment.this;
            if (!zIsFaulted) {
                MainActivity mainActivityQ = onlineControlUnitAdaptationFragment.q();
                P.e(mainActivityQ, mainActivityQ.getString(R.string.snackbar_adaptation_test_accepted));
                return null;
            }
            Exception error = task.getError();
            i.c(error, "null cannot be cast to non-null type com.obdeleven.service.exception.CommandException");
            int iA = ((CommandException) error).a();
            if (iA != -1) {
                P.a(onlineControlUnitAdaptationFragment.q(), String.format("(%02X) %s", Arrays.copyOf(new Object[]{Integer.valueOf(iA), Texttabe.a(iA)}, 2)));
                return null;
            }
            MainActivity mainActivityQ2 = onlineControlUnitAdaptationFragment.q();
            P.a(mainActivityQ2, mainActivityQ2.getString(R.string.common_request_timeout));
            return null;
        }
    }

    /* JADX INFO: compiled from: OnlineControlUnitAdaptationFragment.kt */
    public static final class c<TTaskResult, TContinuationResult> implements Continuation {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p146l8.a f31696b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f31697c;

        public c(p146l8.a aVar, String str) {
            this.f31696b = aVar;
            this.f31697c = str;
        }

        @Override // com.parse.boltsinternal.Continuation
        public final Object then(Task task) {
            i.e(task, "task");
            final OnlineControlUnitAdaptationFragment onlineControlUnitAdaptationFragment = OnlineControlUnitAdaptationFragment.this;
            SwipeRefreshLayout swipeRefreshLayout = onlineControlUnitAdaptationFragment.f31679o;
            if (swipeRefreshLayout != null) {
                swipeRefreshLayout.setRefreshing(false);
            }
            if (task.isFaulted()) {
                Exception error = task.getError();
                i.c(error, "null cannot be cast to non-null type com.obdeleven.service.exception.CommandException");
                P.a(onlineControlUnitAdaptationFragment.q(), I.b.h((CommandException) error, onlineControlUnitAdaptationFragment.getContext()));
                return null;
            }
            C2134a0.b(onlineControlUnitAdaptationFragment.getContext(), R.string.common_saving);
            final p146l8.a aVar = this.f31696b;
            final String str = this.f31697c;
            Task.callInBackground(new Callable() { // from class: com.voltasit.obdeleven.presentation.controlUnit.kwp.adaptation.online.d
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    OnlineControlUnitAdaptationFragment this$0 = onlineControlUnitAdaptationFragment;
                    i.e(this$0, "this$0");
                    String finalValue = str;
                    i.e(finalValue, "$finalValue");
                    ControlUnit controlUnit = this$0.f31668B;
                    i.b(controlUnit);
                    E e10 = controlUnit.f29321c.f42726c;
                    ControlUnit controlUnit2 = this$0.f31668B;
                    p146l8.a aVar2 = aVar;
                    String strValueOf = String.valueOf(aVar2.f44412a);
                    String strC = aVar2.c();
                    HistoryDB historyDB = new HistoryDB();
                    int i10 = z.f47484b;
                    historyDB.o((z) ParseUser.getCurrentUser());
                    historyDB.setVehicle(e10);
                    historyDB.i(controlUnit2.f29320b);
                    if (controlUnit2.p() != null) {
                        historyDB.k(controlUnit2.p().f29363c);
                    }
                    historyDB.n("ADAPTATION");
                    historyDB.m(e10.getInt("mileage"));
                    historyDB.a();
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("channel", strValueOf);
                        jSONObject.put("oldValue", strC);
                        jSONObject.put("newValue", finalValue);
                        historyDB.j(jSONObject);
                        historyDB.save();
                    } catch (ParseException e11) {
                        historyDB.saveEventually();
                        return e11;
                    } catch (JSONException e12) {
                        e12.printStackTrace();
                    }
                    return null;
                }
            }).continueWith(new e(0, onlineControlUnitAdaptationFragment), Task.UI_THREAD_EXECUTOR);
            MainActivity mainActivityQ = onlineControlUnitAdaptationFragment.q();
            P.e(mainActivityQ, mainActivityQ.getString(R.string.common_adaptation_accepted));
            onlineControlUnitAdaptationFragment.P();
            ControlUnit controlUnit = onlineControlUnitAdaptationFragment.f31668B;
            i.b(controlUnit);
            controlUnit.f29320b.updateAdaptation(onlineControlUnitAdaptationFragment.f31670D, "KWP", aVar.f44412a, aVar.d(), "positive");
            ControlUnit controlUnit2 = onlineControlUnitAdaptationFragment.f31668B;
            i.b(controlUnit2);
            controlUnit2.f29320b.saveInBackgroundEventually();
            UserTrackingUtils.c(UserTrackingUtils.Key.f34242C, 1);
            onlineControlUnitAdaptationFragment.Y().setText("");
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, xa.g] */
    @Override // com.voltasit.obdeleven.presentation.controlUnit.kwp.adaptation.a, com.voltasit.obdeleven.ui.module.BaseFragment
    public final View B(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        i.e(inflater, "inflater");
        View viewB = super.B(inflater, viewGroup, bundle);
        T();
        O().c(true);
        b0().setOnLongClickListener(this);
        BaseProFragment.S(this, W());
        ?? r10 = this.f31677K;
        ((com.voltasit.obdeleven.presentation.controlUnit.kwp.adaptation.online.a) r10.getValue()).f31702s.e(getViewLifecycleOwner(), new a(new Ia.l<r, r>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.kwp.adaptation.online.OnlineControlUnitAdaptationFragment$setupObservers$1
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(r rVar) {
                OnlineControlUnitAdaptationFragment onlineControlUnitAdaptationFragment = this.this$0;
                String string = onlineControlUnitAdaptationFragment.Y().getText().toString();
                onlineControlUnitAdaptationFragment.Z().setError("");
                if (onlineControlUnitAdaptationFragment.f31670D == AdaptationType.ADAPTATION) {
                    try {
                        if (Integer.parseInt(string) > 65535) {
                            onlineControlUnitAdaptationFragment.Z().setError(onlineControlUnitAdaptationFragment.getString(R.string.common_wrong_value));
                        } else {
                            onlineControlUnitAdaptationFragment.Z().setError("");
                            onlineControlUnitAdaptationFragment.h0(string);
                        }
                    } catch (NumberFormatException unused) {
                        onlineControlUnitAdaptationFragment.Z().setError(onlineControlUnitAdaptationFragment.getString(R.string.common_enter_value));
                    }
                } else if (onlineControlUnitAdaptationFragment.b0().getText().length() != onlineControlUnitAdaptationFragment.Y().getText().length()) {
                    onlineControlUnitAdaptationFragment.Z().setError(onlineControlUnitAdaptationFragment.getString(R.string.common_wrong_value));
                } else {
                    onlineControlUnitAdaptationFragment.h0(string);
                }
                return r.f47939a;
            }
        }));
        ((com.voltasit.obdeleven.presentation.controlUnit.kwp.adaptation.online.a) r10.getValue()).f31700q.e(getViewLifecycleOwner(), new a(new Ia.l<r, r>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.kwp.adaptation.online.OnlineControlUnitAdaptationFragment$setupObservers$2
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(r rVar) {
                OnlineControlUnitAdaptationFragment onlineControlUnitAdaptationFragment = this.this$0;
                String string = onlineControlUnitAdaptationFragment.Y().getText().toString();
                onlineControlUnitAdaptationFragment.Z().setError("");
                if (onlineControlUnitAdaptationFragment.f31670D == AdaptationType.ADAPTATION) {
                    try {
                        if (Integer.parseInt(string) > 65535) {
                            onlineControlUnitAdaptationFragment.Z().setError(onlineControlUnitAdaptationFragment.getString(R.string.common_wrong_value));
                        } else {
                            onlineControlUnitAdaptationFragment.Z().setError("");
                            onlineControlUnitAdaptationFragment.i0(string);
                        }
                    } catch (NumberFormatException unused) {
                        onlineControlUnitAdaptationFragment.Z().setError(onlineControlUnitAdaptationFragment.getString(R.string.common_enter_value));
                    }
                } else if (onlineControlUnitAdaptationFragment.b0().getText().length() != onlineControlUnitAdaptationFragment.Y().getText().length()) {
                    onlineControlUnitAdaptationFragment.Z().setError(onlineControlUnitAdaptationFragment.getString(R.string.common_wrong_value));
                } else {
                    onlineControlUnitAdaptationFragment.i0(string);
                }
                return r.f47939a;
            }
        }));
        O().f32795C.e(getViewLifecycleOwner(), new a(new Ia.l<r, r>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.kwp.adaptation.online.OnlineControlUnitAdaptationFragment$setupObservers$3
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, xa.g] */
            @Override // Ia.l
            public final r invoke(r rVar) {
                U7.a<r> aVar = ((a) this.this$0.f31677K.getValue()).f31701r;
                r rVar2 = r.f47939a;
                aVar.j(rVar2);
                return rVar2;
            }
        }));
        O().f32797E.e(getViewLifecycleOwner(), new a(new Ia.l<r, r>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.kwp.adaptation.online.OnlineControlUnitAdaptationFragment$setupObservers$4
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, xa.g] */
            @Override // Ia.l
            public final r invoke(r rVar) {
                U7.a<r> aVar = ((a) this.this$0.f31677K.getValue()).f31699p;
                r rVar2 = r.f47939a;
                aVar.j(rVar2);
                return rVar2;
            }
        }));
        return viewB;
    }

    @Override // com.voltasit.obdeleven.presentation.controlUnit.kwp.adaptation.a
    public final void c0() {
        p146l8.a aVar = this.f31669C;
        ControlUnit controlUnit = this.f31668B;
        i.b(controlUnit);
        controlUnit.D(false).continueWithTask(new C2086b(aVar, this));
    }

    public final void h0(String str) {
        p146l8.a aVar = this.f31669C;
        if (this.f31670D == AdaptationType.LONG_ADAPTATION && i.a(X().getText(), "ASCII")) {
            str = n.e(str);
        }
        i.b(aVar);
        aVar.g(str).continueWith(new b(), Task.UI_THREAD_EXECUTOR);
    }

    @Override // Jb.a
    public final Ib.a i() {
        return Jb.a.C0058a.a();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, xa.g] */
    public final void i0(String str) {
        SwipeRefreshLayout swipeRefreshLayout = this.f31679o;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(true);
        }
        p146l8.a aVar = this.f31669C;
        AdaptationType adaptationType = this.f31670D;
        AdaptationType adaptationType2 = AdaptationType.LONG_ADAPTATION;
        ?? r10 = this.f31692L;
        if (adaptationType == adaptationType2 && i.a(X().getText(), "ASCII")) {
            ((J8.a) r10.getValue()).I();
            str = n.e(str);
            i.d(str, "convertStringToHex(...)");
        } else {
            ((J8.a) r10.getValue()).Y();
        }
        i.b(aVar);
        aVar.h(str).continueWith(new c(aVar, str), Task.UI_THREAD_EXECUTOR);
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String o() {
        return "OnlineControlUnitAdaptationFragment";
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View v10) {
        i.e(v10, "v");
        if (v10.getId() != R.id.controlUnitAdaptationFragment_value) {
            return false;
        }
        Y().setText(b0().getText());
        Z().setError("");
        return true;
    }
}
