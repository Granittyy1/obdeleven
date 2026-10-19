package com.voltasit.obdeleven.presentation.dialogs.bonus;

import B8.AbstractC0652t;
import Ia.l;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC1347l;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.D;
import androidx.lifecycle.Z;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import com.parse.ParseConfig;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.domain.models.SubscriptionType;
import com.voltasit.obdeleven.presentation.dialogs.e;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.C2680e;
import org.koin.androidx.viewmodel.scope.ScopeExtKt;
import p220r9.P;
import p293xa.r;

/* JADX INFO: compiled from: BonusDialog.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class BonusDialog extends e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f32195s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Ia.a<r> f32196t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Bundle f32197u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f32198v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public AbstractC0652t f32199w;

    /* JADX INFO: compiled from: BonusDialog.kt */
    public static final class a implements D, f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Lambda f32200b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(l lVar) {
            this.f32200b = (Lambda) lVar;
        }

        @Override // kotlin.jvm.internal.f
        public final p293xa.e<?> b() {
            return this.f32200b;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Ia.l, kotlin.jvm.internal.Lambda] */
        @Override // androidx.lifecycle.D
        public final /* synthetic */ void d(Object obj) {
            this.f32200b.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof D) || !(obj instanceof f)) {
                return false;
            }
            return this.f32200b.equals(((f) obj).b());
        }

        public final int hashCode() {
            return this.f32200b.hashCode();
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.voltasit.obdeleven.presentation.dialogs.bonus.BonusDialog$special$$inlined$stateViewModel$default$1] */
    public BonusDialog() {
        final Ia.a<Ob.a> aVar = new Ia.a<Ob.a>() { // from class: com.voltasit.obdeleven.presentation.dialogs.bonus.BonusDialog$bonusDialogViewModel$2
            {
                super(0);
            }

            @Override // Ia.a
            public final Ob.a invoke() {
                Bundle arguments = this.this$0.getArguments();
                if (arguments == null) {
                    arguments = new Bundle();
                }
                String string = arguments.getString("key_cpuid", "");
                i.d(string, "getString(...)");
                String string2 = arguments.getString("key_mac", "");
                i.d(string2, "getString(...)");
                String string3 = arguments.getString("key_serial", "");
                i.d(string3, "getString(...)");
                int i10 = arguments.getInt("key_credits_from_device", 0);
                boolean z10 = arguments.getBoolean("key_user_can_consume_pro", false);
                SubscriptionType.a aVar2 = SubscriptionType.f30540b;
                String string4 = arguments.getString("key_subscription_type");
                String str = string4 != null ? string4 : "";
                aVar2.getClass();
                return new Ob.a(2, k.f0(new Object[]{new c(string, string2, string3, i10, z10, SubscriptionType.a.a(str))}));
            }
        };
        final Ia.a<Bundle> aVarA = ScopeExtKt.a();
        final ?? r10 = new Ia.a<Fragment>(this) { // from class: com.voltasit.obdeleven.presentation.dialogs.bonus.BonusDialog$special$$inlined$stateViewModel$default$1
            final /* synthetic */ Fragment $this_stateViewModel;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_stateViewModel = this;
            }

            @Override // Ia.a
            public final Fragment invoke() {
                return this.$this_stateViewModel;
            }
        };
        this.f32198v = kotlin.a.b(LazyThreadSafetyMode.f42973d, new Ia.a<BonusDialogViewModel>(this) { // from class: com.voltasit.obdeleven.presentation.dialogs.bonus.BonusDialog$special$$inlined$stateViewModel$default$2
            final /* synthetic */ Pb.a $qualifier = null;
            final /* synthetic */ Fragment $this_stateViewModel;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_stateViewModel = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.Y, com.voltasit.obdeleven.presentation.dialogs.bonus.BonusDialogViewModel] */
            @Override // Ia.a
            public final BonusDialogViewModel invoke() {
                Fragment fragment = this.$this_stateViewModel;
                Pb.a aVar2 = this.$qualifier;
                Ia.a aVar3 = aVarA;
                Ia.a aVar4 = r10;
                Ia.a aVar5 = aVar;
                b0 viewModelStore = ((c0) aVar4.invoke()).getViewModelStore();
                p014b1.a aVarA2 = Hb.a.a((Bundle) aVar3.invoke(), fragment);
                if (aVarA2 == null) {
                    aVarA2 = fragment.getDefaultViewModelCreationExtras();
                    i.d(aVarA2, "<get-defaultViewModelCreationExtras>(...)");
                }
                return Gb.a.a(kotlin.jvm.internal.l.a(BonusDialogViewModel.class), viewModelStore, null, aVarA2, aVar2, Cb.a.i(fragment), aVar5);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xa.g] */
    public final BonusDialogViewModel B() {
        return (BonusDialogViewModel) this.f32198v.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        i.e(inflater, "inflater");
        LayoutInflater layoutInflater = getLayoutInflater();
        int i10 = AbstractC0652t.f2146y;
        AbstractC0652t abstractC0652t = (AbstractC0652t) M0.e.a(layoutInflater, R.layout.dialog_bonus, null, false, null);
        i.d(abstractC0652t, "inflate(...)");
        this.f32199w = abstractC0652t;
        abstractC0652t.q(getViewLifecycleOwner());
        AbstractC0652t abstractC0652t2 = this.f32199w;
        if (abstractC0652t2 == null) {
            i.m("binding");
            throw null;
        }
        abstractC0652t2.t(B());
        B().f32207t.e(getViewLifecycleOwner(), new a(new l<r, r>() { // from class: com.voltasit.obdeleven.presentation.dialogs.bonus.BonusDialog$setupObservers$1
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(r rVar) {
                this.this$0.y();
                return r.f47939a;
            }
        }));
        B().f32120i.e(getViewLifecycleOwner(), new a(new l<Integer, r>() { // from class: com.voltasit.obdeleven.presentation.dialogs.bonus.BonusDialog$setupObservers$2
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(Integer num) {
                Integer num2 = num;
                ActivityC1347l activityC1347lRequireActivity = this.this$0.requireActivity();
                i.b(num2);
                P.b(activityC1347lRequireActivity, num2.intValue());
                return r.f47939a;
            }
        }));
        B().f32123m.e(getViewLifecycleOwner(), new a(new l<Integer, r>() { // from class: com.voltasit.obdeleven.presentation.dialogs.bonus.BonusDialog$setupObservers$3
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(Integer num) {
                Integer num2 = num;
                ActivityC1347l activityC1347lRequireActivity = this.this$0.requireActivity();
                i.b(num2);
                P.f(activityC1347lRequireActivity, num2.intValue());
                return r.f47939a;
            }
        }));
        B().f32210w.e(getViewLifecycleOwner(), new a(new l<SubscriptionType, r>() { // from class: com.voltasit.obdeleven.presentation.dialogs.bonus.BonusDialog$setupObservers$4

            /* JADX INFO: compiled from: BonusDialog.kt */
            public /* synthetic */ class a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f32201a;

                static {
                    int[] iArr = new int[SubscriptionType.values().length];
                    try {
                        SubscriptionType.a aVar = SubscriptionType.f30540b;
                        iArr[1] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        SubscriptionType.a aVar2 = SubscriptionType.f30540b;
                        iArr[3] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    f32201a = iArr;
                }
            }

            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(SubscriptionType subscriptionType) {
                String string;
                SubscriptionType subscriptionType2 = subscriptionType;
                int i11 = subscriptionType2 == null ? -1 : a.f32201a[subscriptionType2.ordinal()];
                if (i11 != 1) {
                    string = i11 != 2 ? "" : this.this$0.getString(R.string.dialog_digital_content_ultimate_plan);
                } else {
                    string = this.this$0.getString(R.string.dialog_digital_content_pro_plan);
                }
                i.b(string);
                AbstractC0652t abstractC0652t3 = this.this$0.f32199w;
                if (abstractC0652t3 != null) {
                    abstractC0652t3.f2152w.setText(string);
                    return r.f47939a;
                }
                i.m("binding");
                throw null;
            }
        }));
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f32197u = bundle;
        i.b(bundle);
        if (bundle.containsKey("key_credits_from_device")) {
            Bundle bundle2 = this.f32197u;
            i.b(bundle2);
            this.f32195s = bundle2.getInt("key_credits_from_device");
        }
        Date time = Calendar.getInstance().getTime();
        Date date = ParseConfig.getCurrentConfig().getDate("device_bonus_start_date");
        i.d(date, "getDate(...)");
        Date date2 = ParseConfig.getCurrentConfig().getDate("device_bonus_end_date");
        i.d(date2, "getDate(...)");
        String string = ParseConfig.getCurrentConfig().getString("device_bonus_string");
        i.d(string, "getString(...)");
        if (time.before(date2) && time.after(date)) {
            int i11 = ParseConfig.getCurrentConfig().getInt("device_bonus_multiplier");
            int i12 = this.f32195s;
            int i13 = (i11 * i12) - i12;
            AbstractC0652t abstractC0652t3 = this.f32199w;
            if (abstractC0652t3 == null) {
                i.m("binding");
                throw null;
            }
            abstractC0652t3.f2151v.setText(String.format(Locale.ENGLISH, "%d + %d %s %s", Arrays.copyOf(new Object[]{Integer.valueOf(i12), Integer.valueOf(i13), getString(R.string.common_credits), string}, 4)));
        } else {
            AbstractC0652t abstractC0652t4 = this.f32199w;
            if (abstractC0652t4 == null) {
                i.m("binding");
                throw null;
            }
            abstractC0652t4.f2151v.setText(String.format(Locale.ENGLISH, "%d %s", Arrays.copyOf(new Object[]{Integer.valueOf(this.f32195s), getString(R.string.common_credits)}, 2)));
        }
        AbstractC0652t abstractC0652t5 = this.f32199w;
        if (abstractC0652t5 == null) {
            i.m("binding");
            throw null;
        }
        abstractC0652t5.f2147r.setOnClickListener(new View.OnClickListener() { // from class: com.voltasit.obdeleven.presentation.dialogs.bonus.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BonusDialog this$0 = this.f32215b;
                i.e(this$0, "this$0");
                AbstractC0652t abstractC0652t6 = this$0.f32199w;
                if (abstractC0652t6 == null) {
                    i.m("binding");
                    throw null;
                }
                abstractC0652t6.f2149t.setVisibility(0);
                AbstractC0652t abstractC0652t7 = this$0.f32199w;
                if (abstractC0652t7 == null) {
                    i.m("binding");
                    throw null;
                }
                abstractC0652t7.f2150u.setVisibility(8);
                AbstractC0652t abstractC0652t8 = this$0.f32199w;
                if (abstractC0652t8 == null) {
                    i.m("binding");
                    throw null;
                }
                abstractC0652t8.f2151v.setVisibility(8);
                AbstractC0652t abstractC0652t9 = this$0.f32199w;
                if (abstractC0652t9 == null) {
                    i.m("binding");
                    throw null;
                }
                abstractC0652t9.f2152w.setVisibility(8);
                AbstractC0652t abstractC0652t10 = this$0.f32199w;
                if (abstractC0652t10 == null) {
                    i.m("binding");
                    throw null;
                }
                abstractC0652t10.f2147r.setVisibility(8);
                AbstractC0652t abstractC0652t11 = this$0.f32199w;
                if (abstractC0652t11 == null) {
                    i.m("binding");
                    throw null;
                }
                abstractC0652t11.f2148s.setVisibility(8);
                BonusDialogViewModel bonusDialogViewModelB = this$0.B();
                AbstractC0652t abstractC0652t12 = this$0.f32199w;
                if (abstractC0652t12 == null) {
                    i.m("binding");
                    throw null;
                }
                boolean zIsChecked = abstractC0652t12.f2152w.isChecked();
                AbstractC0652t abstractC0652t13 = this$0.f32199w;
                if (abstractC0652t13 == null) {
                    i.m("binding");
                    throw null;
                }
                boolean zIsChecked2 = abstractC0652t13.f2151v.isChecked();
                bonusDialogViewModelB.getClass();
                C2680e.c(Z.a(bonusDialogViewModelB), bonusDialogViewModelB.f32112a, null, new BonusDialogViewModel$consumeDeviceBonus$1(zIsChecked2, zIsChecked, bonusDialogViewModelB, null), 2);
            }
        });
        AbstractC0652t abstractC0652t6 = this.f32199w;
        if (abstractC0652t6 == null) {
            i.m("binding");
            throw null;
        }
        abstractC0652t6.f2148s.setOnClickListener(new b(0, this));
        AbstractC0652t abstractC0652t7 = this.f32199w;
        if (abstractC0652t7 != null) {
            return abstractC0652t7.f4488d;
        }
        i.m("binding");
        throw null;
    }

    @Override // com.voltasit.obdeleven.presentation.dialogs.e
    public final void y() {
        Ia.a<r> aVar = this.f32196t;
        i.b(aVar);
        aVar.invoke();
        super.y();
    }
}
