package B8;

import android.util.Patterns;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.lifecycle.InterfaceC1376t;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.core.ApplicationLanguage;
import com.voltasit.obdeleven.core.DatabaseLanguage;
import com.voltasit.obdeleven.presentation.settings.SettingsViewModel;
import com.voltasit.obdeleven.ui.view.ColorPickerSeekbar;
import java.util.ArrayList;

/* JADX INFO: renamed from: B8.m0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: FragmentSettingsBindingImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C0640m0 extends AbstractC0638l0 implements N8.b.a {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public static final SparseIntArray f2044A0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final M0.h.d f2045z0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final N8.b f2046c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final N8.b f2047d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final N8.b f2048e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final N8.b f2049f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final N8.b f2050g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final N8.b f2051h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final N8.b f2052i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final N8.b f2053j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final N8.e f2054k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final N8.b f2055l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final N8.b f2056m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final N8.b f2057n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final N8.b f2058o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final N8.b f2059p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final N8.b f2060q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final N8.e f2061r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final N8.b f2062s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final N8.b f2063t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final N8.b f2064u0;
    public final N8.b v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final N8.b f2065w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final N8.b f2066x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public long f2067y0;

    static {
        M0.h.d dVar = new M0.h.d(38);
        f2045z0 = dVar;
        dVar.a(1, new String[]{"labeled_button_binding"}, new int[]{14}, new int[]{R.layout.labeled_button_binding});
        dVar.a(2, new String[]{"labeled_button_binding", "labeled_button_binding", "labeled_button_binding", "labeled_button_binding", "labeled_button_binding", "labeled_button_binding", "labeled_button_binding", "labeled_button_binding"}, new int[]{15, 16, 17, 18, 19, 20, 21, 22}, new int[]{R.layout.labeled_button_binding, R.layout.labeled_button_binding, R.layout.labeled_button_binding, R.layout.labeled_button_binding, R.layout.labeled_button_binding, R.layout.labeled_button_binding, R.layout.labeled_button_binding, R.layout.labeled_button_binding});
        dVar.a(4, new String[]{"item_button_bottom"}, new int[]{23}, new int[]{R.layout.item_button_bottom});
        dVar.a(5, new String[]{"labeled_button_binding", "labeled_button_binding"}, new int[]{24, 25}, new int[]{R.layout.labeled_button_binding, R.layout.labeled_button_binding});
        dVar.a(6, new String[]{"labeled_button_binding"}, new int[]{26}, new int[]{R.layout.labeled_button_binding});
        dVar.a(7, new String[]{"labeled_button_binding"}, new int[]{27}, new int[]{R.layout.labeled_button_binding});
        dVar.a(8, new String[]{"labeled_button_binding", "labeled_button_binding", "labeled_button_binding"}, new int[]{28, 29, 30}, new int[]{R.layout.labeled_button_binding, R.layout.labeled_button_binding, R.layout.labeled_button_binding});
        dVar.a(9, new String[]{"labeled_button_binding"}, new int[]{31}, new int[]{R.layout.labeled_button_binding});
        dVar.a(10, new String[]{"item_edit_text"}, new int[]{32}, new int[]{R.layout.item_edit_text});
        dVar.a(11, new String[]{"item_edit_text"}, new int[]{33}, new int[]{R.layout.item_edit_text});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f2044A0 = sparseIntArray;
        sparseIntArray.put(R.id.saveDataSharingEmail, 12);
        sparseIntArray.put(R.id.saveWorkshopNumber, 13);
        sparseIntArray.put(R.id.colorChangeDivider, 34);
        sparseIntArray.put(R.id.colorChangeLayout, 35);
        sparseIntArray.put(R.id.colorPickerSeekbar, 36);
        sparseIntArray.put(R.id.setColorTextView, 37);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0640m0(M0.d dVar, View view) {
        Object[] objArrK = M0.h.k(dVar, view, 38, f2045z0, f2044A0);
        super(dVar, view, (o1) objArrK[29], (o1) objArrK[26], (o1) objArrK[21], (o1) objArrK[25], (o1) objArrK[28], (U0) objArrK[23], (o1) objArrK[27], (o1) objArrK[24], (View) objArrK[34], (LinearLayout) objArrK[35], (ColorPickerSeekbar) objArrK[36], (LinearLayout) objArrK[9], (LinearLayout) objArrK[1], (o1) objArrK[14], (LinearLayout) objArrK[8], (o1) objArrK[18], (AbstractC0614a1) objArrK[32], (AbstractC0614a1) objArrK[33], (View) objArrK[12], (View) objArrK[13], (o1) objArrK[22], (TextView) objArrK[37], (LinearLayout) objArrK[2], (LinearLayout) objArrK[5], (LinearLayout) objArrK[6], (LinearLayout) objArrK[10], (LinearLayout) objArrK[7], (LinearLayout) objArrK[11], (o1) objArrK[20], (o1) objArrK[17], (o1) objArrK[15], (o1) objArrK[16], (o1) objArrK[19], (View) objArrK[3], (o1) objArrK[30], (o1) objArrK[31]);
        this.f2067y0 = -1L;
        o1 o1Var = this.f2029r;
        if (o1Var != null) {
            o1Var.j = this;
        }
        o1 o1Var2 = this.f2030s;
        if (o1Var2 != null) {
            o1Var2.j = this;
        }
        o1 o1Var3 = this.f2031t;
        if (o1Var3 != null) {
            o1Var3.j = this;
        }
        o1 o1Var4 = this.f2032u;
        if (o1Var4 != null) {
            o1Var4.j = this;
        }
        o1 o1Var5 = this.f2033v;
        if (o1Var5 != null) {
            o1Var5.j = this;
        }
        U0 u10 = this.f2034w;
        if (u10 != null) {
            u10.j = this;
        }
        o1 o1Var6 = this.f2035x;
        if (o1Var6 != null) {
            o1Var6.j = this;
        }
        o1 o1Var7 = this.f2036y;
        if (o1Var7 != null) {
            o1Var7.j = this;
        }
        this.f2003C.setTag(null);
        this.f2004D.setTag(null);
        o1 o1Var8 = this.f2005E;
        if (o1Var8 != null) {
            o1Var8.j = this;
        }
        this.f2006F.setTag(null);
        o1 o1Var9 = this.f2007G;
        if (o1Var9 != null) {
            o1Var9.j = this;
        }
        AbstractC0614a1 abstractC0614a1 = this.f2008H;
        if (abstractC0614a1 != null) {
            abstractC0614a1.j = this;
        }
        AbstractC0614a1 abstractC0614a2 = this.f2009I;
        if (abstractC0614a2 != null) {
            abstractC0614a2.j = this;
        }
        ((ScrollView) objArrK[0]).setTag(null);
        ((LinearLayout) objArrK[4]).setTag(null);
        o1 o1Var10 = this.f2012L;
        if (o1Var10 != null) {
            o1Var10.j = this;
        }
        this.f2014N.setTag(null);
        this.f2015O.setTag(null);
        this.f2016P.setTag(null);
        this.f2017Q.setTag(null);
        this.f2018R.setTag(null);
        this.f2019S.setTag(null);
        o1 o1Var11 = this.f2020T;
        if (o1Var11 != null) {
            o1Var11.j = this;
        }
        o1 o1Var12 = this.f2021U;
        if (o1Var12 != null) {
            o1Var12.j = this;
        }
        o1 o1Var13 = this.f2022V;
        if (o1Var13 != null) {
            o1Var13.j = this;
        }
        o1 o1Var14 = this.f2023W;
        if (o1Var14 != null) {
            o1Var14.j = this;
        }
        o1 o1Var15 = this.f2024X;
        if (o1Var15 != null) {
            o1Var15.j = this;
        }
        this.f2025Y.setTag(null);
        o1 o1Var16 = this.f2026Z;
        if (o1Var16 != null) {
            o1Var16.j = this;
        }
        o1 o1Var17 = this.f2027a0;
        if (o1Var17 != null) {
            o1Var17.j = this;
        }
        r(view);
        this.f2046c0 = new N8.b(this, 22);
        this.f2047d0 = new N8.b(this, 10);
        this.f2048e0 = new N8.b(this, 11);
        this.f2049f0 = new N8.b(this, 4);
        this.f2050g0 = new N8.b(this, 20);
        this.f2051h0 = new N8.b(this, 8);
        this.f2052i0 = new N8.b(this, 3);
        this.f2053j0 = new N8.b(this, 9);
        this.f2054k0 = new N8.e(this, 21);
        this.f2055l0 = new N8.b(this, 2);
        this.f2056m0 = new N8.b(this, 18);
        this.f2057n0 = new N8.b(this, 6);
        this.f2058o0 = new N8.b(this, 14);
        this.f2059p0 = new N8.b(this, 1);
        this.f2060q0 = new N8.b(this, 7);
        this.f2061r0 = new N8.e(this, 19);
        this.f2062s0 = new N8.b(this, 12);
        this.f2063t0 = new N8.b(this, 16);
        this.f2064u0 = new N8.b(this, 15);
        this.v0 = new N8.b(this, 5);
        this.f2065w0 = new N8.b(this, 17);
        this.f2066x0 = new N8.b(this, 13);
        i();
    }

    @Override // N8.b.a
    public final void a(int i10) {
        switch (i10) {
            case 1:
                SettingsViewModel settingsViewModel = this.f2028b0;
                if (settingsViewModel != null) {
                    settingsViewModel.d();
                }
                break;
            case 2:
                SettingsViewModel settingsViewModel2 = this.f2028b0;
                if (settingsViewModel2 != null) {
                    K8.o oVar = settingsViewModel2.f33160o;
                    boolean zY = oVar.y();
                    oVar.Z(!zY);
                    settingsViewModel2.f33094B.j(Y8.c.a(!zY ? R.string.common_show : R.string.common_hide, true));
                }
                break;
            case 3:
                SettingsViewModel settingsViewModel3 = this.f2028b0;
                if (settingsViewModel3 != null) {
                    K8.o oVar2 = settingsViewModel3.f33160o;
                    boolean z10 = !oVar2.u();
                    oVar2.f0(z10);
                    settingsViewModel3.f33098D.j(Y8.c.a(SettingsViewModel.f(z10), true));
                }
                break;
            case 4:
                SettingsViewModel settingsViewModel4 = this.f2028b0;
                if (settingsViewModel4 != null) {
                    K8.o oVar3 = settingsViewModel4.f33160o;
                    boolean z11 = !oVar3.d();
                    oVar3.e0(z11);
                    settingsViewModel4.f33102F.j(Y8.c.a(SettingsViewModel.f(z11), true));
                }
                break;
            case 5:
                SettingsViewModel settingsViewModel5 = this.f2028b0;
                if (settingsViewModel5 != null) {
                    settingsViewModel5.c();
                }
                break;
            case 6:
                SettingsViewModel settingsViewModel6 = this.f2028b0;
                if (settingsViewModel6 != null) {
                    K8.o oVar4 = settingsViewModel6.f33160o;
                    boolean z12 = !oVar4.V();
                    oVar4.L(z12);
                    settingsViewModel6.f33106H.j(Y8.c.a(SettingsViewModel.f(z12), true));
                }
                break;
            case 7:
                SettingsViewModel settingsViewModel7 = this.f2028b0;
                if (settingsViewModel7 != null) {
                    K8.o oVar5 = settingsViewModel7.f33160o;
                    boolean z13 = !oVar5.r();
                    oVar5.p(z13);
                    settingsViewModel7.f33110J.j(Y8.c.a(SettingsViewModel.f(z13), true));
                }
                break;
            case 8:
                SettingsViewModel settingsViewModel8 = this.f2028b0;
                if (settingsViewModel8 != null) {
                    settingsViewModel8.f33122P.j(p293xa.r.f47939a);
                }
                break;
            case 9:
                SettingsViewModel settingsViewModel9 = this.f2028b0;
                if (settingsViewModel9 != null) {
                    settingsViewModel9.f33130T.j(p293xa.r.f47939a);
                }
                break;
            case 10:
                SettingsViewModel settingsViewModel10 = this.f2028b0;
                if (settingsViewModel10 != null) {
                    settingsViewModel10.f33138X.j(p293xa.r.f47939a);
                }
                break;
            case 11:
                SettingsViewModel settingsViewModel11 = this.f2028b0;
                if (settingsViewModel11 != null) {
                    ApplicationLanguage applicationLanguageY = settingsViewModel11.f33160o.Y();
                    ApplicationLanguage[] applicationLanguageArrValues = ApplicationLanguage.values();
                    ArrayList arrayList = new ArrayList(applicationLanguageArrValues.length);
                    for (ApplicationLanguage applicationLanguage : applicationLanguageArrValues) {
                        arrayList.add(applicationLanguage.g());
                    }
                    String[] strArr = (String[]) kotlin.collections.q.g0(arrayList).toArray(new String[0]);
                    settingsViewModel11.f33149d0.j(new SettingsViewModel.b(false, applicationLanguageY.name(), strArr, kotlin.collections.k.T(applicationLanguageY.g(), strArr)));
                }
                break;
            case 12:
                SettingsViewModel settingsViewModel12 = this.f2028b0;
                if (settingsViewModel12 != null) {
                    DatabaseLanguage databaseLanguageQ = settingsViewModel12.f33160o.Q();
                    DatabaseLanguage[] databaseLanguageArrValues = DatabaseLanguage.values();
                    ArrayList arrayList2 = new ArrayList(databaseLanguageArrValues.length);
                    for (DatabaseLanguage databaseLanguage : databaseLanguageArrValues) {
                        arrayList2.add(databaseLanguage.d());
                    }
                    String[] strArr2 = (String[]) kotlin.collections.q.g0(arrayList2).toArray(new String[0]);
                    settingsViewModel12.f33149d0.j(new SettingsViewModel.b(true, databaseLanguageQ.name(), strArr2, kotlin.collections.k.T(databaseLanguageQ.d(), strArr2)));
                }
                break;
            case 13:
                SettingsViewModel settingsViewModel13 = this.f2028b0;
                if (settingsViewModel13 != null) {
                    settingsViewModel13.e();
                }
                break;
            case 14:
                SettingsViewModel settingsViewModel14 = this.f2028b0;
                if (settingsViewModel14 != null) {
                    K8.o oVar6 = settingsViewModel14.f33160o;
                    boolean zW = oVar6.w();
                    oVar6.g0(!zW);
                    settingsViewModel14.f33153h0.j(Y8.c.a(!zW ? R.string.common_metric : R.string.common_imperial, true));
                }
                break;
            case 15:
                SettingsViewModel settingsViewModel15 = this.f2028b0;
                if (settingsViewModel15 != null) {
                    settingsViewModel15.f33157l0.j(p293xa.r.f47939a);
                }
                break;
            case 16:
                SettingsViewModel settingsViewModel16 = this.f2028b0;
                if (settingsViewModel16 != null) {
                    settingsViewModel16.f33159n0.j(p293xa.r.f47939a);
                }
                break;
            case 17:
                SettingsViewModel settingsViewModel17 = this.f2028b0;
                if (settingsViewModel17 != null) {
                    K8.o oVar7 = settingsViewModel17.f33160o;
                    boolean z14 = !oVar7.o();
                    oVar7.n0(z14);
                    settingsViewModel17.f33163p0.j(Y8.c.a(SettingsViewModel.f(z14), true));
                }
                break;
            case 18:
                SettingsViewModel settingsViewModel18 = this.f2028b0;
                if (settingsViewModel18 != null) {
                    K8.o oVar8 = settingsViewModel18.f33160o;
                    boolean zC = oVar8.C();
                    oVar8.q(!zC);
                    settingsViewModel18.f33155j0.j(Y8.c.a(!zC ? R.string.common_disable : R.string.common_enable, true));
                }
                break;
            case 20:
                SettingsViewModel settingsViewModel19 = this.f2028b0;
                if (settingsViewModel19 != null) {
                    String str = settingsViewModel19.f33145a1;
                    if (str == null) {
                        str = "";
                    }
                    int length = str.length();
                    androidx.lifecycle.C<Integer> c10 = settingsViewModel19.f33171t0;
                    K8.o oVar9 = settingsViewModel19.f33160o;
                    U7.a<Integer> aVar = settingsViewModel19.f32122l;
                    if (length == 0) {
                        aVar.j(Integer.valueOf(R.string.snackbar_email_removed));
                        oVar9.l0(str);
                        c10.j(null);
                    } else if (Patterns.EMAIL_ADDRESS.matcher(str).matches()) {
                        oVar9.l0(str);
                        aVar.j(Integer.valueOf(R.string.common_email_saved));
                        c10.j(null);
                    } else {
                        c10.j(Integer.valueOf(R.string.common_email_invalid));
                    }
                }
                break;
            case 22:
                SettingsViewModel settingsViewModel20 = this.f2028b0;
                if (settingsViewModel20 != null) {
                    String str2 = settingsViewModel20.f33147b1;
                    Integer numA = str2 != null ? kotlin.text.l.A(str2) : null;
                    androidx.lifecycle.C<Integer> c11 = settingsViewModel20.f33176w0;
                    if (numA == null) {
                        c11.j(Integer.valueOf(R.string.common_code_is_not_valid));
                    } else if (numA.intValue() > 65535) {
                        c11.j(Integer.valueOf(R.string.view_settings_workshop_number_too_long));
                    } else {
                        settingsViewModel20.f33160o.a(numA.intValue());
                        settingsViewModel20.f32122l.j(Integer.valueOf(R.string.common_workshop_number_saved));
                        c11.j(null);
                    }
                }
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:119:0x01d2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:121:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:124:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:125:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:129:0x01f7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:130:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:131:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:134:0x0209  */
    /* JADX WARN: Code duplicated, block: B:135:0x0210  */
    /* JADX WARN: Code duplicated, block: B:139:0x021c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:140:0x021e  */
    /* JADX WARN: Code duplicated, block: B:141:0x0223  */
    /* JADX WARN: Code duplicated, block: B:144:0x022e  */
    /* JADX WARN: Code duplicated, block: B:145:0x0235  */
    /* JADX WARN: Code duplicated, block: B:148:0x0241  */
    /* JADX WARN: Code duplicated, block: B:151:0x024c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:152:0x024e  */
    /* JADX WARN: Code duplicated, block: B:153:0x0251  */
    /* JADX WARN: Code duplicated, block: B:156:0x025a  */
    /* JADX WARN: Code duplicated, block: B:158:0x0266  */
    /* JADX WARN: Code duplicated, block: B:161:0x0271 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:162:0x0273  */
    /* JADX WARN: Code duplicated, block: B:163:0x0278  */
    /* JADX WARN: Code duplicated, block: B:166:0x0283  */
    /* JADX WARN: Code duplicated, block: B:168:0x028f  */
    /* JADX WARN: Code duplicated, block: B:16:0x007f  */
    /* JADX WARN: Code duplicated, block: B:172:0x029c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:173:0x029e  */
    /* JADX WARN: Code duplicated, block: B:174:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:177:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:178:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:181:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:184:0x02d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:185:0x02da  */
    /* JADX WARN: Code duplicated, block: B:186:0x02df  */
    /* JADX WARN: Code duplicated, block: B:189:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:191:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:195:0x0303 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:196:0x0305  */
    /* JADX WARN: Code duplicated, block: B:197:0x0308  */
    /* JADX WARN: Code duplicated, block: B:200:0x0311  */
    /* JADX WARN: Code duplicated, block: B:25:0x009c  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:61:0x0110  */
    /* JADX WARN: Code duplicated, block: B:70:0x012d  */
    /* JADX WARN: Code duplicated, block: B:79:0x014a  */
    /* JADX WARN: Code duplicated, block: B:88:0x0167  */
    /* JADX WARN: Code duplicated, block: B:97:0x0184  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // M0.h
    public final void d() {
        long j;
        Y8.b bVar;
        Y8.b bVar2;
        String str;
        Y8.b bVar3;
        Y8.b bVar4;
        Y8.b bVar5;
        String str2;
        Y8.b bVar6;
        Y8.b bVar7;
        Y8.b bVar8;
        String str3;
        Y8.b bVar9;
        Y8.b bVar10;
        Y8.b bVar11;
        Y8.b bVar12;
        Y8.b bVar13;
        Y8.b bVar14;
        Y8.b bVar15;
        Y8.b bVar16;
        boolean z10;
        Y8.b bVar17;
        Y8.b bVar18;
        Y8.b bVar19;
        Y8.b bVar20;
        Y8.b bVar21;
        Y8.b bVar22;
        Y8.b bVar23;
        String str4;
        Y8.b bVar24;
        Y8.b bVar25;
        String string;
        Y8.b bVar26;
        androidx.lifecycle.C c10;
        androidx.lifecycle.C c11;
        androidx.lifecycle.C c12;
        Integer num;
        androidx.lifecycle.C c13;
        androidx.lifecycle.C c14;
        androidx.lifecycle.C c15;
        Boolean bool;
        androidx.lifecycle.C c16;
        androidx.lifecycle.C c17;
        synchronized (this) {
            j = this.f2067y0;
            this.f2067y0 = 0L;
        }
        SettingsViewModel settingsViewModel = this.f2028b0;
        Y8.b bVar27 = null;
        boolean zP = false;
        if ((3468112414016L & j) != 0) {
            if ((j & 3298534883392L) == 0) {
                bVar17 = null;
            } else {
                androidx.lifecycle.C c18 = settingsViewModel != null ? settingsViewModel.f33112K : null;
                s(6, c18);
                if (c18 != null) {
                    bVar17 = (Y8.b) c18.d();
                } else {
                    bVar17 = null;
                }
            }
            if ((j & 3298534883584L) == 0) {
                bVar4 = null;
            } else {
                androidx.lifecycle.C c19 = settingsViewModel != null ? settingsViewModel.f33144a0 : null;
                s(8, c19);
                if (c19 != null) {
                    bVar4 = (Y8.b) c19.d();
                } else {
                    bVar4 = null;
                }
            }
            if ((j & 3298534884352L) == 0) {
                bVar5 = null;
            } else {
                androidx.lifecycle.C c20 = settingsViewModel != null ? settingsViewModel.f33116M : null;
                s(10, c20);
                if (c20 != null) {
                    bVar5 = (Y8.b) c20.d();
                } else {
                    bVar5 = null;
                }
            }
            if ((j & 3298534899712L) == 0) {
                str2 = null;
            } else {
                androidx.lifecycle.C c21 = settingsViewModel != null ? settingsViewModel.f33169s0 : null;
                s(14, c21);
                if (c21 != null) {
                    str2 = (String) c21.d();
                } else {
                    str2 = null;
                }
            }
            if ((j & 3298534916096L) == 0) {
                bVar6 = null;
            } else {
                androidx.lifecycle.C c22 = settingsViewModel != null ? settingsViewModel.f33148c0 : null;
                s(15, c22);
                if (c22 != null) {
                    bVar6 = (Y8.b) c22.d();
                } else {
                    bVar6 = null;
                }
            }
            if ((j & 3298534948864L) == 0) {
                bVar7 = null;
            } else {
                androidx.lifecycle.C c23 = settingsViewModel != null ? settingsViewModel.f33120O : null;
                s(16, c23);
                if (c23 != null) {
                    bVar7 = (Y8.b) c23.d();
                } else {
                    bVar7 = null;
                }
            }
            if ((j & 3298535014400L) == 0) {
                bVar8 = null;
            } else {
                androidx.lifecycle.C c24 = settingsViewModel != null ? settingsViewModel.f33154i0 : null;
                s(17, c24);
                if (c24 != null) {
                    bVar8 = (Y8.b) c24.d();
                } else {
                    bVar8 = null;
                }
            }
            if ((j & 3298535407616L) == 0) {
                bVar18 = null;
            } else {
                androidx.lifecycle.C c25 = settingsViewModel != null ? settingsViewModel.f33108I : null;
                s(19, c25);
                if (c25 != null) {
                    bVar18 = (Y8.b) c25.d();
                } else {
                    bVar18 = null;
                }
            }
            if ((j & 3298535931904L) == 0) {
                bVar19 = null;
            } else {
                androidx.lifecycle.C c26 = settingsViewModel != null ? settingsViewModel.f33104G : null;
                s(20, c26);
                if (c26 != null) {
                    bVar19 = (Y8.b) c26.d();
                } else {
                    bVar19 = null;
                }
            }
            if ((j & 3298543271936L) == 0) {
                bVar20 = null;
            } else {
                androidx.lifecycle.C c27 = settingsViewModel != null ? settingsViewModel.f33100E : null;
                s(23, c27);
                if (c27 != null) {
                    bVar20 = (Y8.b) c27.d();
                } else {
                    bVar20 = null;
                }
            }
            if ((j & 3298551660544L) == 0) {
                bVar21 = null;
            } else {
                androidx.lifecycle.C c28 = settingsViewModel != null ? settingsViewModel.f33156k0 : null;
                s(24, c28);
                if (c28 != null) {
                    bVar21 = (Y8.b) c28.d();
                } else {
                    bVar21 = null;
                }
            }
            if ((j & 3298568437760L) != 0) {
                androidx.lifecycle.C c29 = settingsViewModel != null ? settingsViewModel.f33152g0 : null;
                s(25, c29);
                if (c29 != null) {
                    bVar22 = (Y8.b) c29.d();
                }
                if ((j & 3298669101056L) != 0) {
                    if (settingsViewModel != null) {
                        c17 = settingsViewModel.f33165q0;
                    } else {
                        c17 = null;
                    }
                    s(27, c17);
                    if (c17 != null) {
                        bVar23 = (Y8.b) c17.d();
                    }
                    if ((j & 3298803318784L) != 0) {
                        if (settingsViewModel != null) {
                            c16 = settingsViewModel.v0;
                        } else {
                            c16 = null;
                        }
                        s(28, c16);
                        if (c16 != null) {
                            str4 = (String) c16.d();
                        }
                        if ((j & 3299071754240L) != 0) {
                            if (settingsViewModel != null) {
                                c15 = settingsViewModel.f33134V;
                            } else {
                                c15 = null;
                            }
                            s(29, c15);
                            if (c15 != null) {
                                bool = (Boolean) c15.d();
                            } else {
                                bool = null;
                            }
                            zP = M0.h.p(bool);
                        } else {
                            str4 = str4;
                        }
                        if ((j & 3299608625152L) == 0) {
                            bVar24 = null;
                        } else {
                            if (settingsViewModel != null) {
                                c14 = settingsViewModel.f33128S;
                            } else {
                                c14 = null;
                            }
                            s(30, c14);
                            if (c14 != null) {
                                bVar24 = (Y8.b) c14.d();
                            } else {
                                bVar24 = null;
                            }
                        }
                        if ((j & 3302829850624L) != 0) {
                            if (settingsViewModel != null) {
                                c13 = settingsViewModel.f33096C;
                            } else {
                                c13 = null;
                            }
                            s(32, c13);
                            if (c13 != null) {
                                bVar25 = (Y8.b) c13.d();
                            }
                            if ((j & 3307124817920L) != 0) {
                                if (settingsViewModel != null) {
                                    c12 = settingsViewModel.f33136W;
                                } else {
                                    c12 = null;
                                }
                                s(33, c12);
                                if (c12 != null) {
                                    num = (Integer) c12.d();
                                } else {
                                    num = null;
                                }
                                string = this.f4488d.getContext().getString(M0.h.o(num));
                            } else {
                                bVar25 = bVar25;
                                string = null;
                            }
                            if ((j & 3315714752512L) != 0) {
                                if (settingsViewModel != null) {
                                    c11 = settingsViewModel.f33092A;
                                } else {
                                    c11 = null;
                                }
                                s(34, c11);
                                if (c11 != null) {
                                    bVar26 = (Y8.b) c11.d();
                                }
                                if ((j & 3435973836800L) != 0) {
                                    if (settingsViewModel != null) {
                                        c10 = settingsViewModel.f33114L;
                                    } else {
                                        c10 = null;
                                    }
                                    s(37, c10);
                                    if (c10 != null) {
                                        bVar27 = (Y8.b) c10.d();
                                    }
                                }
                                bVar16 = bVar21;
                                bVar14 = bVar18;
                                bVar11 = bVar19;
                                bVar13 = bVar20;
                                z10 = zP;
                                bVar = bVar22;
                                bVar15 = bVar23;
                                str3 = str4;
                                bVar9 = bVar24;
                                bVar12 = bVar25;
                                str = string;
                                bVar10 = bVar17;
                                bVar3 = bVar26;
                                bVar2 = bVar27;
                            } else {
                                string = string;
                            }
                            bVar26 = null;
                            if ((j & 3435973836800L) != 0) {
                                if (settingsViewModel != null) {
                                    c10 = settingsViewModel.f33114L;
                                } else {
                                    c10 = null;
                                }
                                s(37, c10);
                                if (c10 != null) {
                                    bVar27 = (Y8.b) c10.d();
                                }
                            }
                            bVar16 = bVar21;
                            bVar14 = bVar18;
                            bVar11 = bVar19;
                            bVar13 = bVar20;
                            z10 = zP;
                            bVar = bVar22;
                            bVar15 = bVar23;
                            str3 = str4;
                            bVar9 = bVar24;
                            bVar12 = bVar25;
                            str = string;
                            bVar10 = bVar17;
                            bVar3 = bVar26;
                            bVar2 = bVar27;
                        } else {
                            bVar24 = bVar24;
                        }
                        bVar25 = null;
                        if ((j & 3307124817920L) != 0) {
                            if (settingsViewModel != null) {
                                c12 = settingsViewModel.f33136W;
                            } else {
                                c12 = null;
                            }
                            s(33, c12);
                            if (c12 != null) {
                                num = (Integer) c12.d();
                            } else {
                                num = null;
                            }
                            string = this.f4488d.getContext().getString(M0.h.o(num));
                        } else {
                            bVar25 = bVar25;
                            string = null;
                        }
                        if ((j & 3315714752512L) != 0) {
                            if (settingsViewModel != null) {
                                c11 = settingsViewModel.f33092A;
                            } else {
                                c11 = null;
                            }
                            s(34, c11);
                            if (c11 != null) {
                                bVar26 = (Y8.b) c11.d();
                            }
                            if ((j & 3435973836800L) != 0) {
                                if (settingsViewModel != null) {
                                    c10 = settingsViewModel.f33114L;
                                } else {
                                    c10 = null;
                                }
                                s(37, c10);
                                if (c10 != null) {
                                    bVar27 = (Y8.b) c10.d();
                                }
                            }
                            bVar16 = bVar21;
                            bVar14 = bVar18;
                            bVar11 = bVar19;
                            bVar13 = bVar20;
                            z10 = zP;
                            bVar = bVar22;
                            bVar15 = bVar23;
                            str3 = str4;
                            bVar9 = bVar24;
                            bVar12 = bVar25;
                            str = string;
                            bVar10 = bVar17;
                            bVar3 = bVar26;
                            bVar2 = bVar27;
                        } else {
                            string = string;
                        }
                        bVar26 = null;
                        if ((j & 3435973836800L) != 0) {
                            if (settingsViewModel != null) {
                                c10 = settingsViewModel.f33114L;
                            } else {
                                c10 = null;
                            }
                            s(37, c10);
                            if (c10 != null) {
                                bVar27 = (Y8.b) c10.d();
                            }
                        }
                        bVar16 = bVar21;
                        bVar14 = bVar18;
                        bVar11 = bVar19;
                        bVar13 = bVar20;
                        z10 = zP;
                        bVar = bVar22;
                        bVar15 = bVar23;
                        str3 = str4;
                        bVar9 = bVar24;
                        bVar12 = bVar25;
                        str = string;
                        bVar10 = bVar17;
                        bVar3 = bVar26;
                        bVar2 = bVar27;
                    } else {
                        bVar23 = bVar23;
                    }
                    str4 = null;
                    if ((j & 3299071754240L) != 0) {
                        if (settingsViewModel != null) {
                            c15 = settingsViewModel.f33134V;
                        } else {
                            c15 = null;
                        }
                        s(29, c15);
                        if (c15 != null) {
                            bool = (Boolean) c15.d();
                        } else {
                            bool = null;
                        }
                        zP = M0.h.p(bool);
                    } else {
                        str4 = str4;
                    }
                    if ((j & 3299608625152L) == 0) {
                        bVar24 = null;
                    } else {
                        if (settingsViewModel != null) {
                            c14 = settingsViewModel.f33128S;
                        } else {
                            c14 = null;
                        }
                        s(30, c14);
                        if (c14 != null) {
                            bVar24 = (Y8.b) c14.d();
                        } else {
                            bVar24 = null;
                        }
                    }
                    if ((j & 3302829850624L) != 0) {
                        if (settingsViewModel != null) {
                            c13 = settingsViewModel.f33096C;
                        } else {
                            c13 = null;
                        }
                        s(32, c13);
                        if (c13 != null) {
                            bVar25 = (Y8.b) c13.d();
                        }
                        if ((j & 3307124817920L) != 0) {
                            if (settingsViewModel != null) {
                                c12 = settingsViewModel.f33136W;
                            } else {
                                c12 = null;
                            }
                            s(33, c12);
                            if (c12 != null) {
                                num = (Integer) c12.d();
                            } else {
                                num = null;
                            }
                            string = this.f4488d.getContext().getString(M0.h.o(num));
                        } else {
                            bVar25 = bVar25;
                            string = null;
                        }
                        if ((j & 3315714752512L) != 0) {
                            if (settingsViewModel != null) {
                                c11 = settingsViewModel.f33092A;
                            } else {
                                c11 = null;
                            }
                            s(34, c11);
                            if (c11 != null) {
                                bVar26 = (Y8.b) c11.d();
                            }
                            if ((j & 3435973836800L) != 0) {
                                if (settingsViewModel != null) {
                                    c10 = settingsViewModel.f33114L;
                                } else {
                                    c10 = null;
                                }
                                s(37, c10);
                                if (c10 != null) {
                                    bVar27 = (Y8.b) c10.d();
                                }
                            }
                            bVar16 = bVar21;
                            bVar14 = bVar18;
                            bVar11 = bVar19;
                            bVar13 = bVar20;
                            z10 = zP;
                            bVar = bVar22;
                            bVar15 = bVar23;
                            str3 = str4;
                            bVar9 = bVar24;
                            bVar12 = bVar25;
                            str = string;
                            bVar10 = bVar17;
                            bVar3 = bVar26;
                            bVar2 = bVar27;
                        } else {
                            string = string;
                        }
                        bVar26 = null;
                        if ((j & 3435973836800L) != 0) {
                            if (settingsViewModel != null) {
                                c10 = settingsViewModel.f33114L;
                            } else {
                                c10 = null;
                            }
                            s(37, c10);
                            if (c10 != null) {
                                bVar27 = (Y8.b) c10.d();
                            }
                        }
                        bVar16 = bVar21;
                        bVar14 = bVar18;
                        bVar11 = bVar19;
                        bVar13 = bVar20;
                        z10 = zP;
                        bVar = bVar22;
                        bVar15 = bVar23;
                        str3 = str4;
                        bVar9 = bVar24;
                        bVar12 = bVar25;
                        str = string;
                        bVar10 = bVar17;
                        bVar3 = bVar26;
                        bVar2 = bVar27;
                    } else {
                        bVar24 = bVar24;
                    }
                    bVar25 = null;
                    if ((j & 3307124817920L) != 0) {
                        if (settingsViewModel != null) {
                            c12 = settingsViewModel.f33136W;
                        } else {
                            c12 = null;
                        }
                        s(33, c12);
                        if (c12 != null) {
                            num = (Integer) c12.d();
                        } else {
                            num = null;
                        }
                        string = this.f4488d.getContext().getString(M0.h.o(num));
                    } else {
                        bVar25 = bVar25;
                        string = null;
                    }
                    if ((j & 3315714752512L) != 0) {
                        if (settingsViewModel != null) {
                            c11 = settingsViewModel.f33092A;
                        } else {
                            c11 = null;
                        }
                        s(34, c11);
                        if (c11 != null) {
                            bVar26 = (Y8.b) c11.d();
                        }
                        if ((j & 3435973836800L) != 0) {
                            if (settingsViewModel != null) {
                                c10 = settingsViewModel.f33114L;
                            } else {
                                c10 = null;
                            }
                            s(37, c10);
                            if (c10 != null) {
                                bVar27 = (Y8.b) c10.d();
                            }
                        }
                        bVar16 = bVar21;
                        bVar14 = bVar18;
                        bVar11 = bVar19;
                        bVar13 = bVar20;
                        z10 = zP;
                        bVar = bVar22;
                        bVar15 = bVar23;
                        str3 = str4;
                        bVar9 = bVar24;
                        bVar12 = bVar25;
                        str = string;
                        bVar10 = bVar17;
                        bVar3 = bVar26;
                        bVar2 = bVar27;
                    } else {
                        string = string;
                    }
                    bVar26 = null;
                    if ((j & 3435973836800L) != 0) {
                        if (settingsViewModel != null) {
                            c10 = settingsViewModel.f33114L;
                        } else {
                            c10 = null;
                        }
                        s(37, c10);
                        if (c10 != null) {
                            bVar27 = (Y8.b) c10.d();
                        }
                    }
                    bVar16 = bVar21;
                    bVar14 = bVar18;
                    bVar11 = bVar19;
                    bVar13 = bVar20;
                    z10 = zP;
                    bVar = bVar22;
                    bVar15 = bVar23;
                    str3 = str4;
                    bVar9 = bVar24;
                    bVar12 = bVar25;
                    str = string;
                    bVar10 = bVar17;
                    bVar3 = bVar26;
                    bVar2 = bVar27;
                } else {
                    bVar22 = bVar22;
                }
                bVar23 = null;
                if ((j & 3298803318784L) != 0) {
                    if (settingsViewModel != null) {
                        c16 = settingsViewModel.v0;
                    } else {
                        c16 = null;
                    }
                    s(28, c16);
                    if (c16 != null) {
                        str4 = (String) c16.d();
                    }
                    if ((j & 3299071754240L) != 0) {
                        if (settingsViewModel != null) {
                            c15 = settingsViewModel.f33134V;
                        } else {
                            c15 = null;
                        }
                        s(29, c15);
                        if (c15 != null) {
                            bool = (Boolean) c15.d();
                        } else {
                            bool = null;
                        }
                        zP = M0.h.p(bool);
                    } else {
                        str4 = str4;
                    }
                    if ((j & 3299608625152L) == 0) {
                        bVar24 = null;
                    } else {
                        if (settingsViewModel != null) {
                            c14 = settingsViewModel.f33128S;
                        } else {
                            c14 = null;
                        }
                        s(30, c14);
                        if (c14 != null) {
                            bVar24 = (Y8.b) c14.d();
                        } else {
                            bVar24 = null;
                        }
                    }
                    if ((j & 3302829850624L) != 0) {
                        if (settingsViewModel != null) {
                            c13 = settingsViewModel.f33096C;
                        } else {
                            c13 = null;
                        }
                        s(32, c13);
                        if (c13 != null) {
                            bVar25 = (Y8.b) c13.d();
                        }
                        if ((j & 3307124817920L) != 0) {
                            if (settingsViewModel != null) {
                                c12 = settingsViewModel.f33136W;
                            } else {
                                c12 = null;
                            }
                            s(33, c12);
                            if (c12 != null) {
                                num = (Integer) c12.d();
                            } else {
                                num = null;
                            }
                            string = this.f4488d.getContext().getString(M0.h.o(num));
                        } else {
                            bVar25 = bVar25;
                            string = null;
                        }
                        if ((j & 3315714752512L) != 0) {
                            if (settingsViewModel != null) {
                                c11 = settingsViewModel.f33092A;
                            } else {
                                c11 = null;
                            }
                            s(34, c11);
                            if (c11 != null) {
                                bVar26 = (Y8.b) c11.d();
                            }
                            if ((j & 3435973836800L) != 0) {
                                if (settingsViewModel != null) {
                                    c10 = settingsViewModel.f33114L;
                                } else {
                                    c10 = null;
                                }
                                s(37, c10);
                                if (c10 != null) {
                                    bVar27 = (Y8.b) c10.d();
                                }
                            }
                            bVar16 = bVar21;
                            bVar14 = bVar18;
                            bVar11 = bVar19;
                            bVar13 = bVar20;
                            z10 = zP;
                            bVar = bVar22;
                            bVar15 = bVar23;
                            str3 = str4;
                            bVar9 = bVar24;
                            bVar12 = bVar25;
                            str = string;
                            bVar10 = bVar17;
                            bVar3 = bVar26;
                            bVar2 = bVar27;
                        } else {
                            string = string;
                        }
                        bVar26 = null;
                        if ((j & 3435973836800L) != 0) {
                            if (settingsViewModel != null) {
                                c10 = settingsViewModel.f33114L;
                            } else {
                                c10 = null;
                            }
                            s(37, c10);
                            if (c10 != null) {
                                bVar27 = (Y8.b) c10.d();
                            }
                        }
                        bVar16 = bVar21;
                        bVar14 = bVar18;
                        bVar11 = bVar19;
                        bVar13 = bVar20;
                        z10 = zP;
                        bVar = bVar22;
                        bVar15 = bVar23;
                        str3 = str4;
                        bVar9 = bVar24;
                        bVar12 = bVar25;
                        str = string;
                        bVar10 = bVar17;
                        bVar3 = bVar26;
                        bVar2 = bVar27;
                    } else {
                        bVar24 = bVar24;
                    }
                    bVar25 = null;
                    if ((j & 3307124817920L) != 0) {
                        if (settingsViewModel != null) {
                            c12 = settingsViewModel.f33136W;
                        } else {
                            c12 = null;
                        }
                        s(33, c12);
                        if (c12 != null) {
                            num = (Integer) c12.d();
                        } else {
                            num = null;
                        }
                        string = this.f4488d.getContext().getString(M0.h.o(num));
                    } else {
                        bVar25 = bVar25;
                        string = null;
                    }
                    if ((j & 3315714752512L) != 0) {
                        if (settingsViewModel != null) {
                            c11 = settingsViewModel.f33092A;
                        } else {
                            c11 = null;
                        }
                        s(34, c11);
                        if (c11 != null) {
                            bVar26 = (Y8.b) c11.d();
                        }
                        if ((j & 3435973836800L) != 0) {
                            if (settingsViewModel != null) {
                                c10 = settingsViewModel.f33114L;
                            } else {
                                c10 = null;
                            }
                            s(37, c10);
                            if (c10 != null) {
                                bVar27 = (Y8.b) c10.d();
                            }
                        }
                        bVar16 = bVar21;
                        bVar14 = bVar18;
                        bVar11 = bVar19;
                        bVar13 = bVar20;
                        z10 = zP;
                        bVar = bVar22;
                        bVar15 = bVar23;
                        str3 = str4;
                        bVar9 = bVar24;
                        bVar12 = bVar25;
                        str = string;
                        bVar10 = bVar17;
                        bVar3 = bVar26;
                        bVar2 = bVar27;
                    } else {
                        string = string;
                    }
                    bVar26 = null;
                    if ((j & 3435973836800L) != 0) {
                        if (settingsViewModel != null) {
                            c10 = settingsViewModel.f33114L;
                        } else {
                            c10 = null;
                        }
                        s(37, c10);
                        if (c10 != null) {
                            bVar27 = (Y8.b) c10.d();
                        }
                    }
                    bVar16 = bVar21;
                    bVar14 = bVar18;
                    bVar11 = bVar19;
                    bVar13 = bVar20;
                    z10 = zP;
                    bVar = bVar22;
                    bVar15 = bVar23;
                    str3 = str4;
                    bVar9 = bVar24;
                    bVar12 = bVar25;
                    str = string;
                    bVar10 = bVar17;
                    bVar3 = bVar26;
                    bVar2 = bVar27;
                } else {
                    bVar23 = bVar23;
                }
                str4 = null;
                if ((j & 3299071754240L) != 0) {
                    if (settingsViewModel != null) {
                        c15 = settingsViewModel.f33134V;
                    } else {
                        c15 = null;
                    }
                    s(29, c15);
                    if (c15 != null) {
                        bool = (Boolean) c15.d();
                    } else {
                        bool = null;
                    }
                    zP = M0.h.p(bool);
                } else {
                    str4 = str4;
                }
                if ((j & 3299608625152L) == 0) {
                    bVar24 = null;
                } else {
                    if (settingsViewModel != null) {
                        c14 = settingsViewModel.f33128S;
                    } else {
                        c14 = null;
                    }
                    s(30, c14);
                    if (c14 != null) {
                        bVar24 = (Y8.b) c14.d();
                    } else {
                        bVar24 = null;
                    }
                }
                if ((j & 3302829850624L) != 0) {
                    if (settingsViewModel != null) {
                        c13 = settingsViewModel.f33096C;
                    } else {
                        c13 = null;
                    }
                    s(32, c13);
                    if (c13 != null) {
                        bVar25 = (Y8.b) c13.d();
                    }
                    if ((j & 3307124817920L) != 0) {
                        if (settingsViewModel != null) {
                            c12 = settingsViewModel.f33136W;
                        } else {
                            c12 = null;
                        }
                        s(33, c12);
                        if (c12 != null) {
                            num = (Integer) c12.d();
                        } else {
                            num = null;
                        }
                        string = this.f4488d.getContext().getString(M0.h.o(num));
                    } else {
                        bVar25 = bVar25;
                        string = null;
                    }
                    if ((j & 3315714752512L) != 0) {
                        if (settingsViewModel != null) {
                            c11 = settingsViewModel.f33092A;
                        } else {
                            c11 = null;
                        }
                        s(34, c11);
                        if (c11 != null) {
                            bVar26 = (Y8.b) c11.d();
                        }
                        if ((j & 3435973836800L) != 0) {
                            if (settingsViewModel != null) {
                                c10 = settingsViewModel.f33114L;
                            } else {
                                c10 = null;
                            }
                            s(37, c10);
                            if (c10 != null) {
                                bVar27 = (Y8.b) c10.d();
                            }
                        }
                        bVar16 = bVar21;
                        bVar14 = bVar18;
                        bVar11 = bVar19;
                        bVar13 = bVar20;
                        z10 = zP;
                        bVar = bVar22;
                        bVar15 = bVar23;
                        str3 = str4;
                        bVar9 = bVar24;
                        bVar12 = bVar25;
                        str = string;
                        bVar10 = bVar17;
                        bVar3 = bVar26;
                        bVar2 = bVar27;
                    } else {
                        string = string;
                    }
                    bVar26 = null;
                    if ((j & 3435973836800L) != 0) {
                        if (settingsViewModel != null) {
                            c10 = settingsViewModel.f33114L;
                        } else {
                            c10 = null;
                        }
                        s(37, c10);
                        if (c10 != null) {
                            bVar27 = (Y8.b) c10.d();
                        }
                    }
                    bVar16 = bVar21;
                    bVar14 = bVar18;
                    bVar11 = bVar19;
                    bVar13 = bVar20;
                    z10 = zP;
                    bVar = bVar22;
                    bVar15 = bVar23;
                    str3 = str4;
                    bVar9 = bVar24;
                    bVar12 = bVar25;
                    str = string;
                    bVar10 = bVar17;
                    bVar3 = bVar26;
                    bVar2 = bVar27;
                } else {
                    bVar24 = bVar24;
                }
                bVar25 = null;
                if ((j & 3307124817920L) != 0) {
                    if (settingsViewModel != null) {
                        c12 = settingsViewModel.f33136W;
                    } else {
                        c12 = null;
                    }
                    s(33, c12);
                    if (c12 != null) {
                        num = (Integer) c12.d();
                    } else {
                        num = null;
                    }
                    string = this.f4488d.getContext().getString(M0.h.o(num));
                } else {
                    bVar25 = bVar25;
                    string = null;
                }
                if ((j & 3315714752512L) != 0) {
                    if (settingsViewModel != null) {
                        c11 = settingsViewModel.f33092A;
                    } else {
                        c11 = null;
                    }
                    s(34, c11);
                    if (c11 != null) {
                        bVar26 = (Y8.b) c11.d();
                    }
                    if ((j & 3435973836800L) != 0) {
                        if (settingsViewModel != null) {
                            c10 = settingsViewModel.f33114L;
                        } else {
                            c10 = null;
                        }
                        s(37, c10);
                        if (c10 != null) {
                            bVar27 = (Y8.b) c10.d();
                        }
                    }
                    bVar16 = bVar21;
                    bVar14 = bVar18;
                    bVar11 = bVar19;
                    bVar13 = bVar20;
                    z10 = zP;
                    bVar = bVar22;
                    bVar15 = bVar23;
                    str3 = str4;
                    bVar9 = bVar24;
                    bVar12 = bVar25;
                    str = string;
                    bVar10 = bVar17;
                    bVar3 = bVar26;
                    bVar2 = bVar27;
                } else {
                    string = string;
                }
                bVar26 = null;
                if ((j & 3435973836800L) != 0) {
                    if (settingsViewModel != null) {
                        c10 = settingsViewModel.f33114L;
                    } else {
                        c10 = null;
                    }
                    s(37, c10);
                    if (c10 != null) {
                        bVar27 = (Y8.b) c10.d();
                    }
                }
                bVar16 = bVar21;
                bVar14 = bVar18;
                bVar11 = bVar19;
                bVar13 = bVar20;
                z10 = zP;
                bVar = bVar22;
                bVar15 = bVar23;
                str3 = str4;
                bVar9 = bVar24;
                bVar12 = bVar25;
                str = string;
                bVar10 = bVar17;
                bVar3 = bVar26;
                bVar2 = bVar27;
            } else {
                bVar20 = bVar20;
            }
            bVar22 = null;
            if ((j & 3298669101056L) != 0) {
                if (settingsViewModel != null) {
                    c17 = settingsViewModel.f33165q0;
                } else {
                    c17 = null;
                }
                s(27, c17);
                if (c17 != null) {
                    bVar23 = (Y8.b) c17.d();
                }
                if ((j & 3298803318784L) != 0) {
                    if (settingsViewModel != null) {
                        c16 = settingsViewModel.v0;
                    } else {
                        c16 = null;
                    }
                    s(28, c16);
                    if (c16 != null) {
                        str4 = (String) c16.d();
                    }
                    if ((j & 3299071754240L) != 0) {
                        if (settingsViewModel != null) {
                            c15 = settingsViewModel.f33134V;
                        } else {
                            c15 = null;
                        }
                        s(29, c15);
                        if (c15 != null) {
                            bool = (Boolean) c15.d();
                        } else {
                            bool = null;
                        }
                        zP = M0.h.p(bool);
                    } else {
                        str4 = str4;
                    }
                    if ((j & 3299608625152L) == 0) {
                        bVar24 = null;
                    } else {
                        if (settingsViewModel != null) {
                            c14 = settingsViewModel.f33128S;
                        } else {
                            c14 = null;
                        }
                        s(30, c14);
                        if (c14 != null) {
                            bVar24 = (Y8.b) c14.d();
                        } else {
                            bVar24 = null;
                        }
                    }
                    if ((j & 3302829850624L) != 0) {
                        if (settingsViewModel != null) {
                            c13 = settingsViewModel.f33096C;
                        } else {
                            c13 = null;
                        }
                        s(32, c13);
                        if (c13 != null) {
                            bVar25 = (Y8.b) c13.d();
                        }
                        if ((j & 3307124817920L) != 0) {
                            if (settingsViewModel != null) {
                                c12 = settingsViewModel.f33136W;
                            } else {
                                c12 = null;
                            }
                            s(33, c12);
                            if (c12 != null) {
                                num = (Integer) c12.d();
                            } else {
                                num = null;
                            }
                            string = this.f4488d.getContext().getString(M0.h.o(num));
                        } else {
                            bVar25 = bVar25;
                            string = null;
                        }
                        if ((j & 3315714752512L) != 0) {
                            if (settingsViewModel != null) {
                                c11 = settingsViewModel.f33092A;
                            } else {
                                c11 = null;
                            }
                            s(34, c11);
                            if (c11 != null) {
                                bVar26 = (Y8.b) c11.d();
                            }
                            if ((j & 3435973836800L) != 0) {
                                if (settingsViewModel != null) {
                                    c10 = settingsViewModel.f33114L;
                                } else {
                                    c10 = null;
                                }
                                s(37, c10);
                                if (c10 != null) {
                                    bVar27 = (Y8.b) c10.d();
                                }
                            }
                            bVar16 = bVar21;
                            bVar14 = bVar18;
                            bVar11 = bVar19;
                            bVar13 = bVar20;
                            z10 = zP;
                            bVar = bVar22;
                            bVar15 = bVar23;
                            str3 = str4;
                            bVar9 = bVar24;
                            bVar12 = bVar25;
                            str = string;
                            bVar10 = bVar17;
                            bVar3 = bVar26;
                            bVar2 = bVar27;
                        } else {
                            string = string;
                        }
                        bVar26 = null;
                        if ((j & 3435973836800L) != 0) {
                            if (settingsViewModel != null) {
                                c10 = settingsViewModel.f33114L;
                            } else {
                                c10 = null;
                            }
                            s(37, c10);
                            if (c10 != null) {
                                bVar27 = (Y8.b) c10.d();
                            }
                        }
                        bVar16 = bVar21;
                        bVar14 = bVar18;
                        bVar11 = bVar19;
                        bVar13 = bVar20;
                        z10 = zP;
                        bVar = bVar22;
                        bVar15 = bVar23;
                        str3 = str4;
                        bVar9 = bVar24;
                        bVar12 = bVar25;
                        str = string;
                        bVar10 = bVar17;
                        bVar3 = bVar26;
                        bVar2 = bVar27;
                    } else {
                        bVar24 = bVar24;
                    }
                    bVar25 = null;
                    if ((j & 3307124817920L) != 0) {
                        if (settingsViewModel != null) {
                            c12 = settingsViewModel.f33136W;
                        } else {
                            c12 = null;
                        }
                        s(33, c12);
                        if (c12 != null) {
                            num = (Integer) c12.d();
                        } else {
                            num = null;
                        }
                        string = this.f4488d.getContext().getString(M0.h.o(num));
                    } else {
                        bVar25 = bVar25;
                        string = null;
                    }
                    if ((j & 3315714752512L) != 0) {
                        if (settingsViewModel != null) {
                            c11 = settingsViewModel.f33092A;
                        } else {
                            c11 = null;
                        }
                        s(34, c11);
                        if (c11 != null) {
                            bVar26 = (Y8.b) c11.d();
                        }
                        if ((j & 3435973836800L) != 0) {
                            if (settingsViewModel != null) {
                                c10 = settingsViewModel.f33114L;
                            } else {
                                c10 = null;
                            }
                            s(37, c10);
                            if (c10 != null) {
                                bVar27 = (Y8.b) c10.d();
                            }
                        }
                        bVar16 = bVar21;
                        bVar14 = bVar18;
                        bVar11 = bVar19;
                        bVar13 = bVar20;
                        z10 = zP;
                        bVar = bVar22;
                        bVar15 = bVar23;
                        str3 = str4;
                        bVar9 = bVar24;
                        bVar12 = bVar25;
                        str = string;
                        bVar10 = bVar17;
                        bVar3 = bVar26;
                        bVar2 = bVar27;
                    } else {
                        string = string;
                    }
                    bVar26 = null;
                    if ((j & 3435973836800L) != 0) {
                        if (settingsViewModel != null) {
                            c10 = settingsViewModel.f33114L;
                        } else {
                            c10 = null;
                        }
                        s(37, c10);
                        if (c10 != null) {
                            bVar27 = (Y8.b) c10.d();
                        }
                    }
                    bVar16 = bVar21;
                    bVar14 = bVar18;
                    bVar11 = bVar19;
                    bVar13 = bVar20;
                    z10 = zP;
                    bVar = bVar22;
                    bVar15 = bVar23;
                    str3 = str4;
                    bVar9 = bVar24;
                    bVar12 = bVar25;
                    str = string;
                    bVar10 = bVar17;
                    bVar3 = bVar26;
                    bVar2 = bVar27;
                } else {
                    bVar23 = bVar23;
                }
                str4 = null;
                if ((j & 3299071754240L) != 0) {
                    if (settingsViewModel != null) {
                        c15 = settingsViewModel.f33134V;
                    } else {
                        c15 = null;
                    }
                    s(29, c15);
                    if (c15 != null) {
                        bool = (Boolean) c15.d();
                    } else {
                        bool = null;
                    }
                    zP = M0.h.p(bool);
                } else {
                    str4 = str4;
                }
                if ((j & 3299608625152L) == 0) {
                    bVar24 = null;
                } else {
                    if (settingsViewModel != null) {
                        c14 = settingsViewModel.f33128S;
                    } else {
                        c14 = null;
                    }
                    s(30, c14);
                    if (c14 != null) {
                        bVar24 = (Y8.b) c14.d();
                    } else {
                        bVar24 = null;
                    }
                }
                if ((j & 3302829850624L) != 0) {
                    if (settingsViewModel != null) {
                        c13 = settingsViewModel.f33096C;
                    } else {
                        c13 = null;
                    }
                    s(32, c13);
                    if (c13 != null) {
                        bVar25 = (Y8.b) c13.d();
                    }
                    if ((j & 3307124817920L) != 0) {
                        if (settingsViewModel != null) {
                            c12 = settingsViewModel.f33136W;
                        } else {
                            c12 = null;
                        }
                        s(33, c12);
                        if (c12 != null) {
                            num = (Integer) c12.d();
                        } else {
                            num = null;
                        }
                        string = this.f4488d.getContext().getString(M0.h.o(num));
                    } else {
                        bVar25 = bVar25;
                        string = null;
                    }
                    if ((j & 3315714752512L) != 0) {
                        if (settingsViewModel != null) {
                            c11 = settingsViewModel.f33092A;
                        } else {
                            c11 = null;
                        }
                        s(34, c11);
                        if (c11 != null) {
                            bVar26 = (Y8.b) c11.d();
                        }
                        if ((j & 3435973836800L) != 0) {
                            if (settingsViewModel != null) {
                                c10 = settingsViewModel.f33114L;
                            } else {
                                c10 = null;
                            }
                            s(37, c10);
                            if (c10 != null) {
                                bVar27 = (Y8.b) c10.d();
                            }
                        }
                        bVar16 = bVar21;
                        bVar14 = bVar18;
                        bVar11 = bVar19;
                        bVar13 = bVar20;
                        z10 = zP;
                        bVar = bVar22;
                        bVar15 = bVar23;
                        str3 = str4;
                        bVar9 = bVar24;
                        bVar12 = bVar25;
                        str = string;
                        bVar10 = bVar17;
                        bVar3 = bVar26;
                        bVar2 = bVar27;
                    } else {
                        string = string;
                    }
                    bVar26 = null;
                    if ((j & 3435973836800L) != 0) {
                        if (settingsViewModel != null) {
                            c10 = settingsViewModel.f33114L;
                        } else {
                            c10 = null;
                        }
                        s(37, c10);
                        if (c10 != null) {
                            bVar27 = (Y8.b) c10.d();
                        }
                    }
                    bVar16 = bVar21;
                    bVar14 = bVar18;
                    bVar11 = bVar19;
                    bVar13 = bVar20;
                    z10 = zP;
                    bVar = bVar22;
                    bVar15 = bVar23;
                    str3 = str4;
                    bVar9 = bVar24;
                    bVar12 = bVar25;
                    str = string;
                    bVar10 = bVar17;
                    bVar3 = bVar26;
                    bVar2 = bVar27;
                } else {
                    bVar24 = bVar24;
                }
                bVar25 = null;
                if ((j & 3307124817920L) != 0) {
                    if (settingsViewModel != null) {
                        c12 = settingsViewModel.f33136W;
                    } else {
                        c12 = null;
                    }
                    s(33, c12);
                    if (c12 != null) {
                        num = (Integer) c12.d();
                    } else {
                        num = null;
                    }
                    string = this.f4488d.getContext().getString(M0.h.o(num));
                } else {
                    bVar25 = bVar25;
                    string = null;
                }
                if ((j & 3315714752512L) != 0) {
                    if (settingsViewModel != null) {
                        c11 = settingsViewModel.f33092A;
                    } else {
                        c11 = null;
                    }
                    s(34, c11);
                    if (c11 != null) {
                        bVar26 = (Y8.b) c11.d();
                    }
                    if ((j & 3435973836800L) != 0) {
                        if (settingsViewModel != null) {
                            c10 = settingsViewModel.f33114L;
                        } else {
                            c10 = null;
                        }
                        s(37, c10);
                        if (c10 != null) {
                            bVar27 = (Y8.b) c10.d();
                        }
                    }
                    bVar16 = bVar21;
                    bVar14 = bVar18;
                    bVar11 = bVar19;
                    bVar13 = bVar20;
                    z10 = zP;
                    bVar = bVar22;
                    bVar15 = bVar23;
                    str3 = str4;
                    bVar9 = bVar24;
                    bVar12 = bVar25;
                    str = string;
                    bVar10 = bVar17;
                    bVar3 = bVar26;
                    bVar2 = bVar27;
                } else {
                    string = string;
                }
                bVar26 = null;
                if ((j & 3435973836800L) != 0) {
                    if (settingsViewModel != null) {
                        c10 = settingsViewModel.f33114L;
                    } else {
                        c10 = null;
                    }
                    s(37, c10);
                    if (c10 != null) {
                        bVar27 = (Y8.b) c10.d();
                    }
                }
                bVar16 = bVar21;
                bVar14 = bVar18;
                bVar11 = bVar19;
                bVar13 = bVar20;
                z10 = zP;
                bVar = bVar22;
                bVar15 = bVar23;
                str3 = str4;
                bVar9 = bVar24;
                bVar12 = bVar25;
                str = string;
                bVar10 = bVar17;
                bVar3 = bVar26;
                bVar2 = bVar27;
            } else {
                bVar22 = bVar22;
            }
            bVar23 = null;
            if ((j & 3298803318784L) != 0) {
                if (settingsViewModel != null) {
                    c16 = settingsViewModel.v0;
                } else {
                    c16 = null;
                }
                s(28, c16);
                if (c16 != null) {
                    str4 = (String) c16.d();
                }
                if ((j & 3299071754240L) != 0) {
                    if (settingsViewModel != null) {
                        c15 = settingsViewModel.f33134V;
                    } else {
                        c15 = null;
                    }
                    s(29, c15);
                    if (c15 != null) {
                        bool = (Boolean) c15.d();
                    } else {
                        bool = null;
                    }
                    zP = M0.h.p(bool);
                } else {
                    str4 = str4;
                }
                if ((j & 3299608625152L) == 0) {
                    bVar24 = null;
                } else {
                    if (settingsViewModel != null) {
                        c14 = settingsViewModel.f33128S;
                    } else {
                        c14 = null;
                    }
                    s(30, c14);
                    if (c14 != null) {
                        bVar24 = (Y8.b) c14.d();
                    } else {
                        bVar24 = null;
                    }
                }
                if ((j & 3302829850624L) != 0) {
                    if (settingsViewModel != null) {
                        c13 = settingsViewModel.f33096C;
                    } else {
                        c13 = null;
                    }
                    s(32, c13);
                    if (c13 != null) {
                        bVar25 = (Y8.b) c13.d();
                    }
                    if ((j & 3307124817920L) != 0) {
                        if (settingsViewModel != null) {
                            c12 = settingsViewModel.f33136W;
                        } else {
                            c12 = null;
                        }
                        s(33, c12);
                        if (c12 != null) {
                            num = (Integer) c12.d();
                        } else {
                            num = null;
                        }
                        string = this.f4488d.getContext().getString(M0.h.o(num));
                    } else {
                        bVar25 = bVar25;
                        string = null;
                    }
                    if ((j & 3315714752512L) != 0) {
                        if (settingsViewModel != null) {
                            c11 = settingsViewModel.f33092A;
                        } else {
                            c11 = null;
                        }
                        s(34, c11);
                        if (c11 != null) {
                            bVar26 = (Y8.b) c11.d();
                        }
                        if ((j & 3435973836800L) != 0) {
                            if (settingsViewModel != null) {
                                c10 = settingsViewModel.f33114L;
                            } else {
                                c10 = null;
                            }
                            s(37, c10);
                            if (c10 != null) {
                                bVar27 = (Y8.b) c10.d();
                            }
                        }
                        bVar16 = bVar21;
                        bVar14 = bVar18;
                        bVar11 = bVar19;
                        bVar13 = bVar20;
                        z10 = zP;
                        bVar = bVar22;
                        bVar15 = bVar23;
                        str3 = str4;
                        bVar9 = bVar24;
                        bVar12 = bVar25;
                        str = string;
                        bVar10 = bVar17;
                        bVar3 = bVar26;
                        bVar2 = bVar27;
                    } else {
                        string = string;
                    }
                    bVar26 = null;
                    if ((j & 3435973836800L) != 0) {
                        if (settingsViewModel != null) {
                            c10 = settingsViewModel.f33114L;
                        } else {
                            c10 = null;
                        }
                        s(37, c10);
                        if (c10 != null) {
                            bVar27 = (Y8.b) c10.d();
                        }
                    }
                    bVar16 = bVar21;
                    bVar14 = bVar18;
                    bVar11 = bVar19;
                    bVar13 = bVar20;
                    z10 = zP;
                    bVar = bVar22;
                    bVar15 = bVar23;
                    str3 = str4;
                    bVar9 = bVar24;
                    bVar12 = bVar25;
                    str = string;
                    bVar10 = bVar17;
                    bVar3 = bVar26;
                    bVar2 = bVar27;
                } else {
                    bVar24 = bVar24;
                }
                bVar25 = null;
                if ((j & 3307124817920L) != 0) {
                    if (settingsViewModel != null) {
                        c12 = settingsViewModel.f33136W;
                    } else {
                        c12 = null;
                    }
                    s(33, c12);
                    if (c12 != null) {
                        num = (Integer) c12.d();
                    } else {
                        num = null;
                    }
                    string = this.f4488d.getContext().getString(M0.h.o(num));
                } else {
                    bVar25 = bVar25;
                    string = null;
                }
                if ((j & 3315714752512L) != 0) {
                    if (settingsViewModel != null) {
                        c11 = settingsViewModel.f33092A;
                    } else {
                        c11 = null;
                    }
                    s(34, c11);
                    if (c11 != null) {
                        bVar26 = (Y8.b) c11.d();
                    }
                    if ((j & 3435973836800L) != 0) {
                        if (settingsViewModel != null) {
                            c10 = settingsViewModel.f33114L;
                        } else {
                            c10 = null;
                        }
                        s(37, c10);
                        if (c10 != null) {
                            bVar27 = (Y8.b) c10.d();
                        }
                    }
                    bVar16 = bVar21;
                    bVar14 = bVar18;
                    bVar11 = bVar19;
                    bVar13 = bVar20;
                    z10 = zP;
                    bVar = bVar22;
                    bVar15 = bVar23;
                    str3 = str4;
                    bVar9 = bVar24;
                    bVar12 = bVar25;
                    str = string;
                    bVar10 = bVar17;
                    bVar3 = bVar26;
                    bVar2 = bVar27;
                } else {
                    string = string;
                }
                bVar26 = null;
                if ((j & 3435973836800L) != 0) {
                    if (settingsViewModel != null) {
                        c10 = settingsViewModel.f33114L;
                    } else {
                        c10 = null;
                    }
                    s(37, c10);
                    if (c10 != null) {
                        bVar27 = (Y8.b) c10.d();
                    }
                }
                bVar16 = bVar21;
                bVar14 = bVar18;
                bVar11 = bVar19;
                bVar13 = bVar20;
                z10 = zP;
                bVar = bVar22;
                bVar15 = bVar23;
                str3 = str4;
                bVar9 = bVar24;
                bVar12 = bVar25;
                str = string;
                bVar10 = bVar17;
                bVar3 = bVar26;
                bVar2 = bVar27;
            } else {
                bVar23 = bVar23;
            }
            str4 = null;
            if ((j & 3299071754240L) != 0) {
                if (settingsViewModel != null) {
                    c15 = settingsViewModel.f33134V;
                } else {
                    c15 = null;
                }
                s(29, c15);
                if (c15 != null) {
                    bool = (Boolean) c15.d();
                } else {
                    bool = null;
                }
                zP = M0.h.p(bool);
            } else {
                str4 = str4;
            }
            if ((j & 3299608625152L) == 0) {
                bVar24 = null;
            } else {
                if (settingsViewModel != null) {
                    c14 = settingsViewModel.f33128S;
                } else {
                    c14 = null;
                }
                s(30, c14);
                if (c14 != null) {
                    bVar24 = (Y8.b) c14.d();
                } else {
                    bVar24 = null;
                }
            }
            if ((j & 3302829850624L) != 0) {
                if (settingsViewModel != null) {
                    c13 = settingsViewModel.f33096C;
                } else {
                    c13 = null;
                }
                s(32, c13);
                if (c13 != null) {
                    bVar25 = (Y8.b) c13.d();
                }
                if ((j & 3307124817920L) != 0) {
                    if (settingsViewModel != null) {
                        c12 = settingsViewModel.f33136W;
                    } else {
                        c12 = null;
                    }
                    s(33, c12);
                    if (c12 != null) {
                        num = (Integer) c12.d();
                    } else {
                        num = null;
                    }
                    string = this.f4488d.getContext().getString(M0.h.o(num));
                } else {
                    bVar25 = bVar25;
                    string = null;
                }
                if ((j & 3315714752512L) != 0) {
                    if (settingsViewModel != null) {
                        c11 = settingsViewModel.f33092A;
                    } else {
                        c11 = null;
                    }
                    s(34, c11);
                    if (c11 != null) {
                        bVar26 = (Y8.b) c11.d();
                    }
                    if ((j & 3435973836800L) != 0) {
                        if (settingsViewModel != null) {
                            c10 = settingsViewModel.f33114L;
                        } else {
                            c10 = null;
                        }
                        s(37, c10);
                        if (c10 != null) {
                            bVar27 = (Y8.b) c10.d();
                        }
                    }
                    bVar16 = bVar21;
                    bVar14 = bVar18;
                    bVar11 = bVar19;
                    bVar13 = bVar20;
                    z10 = zP;
                    bVar = bVar22;
                    bVar15 = bVar23;
                    str3 = str4;
                    bVar9 = bVar24;
                    bVar12 = bVar25;
                    str = string;
                    bVar10 = bVar17;
                    bVar3 = bVar26;
                    bVar2 = bVar27;
                } else {
                    string = string;
                }
                bVar26 = null;
                if ((j & 3435973836800L) != 0) {
                    if (settingsViewModel != null) {
                        c10 = settingsViewModel.f33114L;
                    } else {
                        c10 = null;
                    }
                    s(37, c10);
                    if (c10 != null) {
                        bVar27 = (Y8.b) c10.d();
                    }
                }
                bVar16 = bVar21;
                bVar14 = bVar18;
                bVar11 = bVar19;
                bVar13 = bVar20;
                z10 = zP;
                bVar = bVar22;
                bVar15 = bVar23;
                str3 = str4;
                bVar9 = bVar24;
                bVar12 = bVar25;
                str = string;
                bVar10 = bVar17;
                bVar3 = bVar26;
                bVar2 = bVar27;
            } else {
                bVar24 = bVar24;
            }
            bVar25 = null;
            if ((j & 3307124817920L) != 0) {
                if (settingsViewModel != null) {
                    c12 = settingsViewModel.f33136W;
                } else {
                    c12 = null;
                }
                s(33, c12);
                if (c12 != null) {
                    num = (Integer) c12.d();
                } else {
                    num = null;
                }
                string = this.f4488d.getContext().getString(M0.h.o(num));
            } else {
                bVar25 = bVar25;
                string = null;
            }
            if ((j & 3315714752512L) != 0) {
                if (settingsViewModel != null) {
                    c11 = settingsViewModel.f33092A;
                } else {
                    c11 = null;
                }
                s(34, c11);
                if (c11 != null) {
                    bVar26 = (Y8.b) c11.d();
                }
                if ((j & 3435973836800L) != 0) {
                    if (settingsViewModel != null) {
                        c10 = settingsViewModel.f33114L;
                    } else {
                        c10 = null;
                    }
                    s(37, c10);
                    if (c10 != null) {
                        bVar27 = (Y8.b) c10.d();
                    }
                }
                bVar16 = bVar21;
                bVar14 = bVar18;
                bVar11 = bVar19;
                bVar13 = bVar20;
                z10 = zP;
                bVar = bVar22;
                bVar15 = bVar23;
                str3 = str4;
                bVar9 = bVar24;
                bVar12 = bVar25;
                str = string;
                bVar10 = bVar17;
                bVar3 = bVar26;
                bVar2 = bVar27;
            } else {
                string = string;
            }
            bVar26 = null;
            if ((j & 3435973836800L) != 0) {
                if (settingsViewModel != null) {
                    c10 = settingsViewModel.f33114L;
                } else {
                    c10 = null;
                }
                s(37, c10);
                if (c10 != null) {
                    bVar27 = (Y8.b) c10.d();
                }
            }
            bVar16 = bVar21;
            bVar14 = bVar18;
            bVar11 = bVar19;
            bVar13 = bVar20;
            z10 = zP;
            bVar = bVar22;
            bVar15 = bVar23;
            str3 = str4;
            bVar9 = bVar24;
            bVar12 = bVar25;
            str = string;
            bVar10 = bVar17;
            bVar3 = bVar26;
            bVar2 = bVar27;
        } else {
            bVar = null;
            bVar2 = null;
            str = null;
            bVar3 = null;
            bVar4 = null;
            bVar5 = null;
            str2 = null;
            bVar6 = null;
            bVar7 = null;
            bVar8 = null;
            str3 = null;
            bVar9 = null;
            bVar10 = null;
            bVar11 = null;
            bVar12 = null;
            bVar13 = null;
            bVar14 = null;
            bVar15 = null;
            bVar16 = null;
            z10 = false;
        }
        if ((j & 2199023255552L) != 0) {
            this.f2029r.f4488d.setOnClickListener(this.f2063t0);
            this.f2029r.t(this.f4488d.getResources().getString(R.string.common_voltage));
            this.f2030s.f4488d.setOnClickListener(this.f2066x0);
            this.f2030s.t(this.f4488d.getResources().getString(R.string.view_scan_settings_freeze_frame));
            this.f2031t.f4488d.setOnClickListener(this.f2051h0);
            this.f2031t.t(this.f4488d.getResources().getString(R.string.common_background));
            this.f2032u.f4488d.setOnClickListener(this.f2062s0);
            this.f2032u.t(this.f4488d.getResources().getString(R.string.view_settings_database));
            this.f2033v.f4488d.setOnClickListener(this.f2064u0);
            this.f2033v.t(this.f4488d.getResources().getString(R.string.device_pin));
            this.f2034w.f4488d.setOnClickListener(this.f2047d0);
            this.f2035x.f4488d.setOnClickListener(this.f2058o0);
            this.f2036y.f4488d.setOnClickListener(this.f2048e0);
            this.f2036y.t(this.f4488d.getResources().getString(R.string.view_settings_application));
            this.f2005E.f4488d.setOnClickListener(this.f2059p0);
            this.f2005E.t(this.f4488d.getResources().getString(R.string.common_raw_data));
            this.f2007G.f4488d.setOnClickListener(this.v0);
            this.f2007G.t(this.f4488d.getResources().getString(R.string.view_settings_faulty_control_units));
            this.f2008H.t(this.f2061r0);
            this.f2009I.t(this.f2054k0);
            this.f2010J.setOnClickListener(this.f2050g0);
            this.f2011K.setOnClickListener(this.f2046c0);
            this.f2012L.f4488d.setOnClickListener(this.f2053j0);
            this.f2012L.t(this.f4488d.getResources().getString(R.string.view_settings_start_view));
            this.f2020T.f4488d.setOnClickListener(this.f2060q0);
            this.f2020T.t(this.f4488d.getResources().getString(R.string.view_settings_autocode_gateway_list));
            this.f2021U.f4488d.setOnClickListener(this.f2049f0);
            this.f2021U.t(this.f4488d.getResources().getString(R.string.view_settings_vehicle_engine));
            this.f2022V.f4488d.setOnClickListener(this.f2055l0);
            this.f2022V.t(this.f4488d.getResources().getString(R.string.view_settings_vehicle_name));
            this.f2023W.f4488d.setOnClickListener(this.f2052i0);
            this.f2023W.t(this.f4488d.getResources().getString(R.string.view_settings_vehicle_year));
            this.f2024X.f4488d.setOnClickListener(this.f2057n0);
            this.f2024X.t(this.f4488d.getResources().getString(R.string.common_voltage));
            this.f2026Z.f4488d.setOnClickListener(this.f2065w0);
            this.f2026Z.t(this.f4488d.getResources().getString(R.string.common_device_alert));
            this.f2027a0.f4488d.setOnClickListener(this.f2056m0);
            this.f2027a0.t(this.f4488d.getResources().getString(R.string.common_unlock_sfd_automatically));
        }
        if ((j & 3298534884352L) != 0) {
            this.f2029r.u(bVar5);
        }
        if ((j & 3298568437760L) != 0) {
            this.f2030s.u(bVar);
        }
        if ((3435973836800L & j) != 0) {
            this.f2031t.u(bVar2);
            this.f2033v.u(bVar2);
        }
        if ((j & 3298534916096L) != 0) {
            this.f2032u.u(bVar6);
        }
        if ((3307124817920L & j) != 0) {
            this.f2034w.t(str);
        }
        if ((j & 3298535014400L) != 0) {
            this.f2035x.u(bVar8);
        }
        if ((j & 3298534883584L) != 0) {
            this.f2036y.u(bVar4);
        }
        if ((3315714752512L & j) != 0) {
            this.f2005E.u(bVar3);
        }
        if ((j & 3298534948864L) != 0) {
            this.f2007G.u(bVar7);
        }
        if ((j & 3298534899712L) != 0) {
            this.f2008H.u(str2);
        }
        if ((j & 3298803318784L) != 0) {
            this.f2009I.u(str3);
        }
        if ((j & 3299071754240L) != 0) {
            boolean z11 = z10;
            W8.d.f(this.f2012L.f4488d, z11);
            W8.d.f(this.f2025Y, z11);
        }
        if ((3299608625152L & j) != 0) {
            this.f2012L.u(bVar9);
        }
        if ((j & 3298534883392L) != 0) {
            this.f2020T.u(bVar10);
        }
        if ((j & 3298535931904L) != 0) {
            this.f2021U.u(bVar11);
        }
        if ((3302829850624L & j) != 0) {
            this.f2022V.u(bVar12);
        }
        if ((j & 3298543271936L) != 0) {
            this.f2023W.u(bVar13);
        }
        if ((j & 3298535407616L) != 0) {
            this.f2024X.u(bVar14);
        }
        if ((j & 3298669101056L) != 0) {
            this.f2026Z.u(bVar15);
        }
        if ((j & 3298551660544L) != 0) {
            this.f2027a0.u(bVar16);
        }
        this.f2005E.e();
        this.f2022V.e();
        this.f2023W.e();
        this.f2021U.e();
        this.f2007G.e();
        this.f2024X.e();
        this.f2020T.e();
        this.f2031t.e();
        this.f2012L.e();
        this.f2034w.e();
        this.f2036y.e();
        this.f2032u.e();
        this.f2030s.e();
        this.f2035x.e();
        this.f2033v.e();
        this.f2029r.e();
        this.f2026Z.e();
        this.f2027a0.e();
        this.f2008H.e();
        this.f2009I.e();
    }

    @Override // M0.h
    public final boolean g() {
        synchronized (this) {
            try {
                if (this.f2067y0 != 0) {
                    return true;
                }
                return this.f2005E.g() || this.f2022V.g() || this.f2023W.g() || this.f2021U.g() || this.f2007G.g() || this.f2024X.g() || this.f2020T.g() || this.f2031t.g() || this.f2012L.g() || this.f2034w.g() || this.f2036y.g() || this.f2032u.g() || this.f2030s.g() || this.f2035x.g() || this.f2033v.g() || this.f2029r.g() || this.f2026Z.g() || this.f2027a0.g() || this.f2008H.g() || this.f2009I.g();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M0.h
    public final void i() {
        synchronized (this) {
            this.f2067y0 = 2199023255552L;
        }
        this.f2005E.i();
        this.f2022V.i();
        this.f2023W.i();
        this.f2021U.i();
        this.f2007G.i();
        this.f2024X.i();
        this.f2020T.i();
        this.f2031t.i();
        this.f2012L.i();
        this.f2034w.i();
        this.f2036y.i();
        this.f2032u.i();
        this.f2030s.i();
        this.f2035x.i();
        this.f2033v.i();
        this.f2029r.i();
        this.f2026Z.i();
        this.f2027a0.i();
        this.f2008H.i();
        this.f2009I.i();
        n();
    }

    @Override // M0.h
    public final boolean l(int i10, int i11, Object obj) {
        switch (i10) {
            case 0:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f2067y0 |= 1;
                    break;
                }
                return true;
            case 1:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f2067y0 |= 2;
                    break;
                }
                return true;
            case 2:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f2067y0 |= 4;
                    break;
                }
                return true;
            case 3:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f2067y0 |= 8;
                    break;
                }
                return true;
            case 4:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f2067y0 |= 16;
                    break;
                }
                return true;
            case 5:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f2067y0 |= 32;
                    break;
                }
                return true;
            case 6:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f2067y0 |= 64;
                    break;
                }
                return true;
            case 7:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f2067y0 |= 128;
                    break;
                }
                return true;
            case 8:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f2067y0 |= 256;
                    break;
                }
                return true;
            case 9:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f2067y0 |= 512;
                    break;
                }
                return true;
            case 10:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f2067y0 |= 1024;
                    break;
                }
                return true;
            case 11:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f2067y0 |= 2048;
                    break;
                }
                return true;
            case 12:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f2067y0 |= 4096;
                    break;
                }
                return true;
            case 13:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f2067y0 |= 8192;
                    break;
                }
                return true;
            case 14:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f2067y0 |= 16384;
                    break;
                }
                return true;
            case 15:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f2067y0 |= 32768;
                    break;
                }
                return true;
            case 16:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f2067y0 |= 65536;
                    break;
                }
                return true;
            case 17:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f2067y0 |= 131072;
                    break;
                }
                return true;
            case 18:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f2067y0 |= 262144;
                    break;
                }
                return true;
            case 19:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f2067y0 |= 524288;
                    break;
                }
                return true;
            case 20:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f2067y0 |= 1048576;
                    break;
                }
                return true;
            case 21:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f2067y0 |= 2097152;
                    break;
                }
                return true;
            case 22:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f2067y0 |= 4194304;
                    break;
                }
                return true;
            case 23:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f2067y0 |= 8388608;
                    break;
                }
                return true;
            case 24:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f2067y0 |= 16777216;
                    break;
                }
                return true;
            case 25:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f2067y0 |= 33554432;
                    break;
                }
                return true;
            case 26:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f2067y0 |= 67108864;
                    break;
                }
                return true;
            case 27:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f2067y0 |= 134217728;
                    break;
                }
                return true;
            case 28:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f2067y0 |= 268435456;
                    break;
                }
                return true;
            case 29:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f2067y0 |= 536870912;
                    break;
                }
                return true;
            case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f2067y0 |= 1073741824;
                    break;
                }
                return true;
            case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f2067y0 |= 2147483648L;
                    break;
                }
                return true;
            case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f2067y0 |= 4294967296L;
                    break;
                }
                return true;
            case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f2067y0 |= 8589934592L;
                    break;
                }
                return true;
            case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f2067y0 |= 17179869184L;
                    break;
                }
                return true;
            case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f2067y0 |= 34359738368L;
                    break;
                }
                return true;
            case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f2067y0 |= 68719476736L;
                    break;
                }
                return true;
            case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f2067y0 |= 137438953472L;
                    break;
                }
                return true;
            case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f2067y0 |= 274877906944L;
                    break;
                }
                return true;
            case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f2067y0 |= 549755813888L;
                    break;
                }
                return true;
            default:
                return false;
        }
    }

    @Override // M0.h
    public final void q(InterfaceC1376t interfaceC1376t) {
        super.q(interfaceC1376t);
        this.f2005E.q(interfaceC1376t);
        this.f2022V.q(interfaceC1376t);
        this.f2023W.q(interfaceC1376t);
        this.f2021U.q(interfaceC1376t);
        this.f2007G.q(interfaceC1376t);
        this.f2024X.q(interfaceC1376t);
        this.f2020T.q(interfaceC1376t);
        this.f2031t.q(interfaceC1376t);
        this.f2012L.q(interfaceC1376t);
        this.f2034w.q(interfaceC1376t);
        this.f2036y.q(interfaceC1376t);
        this.f2032u.q(interfaceC1376t);
        this.f2030s.q(interfaceC1376t);
        this.f2035x.q(interfaceC1376t);
        this.f2033v.q(interfaceC1376t);
        this.f2029r.q(interfaceC1376t);
        this.f2026Z.q(interfaceC1376t);
        this.f2027a0.q(interfaceC1376t);
        this.f2008H.q(interfaceC1376t);
        this.f2009I.q(interfaceC1376t);
    }

    @Override // B8.AbstractC0638l0
    public final void t(SettingsViewModel settingsViewModel) {
        this.f2028b0 = settingsViewModel;
        synchronized (this) {
            this.f2067y0 |= 1099511627776L;
        }
        c(22);
        n();
    }
}
