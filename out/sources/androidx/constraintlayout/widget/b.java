package androidx.constraintlayout.widget;

import C7.g;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import me.zhanghai.android.materialprogressbar.R;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: ConstraintSet.java */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f16480h = {0, 4, 8};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final SparseIntArray f16481i;
    public static final SparseIntArray j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f16482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f16483b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String[] f16484c = new String[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16485d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap<String, ConstraintAttribute> f16486e = new HashMap<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f16487f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap<Integer, a> f16488g = new HashMap<>();

    /* JADX INFO: compiled from: ConstraintSet.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f16489a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f16490b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f16491c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final c f16492d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final C0170b f16493e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final e f16494f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public HashMap<String, ConstraintAttribute> f16495g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public C0169a f16496h;

        /* JADX INFO: renamed from: androidx.constraintlayout.widget.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ConstraintSet.java */
        public static class C0169a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int[] f16497a = new int[10];

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int[] f16498b = new int[10];

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f16499c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int[] f16500d = new int[10];

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public float[] f16501e = new float[10];

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public int f16502f = 0;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public int[] f16503g = new int[5];

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public String[] f16504h = new String[5];

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public int f16505i = 0;
            public int[] j = new int[4];

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public boolean[] f16506k = new boolean[4];

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public int f16507l = 0;

            public final void a(float f10, int i10) {
                int i11 = this.f16502f;
                int[] iArr = this.f16500d;
                if (i11 >= iArr.length) {
                    this.f16500d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f16501e;
                    this.f16501e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f16500d;
                int i12 = this.f16502f;
                iArr2[i12] = i10;
                float[] fArr2 = this.f16501e;
                this.f16502f = i12 + 1;
                fArr2[i12] = f10;
            }

            public final void b(int i10, int i11) {
                int i12 = this.f16499c;
                int[] iArr = this.f16497a;
                if (i12 >= iArr.length) {
                    this.f16497a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f16498b;
                    this.f16498b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f16497a;
                int i13 = this.f16499c;
                iArr3[i13] = i10;
                int[] iArr4 = this.f16498b;
                this.f16499c = i13 + 1;
                iArr4[i13] = i11;
            }

            public final void c(int i10, String str) {
                int i11 = this.f16505i;
                int[] iArr = this.f16503g;
                if (i11 >= iArr.length) {
                    this.f16503g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f16504h;
                    this.f16504h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f16503g;
                int i12 = this.f16505i;
                iArr2[i12] = i10;
                String[] strArr2 = this.f16504h;
                this.f16505i = i12 + 1;
                strArr2[i12] = str;
            }

            public final void d(int i10, boolean z10) {
                int i11 = this.f16507l;
                int[] iArr = this.j;
                if (i11 >= iArr.length) {
                    this.j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f16506k;
                    this.f16506k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.j;
                int i12 = this.f16507l;
                iArr2[i12] = i10;
                boolean[] zArr2 = this.f16506k;
                this.f16507l = i12 + 1;
                zArr2[i12] = z10;
            }

            public final void e(a aVar) {
                for (int i10 = 0; i10 < this.f16499c; i10++) {
                    int i11 = this.f16497a[i10];
                    int i12 = this.f16498b[i10];
                    int[] iArr = b.f16480h;
                    if (i11 == 6) {
                        aVar.f16493e.f16512D = i12;
                    } else if (i11 == 7) {
                        aVar.f16493e.f16513E = i12;
                    } else if (i11 == 8) {
                        aVar.f16493e.f16519K = i12;
                    } else if (i11 == 27) {
                        aVar.f16493e.f16514F = i12;
                    } else if (i11 == 28) {
                        aVar.f16493e.f16516H = i12;
                    } else if (i11 == 41) {
                        aVar.f16493e.f16531W = i12;
                    } else if (i11 == 42) {
                        aVar.f16493e.f16532X = i12;
                    } else if (i11 == 61) {
                        aVar.f16493e.f16509A = i12;
                    } else if (i11 == 62) {
                        aVar.f16493e.f16510B = i12;
                    } else if (i11 == 72) {
                        aVar.f16493e.f16548g0 = i12;
                    } else if (i11 == 73) {
                        aVar.f16493e.f16550h0 = i12;
                    } else if (i11 == 88) {
                        aVar.f16492d.f16587l = i12;
                    } else if (i11 == 89) {
                        aVar.f16492d.f16588m = i12;
                    } else if (i11 == 2) {
                        aVar.f16493e.f16518J = i12;
                    } else if (i11 == 31) {
                        aVar.f16493e.f16520L = i12;
                    } else if (i11 == 34) {
                        aVar.f16493e.f16517I = i12;
                    } else if (i11 == 38) {
                        aVar.f16489a = i12;
                    } else if (i11 == 64) {
                        aVar.f16492d.f16578b = i12;
                    } else if (i11 == 66) {
                        aVar.f16492d.f16582f = i12;
                    } else if (i11 == 76) {
                        aVar.f16492d.f16581e = i12;
                    } else if (i11 == 78) {
                        aVar.f16491c.f16591c = i12;
                    } else if (i11 == 97) {
                        aVar.f16493e.f16565p0 = i12;
                    } else if (i11 == 93) {
                        aVar.f16493e.f16521M = i12;
                    } else if (i11 != 94) {
                        switch (i11) {
                            case 11:
                                aVar.f16493e.f16525Q = i12;
                                break;
                            case 12:
                                aVar.f16493e.f16526R = i12;
                                break;
                            case 13:
                                aVar.f16493e.f16522N = i12;
                                break;
                            case 14:
                                aVar.f16493e.f16524P = i12;
                                break;
                            case 15:
                                aVar.f16493e.f16527S = i12;
                                break;
                            case 16:
                                aVar.f16493e.f16523O = i12;
                                break;
                            case 17:
                                aVar.f16493e.f16543e = i12;
                                break;
                            case 18:
                                aVar.f16493e.f16545f = i12;
                                break;
                            default:
                                switch (i11) {
                                    case 21:
                                        aVar.f16493e.f16541d = i12;
                                        break;
                                    case 22:
                                        aVar.f16491c.f16590b = i12;
                                        break;
                                    case 23:
                                        aVar.f16493e.f16539c = i12;
                                        break;
                                    case 24:
                                        aVar.f16493e.f16515G = i12;
                                        break;
                                    default:
                                        switch (i11) {
                                            case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                                                aVar.f16493e.f16533Y = i12;
                                                break;
                                            case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                                                aVar.f16493e.f16534Z = i12;
                                                break;
                                            case R.styleable.AppCompatTheme_colorError /* 56 */:
                                                aVar.f16493e.f16536a0 = i12;
                                                break;
                                            case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                                                aVar.f16493e.f16538b0 = i12;
                                                break;
                                            case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                                                aVar.f16493e.f16540c0 = i12;
                                                break;
                                            case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                                                aVar.f16493e.f16542d0 = i12;
                                                break;
                                            default:
                                                switch (i11) {
                                                    case R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
                                                        aVar.f16492d.f16579c = i12;
                                                        break;
                                                    case R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 83 */:
                                                        aVar.f16494f.f16603i = i12;
                                                        break;
                                                    case R.styleable.AppCompatTheme_listPreferredItemPaddingRight /* 84 */:
                                                        aVar.f16492d.j = i12;
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                    } else {
                        aVar.f16493e.f16528T = i12;
                    }
                }
                for (int i13 = 0; i13 < this.f16502f; i13++) {
                    int i14 = this.f16500d[i13];
                    float f10 = this.f16501e[i13];
                    int[] iArr2 = b.f16480h;
                    if (i14 == 19) {
                        aVar.f16493e.f16547g = f10;
                    } else if (i14 == 20) {
                        aVar.f16493e.f16573x = f10;
                    } else if (i14 == 37) {
                        aVar.f16493e.f16574y = f10;
                    } else if (i14 == 60) {
                        aVar.f16494f.f16596b = f10;
                    } else if (i14 == 63) {
                        aVar.f16493e.f16511C = f10;
                    } else if (i14 == 79) {
                        aVar.f16492d.f16583g = f10;
                    } else if (i14 == 85) {
                        aVar.f16492d.f16585i = f10;
                    } else if (i14 == 39) {
                        aVar.f16493e.f16530V = f10;
                    } else if (i14 != 40) {
                        switch (i14) {
                            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                                aVar.f16491c.f16592d = f10;
                                break;
                            case 44:
                                e eVar = aVar.f16494f;
                                eVar.f16607n = f10;
                                eVar.f16606m = true;
                                break;
                            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                                aVar.f16494f.f16597c = f10;
                                break;
                            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                                aVar.f16494f.f16598d = f10;
                                break;
                            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                                aVar.f16494f.f16599e = f10;
                                break;
                            case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                                aVar.f16494f.f16600f = f10;
                                break;
                            case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                                aVar.f16494f.f16601g = f10;
                                break;
                            case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                                aVar.f16494f.f16602h = f10;
                                break;
                            case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                                aVar.f16494f.j = f10;
                                break;
                            case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                                aVar.f16494f.f16604k = f10;
                                break;
                            case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                                aVar.f16494f.f16605l = f10;
                                break;
                            default:
                                switch (i14) {
                                    case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                                        aVar.f16492d.f16584h = f10;
                                        break;
                                    case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                                        aVar.f16491c.f16593e = f10;
                                        break;
                                    case R.styleable.AppCompatTheme_editTextColor /* 69 */:
                                        aVar.f16493e.f16544e0 = f10;
                                        break;
                                    case R.styleable.AppCompatTheme_editTextStyle /* 70 */:
                                        aVar.f16493e.f16546f0 = f10;
                                        break;
                                }
                                break;
                        }
                    } else {
                        aVar.f16493e.f16529U = f10;
                    }
                }
                for (int i15 = 0; i15 < this.f16505i; i15++) {
                    int i16 = this.f16503g[i15];
                    String str = this.f16504h[i15];
                    int[] iArr3 = b.f16480h;
                    if (i16 == 5) {
                        aVar.f16493e.f16575z = str;
                    } else if (i16 == 65) {
                        aVar.f16492d.f16580d = str;
                    } else if (i16 == 74) {
                        C0170b c0170b = aVar.f16493e;
                        c0170b.f16555k0 = str;
                        c0170b.f16553j0 = null;
                    } else if (i16 == 77) {
                        aVar.f16493e.f16557l0 = str;
                    } else if (i16 == 90) {
                        aVar.f16492d.f16586k = str;
                    }
                }
                for (int i17 = 0; i17 < this.f16507l; i17++) {
                    int i18 = this.j[i17];
                    boolean z10 = this.f16506k[i17];
                    int[] iArr4 = b.f16480h;
                    if (i18 == 44) {
                        aVar.f16494f.f16606m = z10;
                    } else if (i18 == 75) {
                        aVar.f16493e.f16563o0 = z10;
                    } else if (i18 == 80) {
                        aVar.f16493e.f16559m0 = z10;
                    } else if (i18 == 81) {
                        aVar.f16493e.f16561n0 = z10;
                    }
                }
            }
        }

        public a() {
            d dVar = new d();
            dVar.f16589a = false;
            dVar.f16590b = 0;
            dVar.f16591c = 0;
            dVar.f16592d = 1.0f;
            dVar.f16593e = Float.NaN;
            this.f16491c = dVar;
            c cVar = new c();
            cVar.f16577a = false;
            cVar.f16578b = -1;
            cVar.f16579c = 0;
            cVar.f16580d = null;
            cVar.f16581e = -1;
            cVar.f16582f = 0;
            cVar.f16583g = Float.NaN;
            cVar.f16584h = Float.NaN;
            cVar.f16585i = Float.NaN;
            cVar.j = -1;
            cVar.f16586k = null;
            cVar.f16587l = -3;
            cVar.f16588m = -1;
            this.f16492d = cVar;
            this.f16493e = new C0170b();
            e eVar = new e();
            eVar.f16595a = false;
            eVar.f16596b = 0.0f;
            eVar.f16597c = 0.0f;
            eVar.f16598d = 0.0f;
            eVar.f16599e = 1.0f;
            eVar.f16600f = 1.0f;
            eVar.f16601g = Float.NaN;
            eVar.f16602h = Float.NaN;
            eVar.f16603i = -1;
            eVar.j = 0.0f;
            eVar.f16604k = 0.0f;
            eVar.f16605l = 0.0f;
            eVar.f16606m = false;
            eVar.f16607n = 0.0f;
            this.f16494f = eVar;
            this.f16495g = new HashMap<>();
        }

        public final void a(ConstraintLayout.a aVar) {
            C0170b c0170b = this.f16493e;
            aVar.f16429e = c0170b.f16551i;
            aVar.f16431f = c0170b.j;
            aVar.f16433g = c0170b.f16554k;
            aVar.f16435h = c0170b.f16556l;
            aVar.f16437i = c0170b.f16558m;
            aVar.j = c0170b.f16560n;
            aVar.f16440k = c0170b.f16562o;
            aVar.f16442l = c0170b.f16564p;
            aVar.f16444m = c0170b.f16566q;
            aVar.f16446n = c0170b.f16567r;
            aVar.f16448o = c0170b.f16568s;
            aVar.f16455s = c0170b.f16569t;
            aVar.f16456t = c0170b.f16570u;
            aVar.f16457u = c0170b.f16571v;
            aVar.f16458v = c0170b.f16572w;
            ((ViewGroup.MarginLayoutParams) aVar).leftMargin = c0170b.f16515G;
            ((ViewGroup.MarginLayoutParams) aVar).rightMargin = c0170b.f16516H;
            ((ViewGroup.MarginLayoutParams) aVar).topMargin = c0170b.f16517I;
            ((ViewGroup.MarginLayoutParams) aVar).bottomMargin = c0170b.f16518J;
            aVar.f16395A = c0170b.f16527S;
            aVar.f16396B = c0170b.f16526R;
            aVar.f16460x = c0170b.f16523O;
            aVar.f16462z = c0170b.f16525Q;
            aVar.f16399E = c0170b.f16573x;
            aVar.f16400F = c0170b.f16574y;
            aVar.f16450p = c0170b.f16509A;
            aVar.f16452q = c0170b.f16510B;
            aVar.f16454r = c0170b.f16511C;
            aVar.f16401G = c0170b.f16575z;
            aVar.f16414T = c0170b.f16512D;
            aVar.f16415U = c0170b.f16513E;
            aVar.f16403I = c0170b.f16529U;
            aVar.f16402H = c0170b.f16530V;
            aVar.f16405K = c0170b.f16532X;
            aVar.f16404J = c0170b.f16531W;
            aVar.f16417W = c0170b.f16559m0;
            aVar.f16418X = c0170b.f16561n0;
            aVar.f16406L = c0170b.f16533Y;
            aVar.f16407M = c0170b.f16534Z;
            aVar.f16410P = c0170b.f16536a0;
            aVar.f16411Q = c0170b.f16538b0;
            aVar.f16408N = c0170b.f16540c0;
            aVar.f16409O = c0170b.f16542d0;
            aVar.f16412R = c0170b.f16544e0;
            aVar.f16413S = c0170b.f16546f0;
            aVar.f16416V = c0170b.f16514F;
            aVar.f16425c = c0170b.f16547g;
            aVar.f16421a = c0170b.f16543e;
            aVar.f16423b = c0170b.f16545f;
            ((ViewGroup.MarginLayoutParams) aVar).width = c0170b.f16539c;
            ((ViewGroup.MarginLayoutParams) aVar).height = c0170b.f16541d;
            String str = c0170b.f16557l0;
            if (str != null) {
                aVar.f16419Y = str;
            }
            aVar.f16420Z = c0170b.f16565p0;
            aVar.setMarginStart(c0170b.f16520L);
            aVar.setMarginEnd(c0170b.f16519K);
            aVar.a();
        }

        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a clone() {
            a aVar = new a();
            aVar.f16493e.a(this.f16493e);
            aVar.f16492d.a(this.f16492d);
            d dVar = aVar.f16491c;
            d dVar2 = this.f16491c;
            dVar.f16589a = dVar2.f16589a;
            dVar.f16590b = dVar2.f16590b;
            dVar.f16592d = dVar2.f16592d;
            dVar.f16593e = dVar2.f16593e;
            dVar.f16591c = dVar2.f16591c;
            aVar.f16494f.a(this.f16494f);
            aVar.f16489a = this.f16489a;
            aVar.f16496h = this.f16496h;
            return aVar;
        }

        public final void c(int i10, ConstraintLayout.a aVar) {
            this.f16489a = i10;
            int i11 = aVar.f16429e;
            C0170b c0170b = this.f16493e;
            c0170b.f16551i = i11;
            c0170b.j = aVar.f16431f;
            c0170b.f16554k = aVar.f16433g;
            c0170b.f16556l = aVar.f16435h;
            c0170b.f16558m = aVar.f16437i;
            c0170b.f16560n = aVar.j;
            c0170b.f16562o = aVar.f16440k;
            c0170b.f16564p = aVar.f16442l;
            c0170b.f16566q = aVar.f16444m;
            c0170b.f16567r = aVar.f16446n;
            c0170b.f16568s = aVar.f16448o;
            c0170b.f16569t = aVar.f16455s;
            c0170b.f16570u = aVar.f16456t;
            c0170b.f16571v = aVar.f16457u;
            c0170b.f16572w = aVar.f16458v;
            c0170b.f16573x = aVar.f16399E;
            c0170b.f16574y = aVar.f16400F;
            c0170b.f16575z = aVar.f16401G;
            c0170b.f16509A = aVar.f16450p;
            c0170b.f16510B = aVar.f16452q;
            c0170b.f16511C = aVar.f16454r;
            c0170b.f16512D = aVar.f16414T;
            c0170b.f16513E = aVar.f16415U;
            c0170b.f16514F = aVar.f16416V;
            c0170b.f16547g = aVar.f16425c;
            c0170b.f16543e = aVar.f16421a;
            c0170b.f16545f = aVar.f16423b;
            c0170b.f16539c = ((ViewGroup.MarginLayoutParams) aVar).width;
            c0170b.f16541d = ((ViewGroup.MarginLayoutParams) aVar).height;
            c0170b.f16515G = ((ViewGroup.MarginLayoutParams) aVar).leftMargin;
            c0170b.f16516H = ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
            c0170b.f16517I = ((ViewGroup.MarginLayoutParams) aVar).topMargin;
            c0170b.f16518J = ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
            c0170b.f16521M = aVar.f16398D;
            c0170b.f16529U = aVar.f16403I;
            c0170b.f16530V = aVar.f16402H;
            c0170b.f16532X = aVar.f16405K;
            c0170b.f16531W = aVar.f16404J;
            c0170b.f16559m0 = aVar.f16417W;
            c0170b.f16561n0 = aVar.f16418X;
            c0170b.f16533Y = aVar.f16406L;
            c0170b.f16534Z = aVar.f16407M;
            c0170b.f16536a0 = aVar.f16410P;
            c0170b.f16538b0 = aVar.f16411Q;
            c0170b.f16540c0 = aVar.f16408N;
            c0170b.f16542d0 = aVar.f16409O;
            c0170b.f16544e0 = aVar.f16412R;
            c0170b.f16546f0 = aVar.f16413S;
            c0170b.f16557l0 = aVar.f16419Y;
            c0170b.f16523O = aVar.f16460x;
            c0170b.f16525Q = aVar.f16462z;
            c0170b.f16522N = aVar.f16459w;
            c0170b.f16524P = aVar.f16461y;
            c0170b.f16527S = aVar.f16395A;
            c0170b.f16526R = aVar.f16396B;
            c0170b.f16528T = aVar.f16397C;
            c0170b.f16565p0 = aVar.f16420Z;
            c0170b.f16519K = aVar.getMarginEnd();
            c0170b.f16520L = aVar.getMarginStart();
        }

        public final void d(int i10, androidx.constraintlayout.widget.c.a aVar) {
            c(i10, aVar);
            this.f16491c.f16592d = aVar.f16612r0;
            float f10 = aVar.f16615u0;
            e eVar = this.f16494f;
            eVar.f16596b = f10;
            eVar.f16597c = aVar.v0;
            eVar.f16598d = aVar.f16616w0;
            eVar.f16599e = aVar.f16617x0;
            eVar.f16600f = aVar.f16618y0;
            eVar.f16601g = aVar.f16619z0;
            eVar.f16602h = aVar.f16608A0;
            eVar.j = aVar.f16609B0;
            eVar.f16604k = aVar.f16610C0;
            eVar.f16605l = aVar.f16611D0;
            eVar.f16607n = aVar.f16614t0;
            eVar.f16606m = aVar.f16613s0;
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ConstraintSet.java */
    public static class C0170b {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static final SparseIntArray f16508q0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f16539c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f16541d;

        /* JADX INFO: renamed from: j0, reason: collision with root package name */
        public int[] f16553j0;

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        public String f16555k0;

        /* JADX INFO: renamed from: l0, reason: collision with root package name */
        public String f16557l0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f16535a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f16537b = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f16543e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f16545f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f16547g = -1.0f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f16549h = true;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f16551i = -1;
        public int j = -1;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f16554k = -1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f16556l = -1;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f16558m = -1;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f16560n = -1;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f16562o = -1;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f16564p = -1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f16566q = -1;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f16567r = -1;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f16568s = -1;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f16569t = -1;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f16570u = -1;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f16571v = -1;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f16572w = -1;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public float f16573x = 0.5f;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public float f16574y = 0.5f;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public String f16575z = null;

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public int f16509A = -1;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public int f16510B = 0;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public float f16511C = 0.0f;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public int f16512D = -1;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public int f16513E = -1;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public int f16514F = -1;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public int f16515G = 0;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public int f16516H = 0;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public int f16517I = 0;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public int f16518J = 0;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        public int f16519K = 0;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public int f16520L = 0;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        public int f16521M = 0;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public int f16522N = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public int f16523O = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        public int f16524P = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        public int f16525Q = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        public int f16526R = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        public int f16527S = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        public int f16528T = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        public float f16529U = -1.0f;

        /* JADX INFO: renamed from: V, reason: collision with root package name */
        public float f16530V = -1.0f;

        /* JADX INFO: renamed from: W, reason: collision with root package name */
        public int f16531W = 0;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        public int f16532X = 0;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public int f16533Y = 0;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        public int f16534Z = 0;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        public int f16536a0 = 0;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        public int f16538b0 = 0;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        public int f16540c0 = 0;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        public int f16542d0 = 0;

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        public float f16544e0 = 1.0f;

        /* JADX INFO: renamed from: f0, reason: collision with root package name */
        public float f16546f0 = 1.0f;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        public int f16548g0 = -1;

        /* JADX INFO: renamed from: h0, reason: collision with root package name */
        public int f16550h0 = 0;

        /* JADX INFO: renamed from: i0, reason: collision with root package name */
        public int f16552i0 = -1;

        /* JADX INFO: renamed from: m0, reason: collision with root package name */
        public boolean f16559m0 = false;

        /* JADX INFO: renamed from: n0, reason: collision with root package name */
        public boolean f16561n0 = false;

        /* JADX INFO: renamed from: o0, reason: collision with root package name */
        public boolean f16563o0 = true;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f16565p0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f16508q0 = sparseIntArray;
            sparseIntArray.append(43, 24);
            sparseIntArray.append(44, 25);
            sparseIntArray.append(46, 28);
            sparseIntArray.append(47, 29);
            sparseIntArray.append(52, 35);
            sparseIntArray.append(51, 34);
            sparseIntArray.append(24, 4);
            sparseIntArray.append(23, 3);
            sparseIntArray.append(19, 1);
            sparseIntArray.append(61, 6);
            sparseIntArray.append(62, 7);
            sparseIntArray.append(31, 17);
            sparseIntArray.append(32, 18);
            sparseIntArray.append(33, 19);
            sparseIntArray.append(15, 90);
            sparseIntArray.append(0, 26);
            sparseIntArray.append(48, 31);
            sparseIntArray.append(49, 32);
            sparseIntArray.append(30, 10);
            sparseIntArray.append(29, 9);
            sparseIntArray.append(66, 13);
            sparseIntArray.append(69, 16);
            sparseIntArray.append(67, 14);
            sparseIntArray.append(64, 11);
            sparseIntArray.append(68, 15);
            sparseIntArray.append(65, 12);
            sparseIntArray.append(55, 38);
            sparseIntArray.append(41, 37);
            sparseIntArray.append(40, 39);
            sparseIntArray.append(54, 40);
            sparseIntArray.append(39, 20);
            sparseIntArray.append(53, 36);
            sparseIntArray.append(28, 5);
            sparseIntArray.append(42, 91);
            sparseIntArray.append(50, 91);
            sparseIntArray.append(45, 91);
            sparseIntArray.append(22, 91);
            sparseIntArray.append(18, 91);
            sparseIntArray.append(3, 23);
            sparseIntArray.append(5, 27);
            sparseIntArray.append(7, 30);
            sparseIntArray.append(8, 8);
            sparseIntArray.append(4, 33);
            sparseIntArray.append(6, 2);
            sparseIntArray.append(1, 22);
            sparseIntArray.append(2, 21);
            sparseIntArray.append(56, 41);
            sparseIntArray.append(34, 42);
            sparseIntArray.append(17, 87);
            sparseIntArray.append(16, 88);
            sparseIntArray.append(71, 76);
            sparseIntArray.append(25, 61);
            sparseIntArray.append(27, 62);
            sparseIntArray.append(26, 63);
            sparseIntArray.append(60, 69);
            sparseIntArray.append(38, 70);
            sparseIntArray.append(12, 71);
            sparseIntArray.append(10, 72);
            sparseIntArray.append(11, 73);
            sparseIntArray.append(13, 74);
            sparseIntArray.append(9, 75);
            sparseIntArray.append(58, 84);
            sparseIntArray.append(59, 86);
            sparseIntArray.append(58, 83);
            sparseIntArray.append(37, 85);
            sparseIntArray.append(56, 87);
            sparseIntArray.append(34, 88);
            sparseIntArray.append(91, 89);
            sparseIntArray.append(15, 90);
        }

        public final void a(C0170b c0170b) {
            this.f16535a = c0170b.f16535a;
            this.f16539c = c0170b.f16539c;
            this.f16537b = c0170b.f16537b;
            this.f16541d = c0170b.f16541d;
            this.f16543e = c0170b.f16543e;
            this.f16545f = c0170b.f16545f;
            this.f16547g = c0170b.f16547g;
            this.f16549h = c0170b.f16549h;
            this.f16551i = c0170b.f16551i;
            this.j = c0170b.j;
            this.f16554k = c0170b.f16554k;
            this.f16556l = c0170b.f16556l;
            this.f16558m = c0170b.f16558m;
            this.f16560n = c0170b.f16560n;
            this.f16562o = c0170b.f16562o;
            this.f16564p = c0170b.f16564p;
            this.f16566q = c0170b.f16566q;
            this.f16567r = c0170b.f16567r;
            this.f16568s = c0170b.f16568s;
            this.f16569t = c0170b.f16569t;
            this.f16570u = c0170b.f16570u;
            this.f16571v = c0170b.f16571v;
            this.f16572w = c0170b.f16572w;
            this.f16573x = c0170b.f16573x;
            this.f16574y = c0170b.f16574y;
            this.f16575z = c0170b.f16575z;
            this.f16509A = c0170b.f16509A;
            this.f16510B = c0170b.f16510B;
            this.f16511C = c0170b.f16511C;
            this.f16512D = c0170b.f16512D;
            this.f16513E = c0170b.f16513E;
            this.f16514F = c0170b.f16514F;
            this.f16515G = c0170b.f16515G;
            this.f16516H = c0170b.f16516H;
            this.f16517I = c0170b.f16517I;
            this.f16518J = c0170b.f16518J;
            this.f16519K = c0170b.f16519K;
            this.f16520L = c0170b.f16520L;
            this.f16521M = c0170b.f16521M;
            this.f16522N = c0170b.f16522N;
            this.f16523O = c0170b.f16523O;
            this.f16524P = c0170b.f16524P;
            this.f16525Q = c0170b.f16525Q;
            this.f16526R = c0170b.f16526R;
            this.f16527S = c0170b.f16527S;
            this.f16528T = c0170b.f16528T;
            this.f16529U = c0170b.f16529U;
            this.f16530V = c0170b.f16530V;
            this.f16531W = c0170b.f16531W;
            this.f16532X = c0170b.f16532X;
            this.f16533Y = c0170b.f16533Y;
            this.f16534Z = c0170b.f16534Z;
            this.f16536a0 = c0170b.f16536a0;
            this.f16538b0 = c0170b.f16538b0;
            this.f16540c0 = c0170b.f16540c0;
            this.f16542d0 = c0170b.f16542d0;
            this.f16544e0 = c0170b.f16544e0;
            this.f16546f0 = c0170b.f16546f0;
            this.f16548g0 = c0170b.f16548g0;
            this.f16550h0 = c0170b.f16550h0;
            this.f16552i0 = c0170b.f16552i0;
            this.f16557l0 = c0170b.f16557l0;
            int[] iArr = c0170b.f16553j0;
            if (iArr == null || c0170b.f16555k0 != null) {
                this.f16553j0 = null;
            } else {
                this.f16553j0 = Arrays.copyOf(iArr, iArr.length);
            }
            this.f16555k0 = c0170b.f16555k0;
            this.f16559m0 = c0170b.f16559m0;
            this.f16561n0 = c0170b.f16561n0;
            this.f16563o0 = c0170b.f16563o0;
            this.f16565p0 = c0170b.f16565p0;
        }

        public final void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p139l0.d.f44132k);
            this.f16537b = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                SparseIntArray sparseIntArray = f16508q0;
                int i11 = sparseIntArray.get(index);
                switch (i11) {
                    case 1:
                        this.f16566q = b.l(typedArrayObtainStyledAttributes, index, this.f16566q);
                        break;
                    case 2:
                        this.f16518J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f16518J);
                        break;
                    case 3:
                        this.f16564p = b.l(typedArrayObtainStyledAttributes, index, this.f16564p);
                        break;
                    case 4:
                        this.f16562o = b.l(typedArrayObtainStyledAttributes, index, this.f16562o);
                        break;
                    case 5:
                        this.f16575z = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.f16512D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f16512D);
                        break;
                    case 7:
                        this.f16513E = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f16513E);
                        break;
                    case 8:
                        this.f16519K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f16519K);
                        break;
                    case 9:
                        this.f16572w = b.l(typedArrayObtainStyledAttributes, index, this.f16572w);
                        break;
                    case 10:
                        this.f16571v = b.l(typedArrayObtainStyledAttributes, index, this.f16571v);
                        break;
                    case 11:
                        this.f16525Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f16525Q);
                        break;
                    case 12:
                        this.f16526R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f16526R);
                        break;
                    case 13:
                        this.f16522N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f16522N);
                        break;
                    case 14:
                        this.f16524P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f16524P);
                        break;
                    case 15:
                        this.f16527S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f16527S);
                        break;
                    case 16:
                        this.f16523O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f16523O);
                        break;
                    case 17:
                        this.f16543e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f16543e);
                        break;
                    case 18:
                        this.f16545f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f16545f);
                        break;
                    case 19:
                        this.f16547g = typedArrayObtainStyledAttributes.getFloat(index, this.f16547g);
                        break;
                    case 20:
                        this.f16573x = typedArrayObtainStyledAttributes.getFloat(index, this.f16573x);
                        break;
                    case 21:
                        this.f16541d = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f16541d);
                        break;
                    case 22:
                        this.f16539c = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f16539c);
                        break;
                    case 23:
                        this.f16515G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f16515G);
                        break;
                    case 24:
                        this.f16551i = b.l(typedArrayObtainStyledAttributes, index, this.f16551i);
                        break;
                    case 25:
                        this.j = b.l(typedArrayObtainStyledAttributes, index, this.j);
                        break;
                    case 26:
                        this.f16514F = typedArrayObtainStyledAttributes.getInt(index, this.f16514F);
                        break;
                    case 27:
                        this.f16516H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f16516H);
                        break;
                    case 28:
                        this.f16554k = b.l(typedArrayObtainStyledAttributes, index, this.f16554k);
                        break;
                    case 29:
                        this.f16556l = b.l(typedArrayObtainStyledAttributes, index, this.f16556l);
                        break;
                    case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                        this.f16520L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f16520L);
                        break;
                    case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                        this.f16569t = b.l(typedArrayObtainStyledAttributes, index, this.f16569t);
                        break;
                    case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                        this.f16570u = b.l(typedArrayObtainStyledAttributes, index, this.f16570u);
                        break;
                    case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                        this.f16517I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f16517I);
                        break;
                    case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                        this.f16560n = b.l(typedArrayObtainStyledAttributes, index, this.f16560n);
                        break;
                    case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                        this.f16558m = b.l(typedArrayObtainStyledAttributes, index, this.f16558m);
                        break;
                    case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                        this.f16574y = typedArrayObtainStyledAttributes.getFloat(index, this.f16574y);
                        break;
                    case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                        this.f16530V = typedArrayObtainStyledAttributes.getFloat(index, this.f16530V);
                        break;
                    case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                        this.f16529U = typedArrayObtainStyledAttributes.getFloat(index, this.f16529U);
                        break;
                    case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                        this.f16531W = typedArrayObtainStyledAttributes.getInt(index, this.f16531W);
                        break;
                    case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                        this.f16532X = typedArrayObtainStyledAttributes.getInt(index, this.f16532X);
                        break;
                    case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                        b.m(this, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                        b.m(this, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i11) {
                            case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                                this.f16509A = b.l(typedArrayObtainStyledAttributes, index, this.f16509A);
                                break;
                            case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                                this.f16510B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f16510B);
                                break;
                            case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                                this.f16511C = typedArrayObtainStyledAttributes.getFloat(index, this.f16511C);
                                break;
                            default:
                                switch (i11) {
                                    case R.styleable.AppCompatTheme_editTextColor /* 69 */:
                                        this.f16544e0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case R.styleable.AppCompatTheme_editTextStyle /* 70 */:
                                        this.f16546f0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case R.styleable.AppCompatTheme_homeAsUpIndicator /* 71 */:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        break;
                                    case R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                                        this.f16548g0 = typedArrayObtainStyledAttributes.getInt(index, this.f16548g0);
                                        break;
                                    case R.styleable.AppCompatTheme_listChoiceBackgroundIndicator /* 73 */:
                                        this.f16550h0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f16550h0);
                                        break;
                                    case R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated /* 74 */:
                                        this.f16555k0 = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated /* 75 */:
                                        this.f16563o0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f16563o0);
                                        break;
                                    case R.styleable.AppCompatTheme_listDividerAlertDialog /* 76 */:
                                        this.f16565p0 = typedArrayObtainStyledAttributes.getInt(index, this.f16565p0);
                                        break;
                                    case R.styleable.AppCompatTheme_listMenuViewStyle /* 77 */:
                                        this.f16567r = b.l(typedArrayObtainStyledAttributes, index, this.f16567r);
                                        break;
                                    case R.styleable.AppCompatTheme_listPopupWindowStyle /* 78 */:
                                        this.f16568s = b.l(typedArrayObtainStyledAttributes, index, this.f16568s);
                                        break;
                                    case R.styleable.AppCompatTheme_listPreferredItemHeight /* 79 */:
                                        this.f16528T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f16528T);
                                        break;
                                    case R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                                        this.f16521M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f16521M);
                                        break;
                                    case R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
                                        this.f16533Y = typedArrayObtainStyledAttributes.getInt(index, this.f16533Y);
                                        break;
                                    case R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
                                        this.f16534Z = typedArrayObtainStyledAttributes.getInt(index, this.f16534Z);
                                        break;
                                    case R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 83 */:
                                        this.f16538b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f16538b0);
                                        break;
                                    case R.styleable.AppCompatTheme_listPreferredItemPaddingRight /* 84 */:
                                        this.f16536a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f16536a0);
                                        break;
                                    case 85:
                                        this.f16542d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f16542d0);
                                        break;
                                    case R.styleable.AppCompatTheme_panelBackground /* 86 */:
                                        this.f16540c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f16540c0);
                                        break;
                                    case R.styleable.AppCompatTheme_panelMenuListTheme /* 87 */:
                                        this.f16559m0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f16559m0);
                                        break;
                                    case R.styleable.AppCompatTheme_panelMenuListWidth /* 88 */:
                                        this.f16561n0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f16561n0);
                                        break;
                                    case R.styleable.AppCompatTheme_popupMenuStyle /* 89 */:
                                        this.f16557l0 = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case R.styleable.AppCompatTheme_popupWindowStyle /* 90 */:
                                        this.f16549h = typedArrayObtainStyledAttributes.getBoolean(index, this.f16549h);
                                        break;
                                    case R.styleable.AppCompatTheme_radioButtonStyle /* 91 */:
                                        Integer.toHexString(index);
                                        sparseIntArray.get(index);
                                        break;
                                    default:
                                        Integer.toHexString(index);
                                        sparseIntArray.get(index);
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: compiled from: ConstraintSet.java */
    public static class c {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final SparseIntArray f16576n;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f16577a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f16578b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f16579c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f16580d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f16581e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f16582f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f16583g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f16584h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f16585i;
        public int j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f16586k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f16587l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f16588m;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f16576n = sparseIntArray;
            sparseIntArray.append(3, 1);
            sparseIntArray.append(5, 2);
            sparseIntArray.append(9, 3);
            sparseIntArray.append(2, 4);
            sparseIntArray.append(1, 5);
            sparseIntArray.append(0, 6);
            sparseIntArray.append(4, 7);
            sparseIntArray.append(8, 8);
            sparseIntArray.append(7, 9);
            sparseIntArray.append(6, 10);
        }

        public final void a(c cVar) {
            this.f16577a = cVar.f16577a;
            this.f16578b = cVar.f16578b;
            this.f16580d = cVar.f16580d;
            this.f16581e = cVar.f16581e;
            this.f16582f = cVar.f16582f;
            this.f16584h = cVar.f16584h;
            this.f16583g = cVar.f16583g;
        }

        public final void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p139l0.d.f44133l);
            this.f16577a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                switch (f16576n.get(index)) {
                    case 1:
                        this.f16584h = typedArrayObtainStyledAttributes.getFloat(index, this.f16584h);
                        break;
                    case 2:
                        this.f16581e = typedArrayObtainStyledAttributes.getInt(index, this.f16581e);
                        break;
                    case 3:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            this.f16580d = typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            this.f16580d = p077g0.c.f35104c[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        }
                        break;
                    case 4:
                        this.f16582f = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f16578b = b.l(typedArrayObtainStyledAttributes, index, this.f16578b);
                        break;
                    case 6:
                        this.f16579c = typedArrayObtainStyledAttributes.getInteger(index, this.f16579c);
                        break;
                    case 7:
                        this.f16583g = typedArrayObtainStyledAttributes.getFloat(index, this.f16583g);
                        break;
                    case 8:
                        this.j = typedArrayObtainStyledAttributes.getInteger(index, this.j);
                        break;
                    case 9:
                        this.f16585i = typedArrayObtainStyledAttributes.getFloat(index, this.f16585i);
                        break;
                    case 10:
                        int i11 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i11 == 1) {
                            int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            this.f16588m = resourceId;
                            if (resourceId != -1) {
                                this.f16587l = -2;
                            }
                        } else if (i11 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            this.f16586k = string;
                            if (string.indexOf("/") > 0) {
                                this.f16588m = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                this.f16587l = -2;
                            } else {
                                this.f16587l = -1;
                            }
                        } else {
                            this.f16587l = typedArrayObtainStyledAttributes.getInteger(index, this.f16588m);
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: compiled from: ConstraintSet.java */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f16589a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f16590b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f16591c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f16592d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f16593e;

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p139l0.d.f44139r);
            this.f16589a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 1) {
                    this.f16592d = typedArrayObtainStyledAttributes.getFloat(index, this.f16592d);
                } else if (index == 0) {
                    int i11 = typedArrayObtainStyledAttributes.getInt(index, this.f16590b);
                    this.f16590b = i11;
                    this.f16590b = b.f16480h[i11];
                } else if (index == 4) {
                    this.f16591c = typedArrayObtainStyledAttributes.getInt(index, this.f16591c);
                } else if (index == 3) {
                    this.f16593e = typedArrayObtainStyledAttributes.getFloat(index, this.f16593e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: compiled from: ConstraintSet.java */
    public static class e {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final SparseIntArray f16594o;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f16595a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f16596b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f16597c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f16598d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f16599e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f16600f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f16601g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f16602h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f16603i;
        public float j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f16604k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f16605l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f16606m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public float f16607n;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f16594o = sparseIntArray;
            sparseIntArray.append(6, 1);
            sparseIntArray.append(7, 2);
            sparseIntArray.append(8, 3);
            sparseIntArray.append(4, 4);
            sparseIntArray.append(5, 5);
            sparseIntArray.append(0, 6);
            sparseIntArray.append(1, 7);
            sparseIntArray.append(2, 8);
            sparseIntArray.append(3, 9);
            sparseIntArray.append(9, 10);
            sparseIntArray.append(10, 11);
            sparseIntArray.append(11, 12);
        }

        public final void a(e eVar) {
            this.f16595a = eVar.f16595a;
            this.f16596b = eVar.f16596b;
            this.f16597c = eVar.f16597c;
            this.f16598d = eVar.f16598d;
            this.f16599e = eVar.f16599e;
            this.f16600f = eVar.f16600f;
            this.f16601g = eVar.f16601g;
            this.f16602h = eVar.f16602h;
            this.f16603i = eVar.f16603i;
            this.j = eVar.j;
            this.f16604k = eVar.f16604k;
            this.f16605l = eVar.f16605l;
            this.f16606m = eVar.f16606m;
            this.f16607n = eVar.f16607n;
        }

        public final void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p139l0.d.f44142u);
            this.f16595a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                switch (f16594o.get(index)) {
                    case 1:
                        this.f16596b = typedArrayObtainStyledAttributes.getFloat(index, this.f16596b);
                        break;
                    case 2:
                        this.f16597c = typedArrayObtainStyledAttributes.getFloat(index, this.f16597c);
                        break;
                    case 3:
                        this.f16598d = typedArrayObtainStyledAttributes.getFloat(index, this.f16598d);
                        break;
                    case 4:
                        this.f16599e = typedArrayObtainStyledAttributes.getFloat(index, this.f16599e);
                        break;
                    case 5:
                        this.f16600f = typedArrayObtainStyledAttributes.getFloat(index, this.f16600f);
                        break;
                    case 6:
                        this.f16601g = typedArrayObtainStyledAttributes.getDimension(index, this.f16601g);
                        break;
                    case 7:
                        this.f16602h = typedArrayObtainStyledAttributes.getDimension(index, this.f16602h);
                        break;
                    case 8:
                        this.j = typedArrayObtainStyledAttributes.getDimension(index, this.j);
                        break;
                    case 9:
                        this.f16604k = typedArrayObtainStyledAttributes.getDimension(index, this.f16604k);
                        break;
                    case 10:
                        this.f16605l = typedArrayObtainStyledAttributes.getDimension(index, this.f16605l);
                        break;
                    case 11:
                        this.f16606m = true;
                        this.f16607n = typedArrayObtainStyledAttributes.getDimension(index, this.f16607n);
                        break;
                    case 12:
                        this.f16603i = b.l(typedArrayObtainStyledAttributes, index, this.f16603i);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f16481i = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        j = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(R.styleable.AppCompatTheme_switchStyle, 6);
        sparseIntArray.append(R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(R.styleable.AppCompatTheme_textAppearancePopupMenuHeader, 13);
        sparseIntArray.append(R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu, 16);
        sparseIntArray.append(R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle, 14);
        sparseIntArray.append(R.styleable.AppCompatTheme_textAppearanceListItemSecondary, 11);
        sparseIntArray.append(R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(R.styleable.AppCompatTheme_windowFixedHeightMinor, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(R.styleable.AppCompatTheme_windowFixedWidthMajor, 67);
        sparseIntArray.append(R.styleable.AppCompatTheme_toolbarStyle, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(R.styleable.AppCompatTheme_textColorSearchUrl, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(R.styleable.AppCompatTheme_tooltipForegroundColor, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(R.styleable.AppCompatTheme_windowFixedWidthMinor, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(R.styleable.AppCompatTheme_viewInflaterClass, 82);
        sparseIntArray.append(R.styleable.AppCompatTheme_windowFixedHeightMajor, 83);
        sparseIntArray.append(R.styleable.AppCompatTheme_windowActionModeOverlay, 84);
        sparseIntArray.append(R.styleable.AppCompatTheme_windowActionBarOverlay, 85);
        sparseIntArray.append(R.styleable.AppCompatTheme_windowActionBar, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(R.styleable.AppCompatTheme_textAppearancePopupMenuHeader, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(R.styleable.AppCompatTheme_textAppearanceListItemSecondary, 83);
        sparseIntArray2.append(R.styleable.AppCompatTheme_textAppearanceListItem, 84);
        sparseIntArray2.append(R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, 85);
        sparseIntArray2.append(R.styleable.AppCompatTheme_switchStyle, 86);
        sparseIntArray2.append(94, 97);
    }

    public static a d(Context context, XmlResourceParser xmlResourceParser) {
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSetAsAttributeSet, p139l0.d.f44125c);
        o(aVar, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    public static int[] f(Barrier barrier, String str) {
        int iIntValue;
        String[] strArrSplit = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i10 = 0;
        int i11 = 0;
        while (i10 < strArrSplit.length) {
            String strTrim = strArrSplit[i10].trim();
            Integer num = null;
            try {
                iIntValue = p139l0.c.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) barrier.getParent();
                if (strTrim != null) {
                    HashMap<String, Integer> map = constraintLayout.f16392n;
                    if (map != null && map.containsKey(strTrim)) {
                        num = constraintLayout.f16392n.get(strTrim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (num != null && (num instanceof Integer)) {
                    iIntValue = num.intValue();
                }
            }
            iArr[i11] = iIntValue;
            i10++;
            i11++;
        }
        return i11 != strArrSplit.length ? Arrays.copyOf(iArr, i11) : iArr;
    }

    public static a g(Context context, AttributeSet attributeSet, boolean z10) {
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z10 ? p139l0.d.f44125c : p139l0.d.f44123a);
        if (z10) {
            o(aVar, typedArrayObtainStyledAttributes);
        } else {
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            int i10 = 0;
            while (true) {
                C0170b c0170b = aVar.f16493e;
                if (i10 < indexCount) {
                    int index = typedArrayObtainStyledAttributes.getIndex(i10);
                    d dVar = aVar.f16491c;
                    e eVar = aVar.f16494f;
                    c cVar = aVar.f16492d;
                    if (index != 1 && 23 != index && 24 != index) {
                        cVar.f16577a = true;
                        c0170b.f16537b = true;
                        dVar.f16589a = true;
                        eVar.f16595a = true;
                    }
                    SparseIntArray sparseIntArray = f16481i;
                    switch (sparseIntArray.get(index)) {
                        case 1:
                            c0170b.f16566q = l(typedArrayObtainStyledAttributes, index, c0170b.f16566q);
                            break;
                        case 2:
                            c0170b.f16518J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0170b.f16518J);
                            break;
                        case 3:
                            c0170b.f16564p = l(typedArrayObtainStyledAttributes, index, c0170b.f16564p);
                            break;
                        case 4:
                            c0170b.f16562o = l(typedArrayObtainStyledAttributes, index, c0170b.f16562o);
                            break;
                        case 5:
                            c0170b.f16575z = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            c0170b.f16512D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0170b.f16512D);
                            break;
                        case 7:
                            c0170b.f16513E = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0170b.f16513E);
                            break;
                        case 8:
                            c0170b.f16519K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0170b.f16519K);
                            break;
                        case 9:
                            c0170b.f16572w = l(typedArrayObtainStyledAttributes, index, c0170b.f16572w);
                            break;
                        case 10:
                            c0170b.f16571v = l(typedArrayObtainStyledAttributes, index, c0170b.f16571v);
                            break;
                        case 11:
                            c0170b.f16525Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0170b.f16525Q);
                            break;
                        case 12:
                            c0170b.f16526R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0170b.f16526R);
                            break;
                        case 13:
                            c0170b.f16522N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0170b.f16522N);
                            break;
                        case 14:
                            c0170b.f16524P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0170b.f16524P);
                            break;
                        case 15:
                            c0170b.f16527S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0170b.f16527S);
                            break;
                        case 16:
                            c0170b.f16523O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0170b.f16523O);
                            break;
                        case 17:
                            c0170b.f16543e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0170b.f16543e);
                            break;
                        case 18:
                            c0170b.f16545f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0170b.f16545f);
                            break;
                        case 19:
                            c0170b.f16547g = typedArrayObtainStyledAttributes.getFloat(index, c0170b.f16547g);
                            break;
                        case 20:
                            c0170b.f16573x = typedArrayObtainStyledAttributes.getFloat(index, c0170b.f16573x);
                            break;
                        case 21:
                            c0170b.f16541d = typedArrayObtainStyledAttributes.getLayoutDimension(index, c0170b.f16541d);
                            break;
                        case 22:
                            int i11 = typedArrayObtainStyledAttributes.getInt(index, dVar.f16590b);
                            dVar.f16590b = i11;
                            dVar.f16590b = f16480h[i11];
                            break;
                        case 23:
                            c0170b.f16539c = typedArrayObtainStyledAttributes.getLayoutDimension(index, c0170b.f16539c);
                            break;
                        case 24:
                            c0170b.f16515G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0170b.f16515G);
                            break;
                        case 25:
                            c0170b.f16551i = l(typedArrayObtainStyledAttributes, index, c0170b.f16551i);
                            break;
                        case 26:
                            c0170b.j = l(typedArrayObtainStyledAttributes, index, c0170b.j);
                            break;
                        case 27:
                            c0170b.f16514F = typedArrayObtainStyledAttributes.getInt(index, c0170b.f16514F);
                            break;
                        case 28:
                            c0170b.f16516H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0170b.f16516H);
                            break;
                        case 29:
                            c0170b.f16554k = l(typedArrayObtainStyledAttributes, index, c0170b.f16554k);
                            break;
                        case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                            c0170b.f16556l = l(typedArrayObtainStyledAttributes, index, c0170b.f16556l);
                            break;
                        case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                            c0170b.f16520L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0170b.f16520L);
                            break;
                        case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                            c0170b.f16569t = l(typedArrayObtainStyledAttributes, index, c0170b.f16569t);
                            break;
                        case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                            c0170b.f16570u = l(typedArrayObtainStyledAttributes, index, c0170b.f16570u);
                            break;
                        case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                            c0170b.f16517I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0170b.f16517I);
                            break;
                        case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                            c0170b.f16560n = l(typedArrayObtainStyledAttributes, index, c0170b.f16560n);
                            break;
                        case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                            c0170b.f16558m = l(typedArrayObtainStyledAttributes, index, c0170b.f16558m);
                            break;
                        case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                            c0170b.f16574y = typedArrayObtainStyledAttributes.getFloat(index, c0170b.f16574y);
                            break;
                        case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                            aVar.f16489a = typedArrayObtainStyledAttributes.getResourceId(index, aVar.f16489a);
                            break;
                        case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                            c0170b.f16530V = typedArrayObtainStyledAttributes.getFloat(index, c0170b.f16530V);
                            break;
                        case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                            c0170b.f16529U = typedArrayObtainStyledAttributes.getFloat(index, c0170b.f16529U);
                            break;
                        case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                            c0170b.f16531W = typedArrayObtainStyledAttributes.getInt(index, c0170b.f16531W);
                            break;
                        case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                            c0170b.f16532X = typedArrayObtainStyledAttributes.getInt(index, c0170b.f16532X);
                            break;
                        case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                            dVar.f16592d = typedArrayObtainStyledAttributes.getFloat(index, dVar.f16592d);
                            break;
                        case 44:
                            eVar.f16606m = true;
                            eVar.f16607n = typedArrayObtainStyledAttributes.getDimension(index, eVar.f16607n);
                            break;
                        case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                            eVar.f16597c = typedArrayObtainStyledAttributes.getFloat(index, eVar.f16597c);
                            break;
                        case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                            eVar.f16598d = typedArrayObtainStyledAttributes.getFloat(index, eVar.f16598d);
                            break;
                        case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                            eVar.f16599e = typedArrayObtainStyledAttributes.getFloat(index, eVar.f16599e);
                            break;
                        case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                            eVar.f16600f = typedArrayObtainStyledAttributes.getFloat(index, eVar.f16600f);
                            break;
                        case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                            eVar.f16601g = typedArrayObtainStyledAttributes.getDimension(index, eVar.f16601g);
                            break;
                        case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                            eVar.f16602h = typedArrayObtainStyledAttributes.getDimension(index, eVar.f16602h);
                            break;
                        case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                            eVar.j = typedArrayObtainStyledAttributes.getDimension(index, eVar.j);
                            break;
                        case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                            eVar.f16604k = typedArrayObtainStyledAttributes.getDimension(index, eVar.f16604k);
                            break;
                        case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                            eVar.f16605l = typedArrayObtainStyledAttributes.getDimension(index, eVar.f16605l);
                            break;
                        case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                            c0170b.f16533Y = typedArrayObtainStyledAttributes.getInt(index, c0170b.f16533Y);
                            break;
                        case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                            c0170b.f16534Z = typedArrayObtainStyledAttributes.getInt(index, c0170b.f16534Z);
                            break;
                        case R.styleable.AppCompatTheme_colorError /* 56 */:
                            c0170b.f16536a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0170b.f16536a0);
                            break;
                        case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                            c0170b.f16538b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0170b.f16538b0);
                            break;
                        case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                            c0170b.f16540c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0170b.f16540c0);
                            break;
                        case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                            c0170b.f16542d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0170b.f16542d0);
                            break;
                        case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                            eVar.f16596b = typedArrayObtainStyledAttributes.getFloat(index, eVar.f16596b);
                            break;
                        case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                            c0170b.f16509A = l(typedArrayObtainStyledAttributes, index, c0170b.f16509A);
                            break;
                        case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                            c0170b.f16510B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0170b.f16510B);
                            break;
                        case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                            c0170b.f16511C = typedArrayObtainStyledAttributes.getFloat(index, c0170b.f16511C);
                            break;
                        case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                            cVar.f16578b = l(typedArrayObtainStyledAttributes, index, cVar.f16578b);
                            break;
                        case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                            if (typedArrayObtainStyledAttributes.peekValue(index).type != 3) {
                                cVar.f16580d = p077g0.c.f35104c[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                            } else {
                                cVar.f16580d = typedArrayObtainStyledAttributes.getString(index);
                            }
                            break;
                        case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                            cVar.f16582f = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                            cVar.f16584h = typedArrayObtainStyledAttributes.getFloat(index, cVar.f16584h);
                            break;
                        case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                            dVar.f16593e = typedArrayObtainStyledAttributes.getFloat(index, dVar.f16593e);
                            break;
                        case R.styleable.AppCompatTheme_editTextColor /* 69 */:
                            c0170b.f16544e0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                            break;
                        case R.styleable.AppCompatTheme_editTextStyle /* 70 */:
                            c0170b.f16546f0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                            break;
                        case R.styleable.AppCompatTheme_homeAsUpIndicator /* 71 */:
                            Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                            break;
                        case R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                            c0170b.f16548g0 = typedArrayObtainStyledAttributes.getInt(index, c0170b.f16548g0);
                            break;
                        case R.styleable.AppCompatTheme_listChoiceBackgroundIndicator /* 73 */:
                            c0170b.f16550h0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0170b.f16550h0);
                            break;
                        case R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated /* 74 */:
                            c0170b.f16555k0 = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated /* 75 */:
                            c0170b.f16563o0 = typedArrayObtainStyledAttributes.getBoolean(index, c0170b.f16563o0);
                            break;
                        case R.styleable.AppCompatTheme_listDividerAlertDialog /* 76 */:
                            cVar.f16581e = typedArrayObtainStyledAttributes.getInt(index, cVar.f16581e);
                            break;
                        case R.styleable.AppCompatTheme_listMenuViewStyle /* 77 */:
                            c0170b.f16557l0 = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case R.styleable.AppCompatTheme_listPopupWindowStyle /* 78 */:
                            dVar.f16591c = typedArrayObtainStyledAttributes.getInt(index, dVar.f16591c);
                            break;
                        case R.styleable.AppCompatTheme_listPreferredItemHeight /* 79 */:
                            cVar.f16583g = typedArrayObtainStyledAttributes.getFloat(index, cVar.f16583g);
                            break;
                        case R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                            c0170b.f16559m0 = typedArrayObtainStyledAttributes.getBoolean(index, c0170b.f16559m0);
                            break;
                        case R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
                            c0170b.f16561n0 = typedArrayObtainStyledAttributes.getBoolean(index, c0170b.f16561n0);
                            break;
                        case R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
                            cVar.f16579c = typedArrayObtainStyledAttributes.getInteger(index, cVar.f16579c);
                            break;
                        case R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 83 */:
                            eVar.f16603i = l(typedArrayObtainStyledAttributes, index, eVar.f16603i);
                            break;
                        case R.styleable.AppCompatTheme_listPreferredItemPaddingRight /* 84 */:
                            cVar.j = typedArrayObtainStyledAttributes.getInteger(index, cVar.j);
                            break;
                        case 85:
                            cVar.f16585i = typedArrayObtainStyledAttributes.getFloat(index, cVar.f16585i);
                            break;
                        case R.styleable.AppCompatTheme_panelBackground /* 86 */:
                            int i12 = typedArrayObtainStyledAttributes.peekValue(index).type;
                            if (i12 == 1) {
                                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                cVar.f16588m = resourceId;
                                if (resourceId != -1) {
                                    cVar.f16587l = -2;
                                }
                            } else if (i12 != 3) {
                                cVar.f16587l = typedArrayObtainStyledAttributes.getInteger(index, cVar.f16588m);
                            } else {
                                String string = typedArrayObtainStyledAttributes.getString(index);
                                cVar.f16586k = string;
                                if (string.indexOf("/") <= 0) {
                                    cVar.f16587l = -1;
                                } else {
                                    cVar.f16588m = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                    cVar.f16587l = -2;
                                }
                            }
                            break;
                        case R.styleable.AppCompatTheme_panelMenuListTheme /* 87 */:
                            Integer.toHexString(index);
                            sparseIntArray.get(index);
                            break;
                        case R.styleable.AppCompatTheme_panelMenuListWidth /* 88 */:
                        case R.styleable.AppCompatTheme_popupMenuStyle /* 89 */:
                        case R.styleable.AppCompatTheme_popupWindowStyle /* 90 */:
                        default:
                            Integer.toHexString(index);
                            sparseIntArray.get(index);
                            break;
                        case R.styleable.AppCompatTheme_radioButtonStyle /* 91 */:
                            c0170b.f16567r = l(typedArrayObtainStyledAttributes, index, c0170b.f16567r);
                            break;
                        case R.styleable.AppCompatTheme_ratingBarStyle /* 92 */:
                            c0170b.f16568s = l(typedArrayObtainStyledAttributes, index, c0170b.f16568s);
                            break;
                        case R.styleable.AppCompatTheme_ratingBarStyleIndicator /* 93 */:
                            c0170b.f16521M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0170b.f16521M);
                            break;
                        case R.styleable.AppCompatTheme_ratingBarStyleSmall /* 94 */:
                            c0170b.f16528T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0170b.f16528T);
                            break;
                        case R.styleable.AppCompatTheme_searchViewStyle /* 95 */:
                            m(c0170b, typedArrayObtainStyledAttributes, index, 0);
                            break;
                        case R.styleable.AppCompatTheme_seekBarStyle /* 96 */:
                            m(c0170b, typedArrayObtainStyledAttributes, index, 1);
                            break;
                        case R.styleable.AppCompatTheme_selectableItemBackground /* 97 */:
                            c0170b.f16565p0 = typedArrayObtainStyledAttributes.getInt(index, c0170b.f16565p0);
                            break;
                    }
                    i10++;
                } else if (c0170b.f16555k0 != null) {
                    c0170b.f16553j0 = null;
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    public static int l(TypedArray typedArray, int i10, int i11) {
        int resourceId = typedArray.getResourceId(i10, i11);
        return resourceId == -1 ? typedArray.getInt(i10, -1) : resourceId;
    }

    /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0035  */
    /* JADX WARN: Code duplicated, block: B:22:0x0039  */
    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0043  */
    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:28:0x004b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0066  */
    public static void m(Object obj, TypedArray typedArray, int i10, int i11) {
        int dimensionPixelSize;
        a.C0169a c0169a;
        C0170b c0170b;
        ConstraintLayout.a aVar;
        if (obj == null) {
            return;
        }
        int i12 = typedArray.peekValue(i10).type;
        boolean z10 = true;
        int i13 = 0;
        if (i12 != 3) {
            if (i12 != 5) {
                dimensionPixelSize = typedArray.getInt(i10, 0);
                if (dimensionPixelSize == -4) {
                    i13 = -2;
                } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                    z10 = false;
                }
                if (obj instanceof ConstraintLayout.a) {
                    aVar = (ConstraintLayout.a) obj;
                    if (i11 == 0) {
                        ((ViewGroup.MarginLayoutParams) aVar).width = i13;
                        aVar.f16417W = z10;
                        return;
                    } else {
                        ((ViewGroup.MarginLayoutParams) aVar).height = i13;
                        aVar.f16418X = z10;
                        return;
                    }
                }
                if (obj instanceof C0170b) {
                    c0170b = (C0170b) obj;
                    if (i11 == 0) {
                        c0170b.f16539c = i13;
                        c0170b.f16559m0 = z10;
                        return;
                    } else {
                        c0170b.f16541d = i13;
                        c0170b.f16561n0 = z10;
                        return;
                    }
                }
                if (obj instanceof a.C0169a) {
                    c0169a = (a.C0169a) obj;
                    if (i11 == 0) {
                        c0169a.b(23, i13);
                        c0169a.d(80, z10);
                        return;
                    } else {
                        c0169a.b(21, i13);
                        c0169a.d(81, z10);
                        return;
                    }
                }
                return;
            }
            dimensionPixelSize = typedArray.getDimensionPixelSize(i10, 0);
            z10 = false;
            i13 = dimensionPixelSize;
            if (obj instanceof ConstraintLayout.a) {
                aVar = (ConstraintLayout.a) obj;
                if (i11 == 0) {
                    ((ViewGroup.MarginLayoutParams) aVar).width = i13;
                    aVar.f16417W = z10;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) aVar).height = i13;
                    aVar.f16418X = z10;
                    return;
                }
            }
            if (obj instanceof C0170b) {
                c0170b = (C0170b) obj;
                if (i11 == 0) {
                    c0170b.f16539c = i13;
                    c0170b.f16559m0 = z10;
                    return;
                } else {
                    c0170b.f16541d = i13;
                    c0170b.f16561n0 = z10;
                    return;
                }
            }
            if (obj instanceof a.C0169a) {
                c0169a = (a.C0169a) obj;
                if (i11 == 0) {
                    c0169a.b(23, i13);
                    c0169a.d(80, z10);
                    return;
                } else {
                    c0169a.b(21, i13);
                    c0169a.d(81, z10);
                    return;
                }
            }
            return;
        }
        String string = typedArray.getString(i10);
        if (string == null) {
            return;
        }
        int iIndexOf = string.indexOf(61);
        int length = string.length();
        if (iIndexOf <= 0 || iIndexOf >= length - 1) {
            return;
        }
        String strSubstring = string.substring(0, iIndexOf);
        String strSubstring2 = string.substring(iIndexOf + 1);
        if (strSubstring2.length() > 0) {
            String strTrim = strSubstring.trim();
            String strTrim2 = strSubstring2.trim();
            if ("ratio".equalsIgnoreCase(strTrim)) {
                if (obj instanceof ConstraintLayout.a) {
                    ConstraintLayout.a aVar2 = (ConstraintLayout.a) obj;
                    if (i11 == 0) {
                        ((ViewGroup.MarginLayoutParams) aVar2).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) aVar2).height = 0;
                    }
                    n(aVar2, strTrim2);
                    return;
                }
                if (obj instanceof C0170b) {
                    ((C0170b) obj).f16575z = strTrim2;
                    return;
                } else {
                    if (obj instanceof a.C0169a) {
                        ((a.C0169a) obj).c(5, strTrim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(strTrim)) {
                    float f10 = Float.parseFloat(strTrim2);
                    if (obj instanceof ConstraintLayout.a) {
                        ConstraintLayout.a aVar3 = (ConstraintLayout.a) obj;
                        if (i11 == 0) {
                            ((ViewGroup.MarginLayoutParams) aVar3).width = 0;
                            aVar3.f16402H = f10;
                        } else {
                            ((ViewGroup.MarginLayoutParams) aVar3).height = 0;
                            aVar3.f16403I = f10;
                        }
                    } else if (obj instanceof C0170b) {
                        C0170b c0170b2 = (C0170b) obj;
                        if (i11 == 0) {
                            c0170b2.f16539c = 0;
                            c0170b2.f16530V = f10;
                        } else {
                            c0170b2.f16541d = 0;
                            c0170b2.f16529U = f10;
                        }
                    } else if (obj instanceof a.C0169a) {
                        a.C0169a c0169a2 = (a.C0169a) obj;
                        if (i11 == 0) {
                            c0169a2.b(23, 0);
                            c0169a2.a(f10, 39);
                        } else {
                            c0169a2.b(21, 0);
                            c0169a2.a(f10, 40);
                        }
                    }
                } else {
                    if (!"parent".equalsIgnoreCase(strTrim)) {
                        return;
                    }
                    float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                    if (obj instanceof ConstraintLayout.a) {
                        ConstraintLayout.a aVar4 = (ConstraintLayout.a) obj;
                        if (i11 == 0) {
                            ((ViewGroup.MarginLayoutParams) aVar4).width = 0;
                            aVar4.f16412R = fMax;
                            aVar4.f16406L = 2;
                        } else {
                            ((ViewGroup.MarginLayoutParams) aVar4).height = 0;
                            aVar4.f16413S = fMax;
                            aVar4.f16407M = 2;
                        }
                    } else if (obj instanceof C0170b) {
                        C0170b c0170b3 = (C0170b) obj;
                        if (i11 == 0) {
                            c0170b3.f16539c = 0;
                            c0170b3.f16544e0 = fMax;
                            c0170b3.f16533Y = 2;
                        } else {
                            c0170b3.f16541d = 0;
                            c0170b3.f16546f0 = fMax;
                            c0170b3.f16534Z = 2;
                        }
                    } else if (obj instanceof a.C0169a) {
                        a.C0169a c0169a3 = (a.C0169a) obj;
                        if (i11 == 0) {
                            c0169a3.b(23, 0);
                            c0169a3.b(54, 2);
                        } else {
                            c0169a3.b(21, 0);
                            c0169a3.b(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    public static void n(ConstraintLayout.a aVar, String str) {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            byte b10 = -1;
            int i10 = 0;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (strSubstring.equalsIgnoreCase("W")) {
                    b10 = 0;
                } else if (strSubstring.equalsIgnoreCase("H")) {
                    b10 = 1;
                }
                i10 = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i10);
                    if (strSubstring2.length() > 0) {
                        Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i10, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f10 = Float.parseFloat(strSubstring3);
                        float f11 = Float.parseFloat(strSubstring4);
                        if (f10 > 0.0f && f11 > 0.0f) {
                            if (b10 == 1) {
                                Math.abs(f11 / f10);
                            } else {
                                Math.abs(f10 / f11);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        aVar.f16401G = str;
    }

    public static void o(a aVar, TypedArray typedArray) {
        int i10;
        int indexCount = typedArray.getIndexCount();
        a.C0169a c0169a = new a.C0169a();
        aVar.f16496h = c0169a;
        c cVar = aVar.f16492d;
        int i11 = 0;
        cVar.f16577a = false;
        C0170b c0170b = aVar.f16493e;
        c0170b.f16537b = false;
        d dVar = aVar.f16491c;
        dVar.f16589a = false;
        e eVar = aVar.f16494f;
        eVar.f16595a = false;
        int i12 = 0;
        while (i12 < indexCount) {
            int index = typedArray.getIndex(i12);
            int i13 = j.get(index);
            SparseIntArray sparseIntArray = f16481i;
            switch (i13) {
                case 2:
                    i10 = i11;
                    c0169a.b(2, typedArray.getDimensionPixelSize(index, c0170b.f16518J));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                case R.styleable.AppCompatTheme_panelMenuListWidth /* 88 */:
                case R.styleable.AppCompatTheme_popupMenuStyle /* 89 */:
                case R.styleable.AppCompatTheme_popupWindowStyle /* 90 */:
                case R.styleable.AppCompatTheme_radioButtonStyle /* 91 */:
                case R.styleable.AppCompatTheme_ratingBarStyle /* 92 */:
                default:
                    Integer.toHexString(index);
                    sparseIntArray.get(index);
                    i10 = i11;
                    break;
                case 5:
                    i10 = i11;
                    c0169a.c(5, typedArray.getString(index));
                    break;
                case 6:
                    i10 = i11;
                    c0169a.b(6, typedArray.getDimensionPixelOffset(index, c0170b.f16512D));
                    break;
                case 7:
                    i10 = i11;
                    c0169a.b(7, typedArray.getDimensionPixelOffset(index, c0170b.f16513E));
                    break;
                case 8:
                    i10 = i11;
                    c0169a.b(8, typedArray.getDimensionPixelSize(index, c0170b.f16519K));
                    break;
                case 11:
                    i10 = i11;
                    c0169a.b(11, typedArray.getDimensionPixelSize(index, c0170b.f16525Q));
                    break;
                case 12:
                    i10 = i11;
                    c0169a.b(12, typedArray.getDimensionPixelSize(index, c0170b.f16526R));
                    break;
                case 13:
                    i10 = i11;
                    c0169a.b(13, typedArray.getDimensionPixelSize(index, c0170b.f16522N));
                    break;
                case 14:
                    i10 = i11;
                    c0169a.b(14, typedArray.getDimensionPixelSize(index, c0170b.f16524P));
                    break;
                case 15:
                    i10 = i11;
                    c0169a.b(15, typedArray.getDimensionPixelSize(index, c0170b.f16527S));
                    break;
                case 16:
                    i10 = i11;
                    c0169a.b(16, typedArray.getDimensionPixelSize(index, c0170b.f16523O));
                    break;
                case 17:
                    i10 = i11;
                    c0169a.b(17, typedArray.getDimensionPixelOffset(index, c0170b.f16543e));
                    break;
                case 18:
                    i10 = i11;
                    c0169a.b(18, typedArray.getDimensionPixelOffset(index, c0170b.f16545f));
                    break;
                case 19:
                    i10 = i11;
                    c0169a.a(typedArray.getFloat(index, c0170b.f16547g), 19);
                    break;
                case 20:
                    i10 = i11;
                    c0169a.a(typedArray.getFloat(index, c0170b.f16573x), 20);
                    break;
                case 21:
                    i10 = i11;
                    c0169a.b(21, typedArray.getLayoutDimension(index, c0170b.f16541d));
                    break;
                case 22:
                    i10 = i11;
                    c0169a.b(22, f16480h[typedArray.getInt(index, dVar.f16590b)]);
                    break;
                case 23:
                    i10 = i11;
                    c0169a.b(23, typedArray.getLayoutDimension(index, c0170b.f16539c));
                    break;
                case 24:
                    i10 = i11;
                    c0169a.b(24, typedArray.getDimensionPixelSize(index, c0170b.f16515G));
                    break;
                case 27:
                    i10 = i11;
                    c0169a.b(27, typedArray.getInt(index, c0170b.f16514F));
                    break;
                case 28:
                    i10 = i11;
                    c0169a.b(28, typedArray.getDimensionPixelSize(index, c0170b.f16516H));
                    break;
                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                    i10 = i11;
                    c0169a.b(31, typedArray.getDimensionPixelSize(index, c0170b.f16520L));
                    break;
                case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                    i10 = i11;
                    c0169a.b(34, typedArray.getDimensionPixelSize(index, c0170b.f16517I));
                    break;
                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                    i10 = i11;
                    c0169a.a(typedArray.getFloat(index, c0170b.f16574y), 37);
                    break;
                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                    i10 = i11;
                    int resourceId = typedArray.getResourceId(index, aVar.f16489a);
                    aVar.f16489a = resourceId;
                    c0169a.b(38, resourceId);
                    break;
                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                    i10 = i11;
                    c0169a.a(typedArray.getFloat(index, c0170b.f16530V), 39);
                    break;
                case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                    i10 = i11;
                    c0169a.a(typedArray.getFloat(index, c0170b.f16529U), 40);
                    break;
                case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                    i10 = i11;
                    c0169a.b(41, typedArray.getInt(index, c0170b.f16531W));
                    break;
                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                    i10 = i11;
                    c0169a.b(42, typedArray.getInt(index, c0170b.f16532X));
                    break;
                case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                    i10 = i11;
                    c0169a.a(typedArray.getFloat(index, dVar.f16592d), 43);
                    break;
                case 44:
                    i10 = i11;
                    c0169a.d(44, true);
                    c0169a.a(typedArray.getDimension(index, eVar.f16607n), 44);
                    break;
                case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                    i10 = i11;
                    c0169a.a(typedArray.getFloat(index, eVar.f16597c), 45);
                    break;
                case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                    i10 = i11;
                    c0169a.a(typedArray.getFloat(index, eVar.f16598d), 46);
                    break;
                case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                    i10 = i11;
                    c0169a.a(typedArray.getFloat(index, eVar.f16599e), 47);
                    break;
                case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                    i10 = i11;
                    c0169a.a(typedArray.getFloat(index, eVar.f16600f), 48);
                    break;
                case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    i10 = i11;
                    c0169a.a(typedArray.getDimension(index, eVar.f16601g), 49);
                    break;
                case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                    i10 = i11;
                    c0169a.a(typedArray.getDimension(index, eVar.f16602h), 50);
                    break;
                case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                    i10 = i11;
                    c0169a.a(typedArray.getDimension(index, eVar.j), 51);
                    break;
                case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                    i10 = i11;
                    c0169a.a(typedArray.getDimension(index, eVar.f16604k), 52);
                    break;
                case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                    i10 = i11;
                    c0169a.a(typedArray.getDimension(index, eVar.f16605l), 53);
                    break;
                case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                    i10 = i11;
                    c0169a.b(54, typedArray.getInt(index, c0170b.f16533Y));
                    break;
                case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                    i10 = i11;
                    c0169a.b(55, typedArray.getInt(index, c0170b.f16534Z));
                    break;
                case R.styleable.AppCompatTheme_colorError /* 56 */:
                    i10 = i11;
                    c0169a.b(56, typedArray.getDimensionPixelSize(index, c0170b.f16536a0));
                    break;
                case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                    i10 = i11;
                    c0169a.b(57, typedArray.getDimensionPixelSize(index, c0170b.f16538b0));
                    break;
                case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                    i10 = i11;
                    c0169a.b(58, typedArray.getDimensionPixelSize(index, c0170b.f16540c0));
                    break;
                case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                    i10 = i11;
                    c0169a.b(59, typedArray.getDimensionPixelSize(index, c0170b.f16542d0));
                    break;
                case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                    i10 = i11;
                    c0169a.a(typedArray.getFloat(index, eVar.f16596b), 60);
                    break;
                case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                    i10 = i11;
                    c0169a.b(62, typedArray.getDimensionPixelSize(index, c0170b.f16510B));
                    break;
                case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                    i10 = i11;
                    c0169a.a(typedArray.getFloat(index, c0170b.f16511C), 63);
                    break;
                case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                    i10 = i11;
                    c0169a.b(64, l(typedArray, index, cVar.f16578b));
                    break;
                case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                    i10 = i11;
                    if (typedArray.peekValue(index).type != 3) {
                        c0169a.c(65, p077g0.c.f35104c[typedArray.getInteger(index, i10)]);
                    } else {
                        c0169a.c(65, typedArray.getString(index));
                    }
                    break;
                case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                    i10 = 0;
                    c0169a.b(66, typedArray.getInt(index, 0));
                    break;
                case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    c0169a.a(typedArray.getFloat(index, cVar.f16584h), 67);
                    i10 = 0;
                    break;
                case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    c0169a.a(typedArray.getFloat(index, dVar.f16593e), 68);
                    i10 = 0;
                    break;
                case R.styleable.AppCompatTheme_editTextColor /* 69 */:
                    c0169a.a(typedArray.getFloat(index, 1.0f), 69);
                    i10 = 0;
                    break;
                case R.styleable.AppCompatTheme_editTextStyle /* 70 */:
                    c0169a.a(typedArray.getFloat(index, 1.0f), 70);
                    i10 = 0;
                    break;
                case R.styleable.AppCompatTheme_homeAsUpIndicator /* 71 */:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    i10 = 0;
                    break;
                case R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                    c0169a.b(72, typedArray.getInt(index, c0170b.f16548g0));
                    i10 = 0;
                    break;
                case R.styleable.AppCompatTheme_listChoiceBackgroundIndicator /* 73 */:
                    c0169a.b(73, typedArray.getDimensionPixelSize(index, c0170b.f16550h0));
                    i10 = 0;
                    break;
                case R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated /* 74 */:
                    c0169a.c(74, typedArray.getString(index));
                    i10 = 0;
                    break;
                case R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated /* 75 */:
                    c0169a.d(75, typedArray.getBoolean(index, c0170b.f16563o0));
                    i10 = 0;
                    break;
                case R.styleable.AppCompatTheme_listDividerAlertDialog /* 76 */:
                    c0169a.b(76, typedArray.getInt(index, cVar.f16581e));
                    i10 = 0;
                    break;
                case R.styleable.AppCompatTheme_listMenuViewStyle /* 77 */:
                    c0169a.c(77, typedArray.getString(index));
                    i10 = 0;
                    break;
                case R.styleable.AppCompatTheme_listPopupWindowStyle /* 78 */:
                    c0169a.b(78, typedArray.getInt(index, dVar.f16591c));
                    i10 = 0;
                    break;
                case R.styleable.AppCompatTheme_listPreferredItemHeight /* 79 */:
                    c0169a.a(typedArray.getFloat(index, cVar.f16583g), 79);
                    i10 = 0;
                    break;
                case R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                    c0169a.d(80, typedArray.getBoolean(index, c0170b.f16559m0));
                    i10 = 0;
                    break;
                case R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
                    c0169a.d(81, typedArray.getBoolean(index, c0170b.f16561n0));
                    i10 = 0;
                    break;
                case R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
                    c0169a.b(82, typedArray.getInteger(index, cVar.f16579c));
                    i10 = 0;
                    break;
                case R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 83 */:
                    c0169a.b(83, l(typedArray, index, eVar.f16603i));
                    i10 = 0;
                    break;
                case R.styleable.AppCompatTheme_listPreferredItemPaddingRight /* 84 */:
                    c0169a.b(84, typedArray.getInteger(index, cVar.j));
                    i10 = 0;
                    break;
                case 85:
                    c0169a.a(typedArray.getFloat(index, cVar.f16585i), 85);
                    i10 = 0;
                    break;
                case R.styleable.AppCompatTheme_panelBackground /* 86 */:
                    int i14 = typedArray.peekValue(index).type;
                    if (i14 == 1) {
                        int resourceId2 = typedArray.getResourceId(index, -1);
                        cVar.f16588m = resourceId2;
                        c0169a.b(89, resourceId2);
                        if (cVar.f16588m != -1) {
                            cVar.f16587l = -2;
                            c0169a.b(88, -2);
                        }
                    } else if (i14 == 3) {
                        String string = typedArray.getString(index);
                        cVar.f16586k = string;
                        c0169a.c(90, string);
                        if (cVar.f16586k.indexOf("/") > 0) {
                            int resourceId3 = typedArray.getResourceId(index, -1);
                            cVar.f16588m = resourceId3;
                            c0169a.b(89, resourceId3);
                            cVar.f16587l = -2;
                            c0169a.b(88, -2);
                        } else {
                            cVar.f16587l = -1;
                            c0169a.b(88, -1);
                        }
                    } else {
                        int integer = typedArray.getInteger(index, cVar.f16588m);
                        cVar.f16587l = integer;
                        c0169a.b(88, integer);
                    }
                    i10 = 0;
                    break;
                case R.styleable.AppCompatTheme_panelMenuListTheme /* 87 */:
                    Integer.toHexString(index);
                    sparseIntArray.get(index);
                    i10 = i11;
                    break;
                case R.styleable.AppCompatTheme_ratingBarStyleIndicator /* 93 */:
                    c0169a.b(93, typedArray.getDimensionPixelSize(index, c0170b.f16521M));
                    i10 = i11;
                    break;
                case R.styleable.AppCompatTheme_ratingBarStyleSmall /* 94 */:
                    c0169a.b(94, typedArray.getDimensionPixelSize(index, c0170b.f16528T));
                    i10 = i11;
                    break;
                case R.styleable.AppCompatTheme_searchViewStyle /* 95 */:
                    m(c0169a, typedArray, index, i11);
                    i10 = i11;
                    break;
                case R.styleable.AppCompatTheme_seekBarStyle /* 96 */:
                    m(c0169a, typedArray, index, 1);
                    i10 = i11;
                    break;
                case R.styleable.AppCompatTheme_selectableItemBackground /* 97 */:
                    c0169a.b(97, typedArray.getInt(index, c0170b.f16565p0));
                    i10 = i11;
                    break;
                case R.styleable.AppCompatTheme_selectableItemBackgroundBorderless /* 98 */:
                    if (MotionLayout.f16153U0) {
                        int resourceId4 = typedArray.getResourceId(index, aVar.f16489a);
                        aVar.f16489a = resourceId4;
                        if (resourceId4 == -1) {
                            aVar.f16490b = typedArray.getString(index);
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        aVar.f16490b = typedArray.getString(index);
                    } else {
                        aVar.f16489a = typedArray.getResourceId(index, aVar.f16489a);
                    }
                    i10 = i11;
                    break;
                case R.styleable.AppCompatTheme_spinnerDropDownItemStyle /* 99 */:
                    c0169a.d(99, typedArray.getBoolean(index, c0170b.f16549h));
                    i10 = i11;
                    break;
            }
            i12++;
            i11 = i10;
        }
    }

    public final void a(MotionLayout motionLayout) {
        a aVar;
        int childCount = motionLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = motionLayout.getChildAt(i10);
            int id = childAt.getId();
            HashMap<Integer, a> map = this.f16488g;
            if (!map.containsKey(Integer.valueOf(id))) {
                p126k0.a.d(childAt);
            } else {
                if (this.f16487f && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (map.containsKey(Integer.valueOf(id)) && (aVar = map.get(Integer.valueOf(id))) != null) {
                    ConstraintAttribute.e(childAt, aVar.f16495g);
                }
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        c(constraintLayout);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public final void c(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashMap<Integer, a> map = this.f16488g;
        HashSet<Integer> hashSet = new HashSet(map.keySet());
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            int id = childAt.getId();
            if (!map.containsKey(Integer.valueOf(id))) {
                p126k0.a.d(childAt);
            } else {
                if (this.f16487f && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1 && map.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    a aVar = map.get(Integer.valueOf(id));
                    if (aVar != null) {
                        if (childAt instanceof Barrier) {
                            C0170b c0170b = aVar.f16493e;
                            c0170b.f16552i0 = 1;
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id);
                            barrier.setType(c0170b.f16548g0);
                            barrier.setMargin(c0170b.f16550h0);
                            barrier.setAllowsGoneWidget(c0170b.f16563o0);
                            int[] iArr = c0170b.f16553j0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = c0170b.f16555k0;
                                if (str != null) {
                                    int[] iArrF = f(barrier, str);
                                    c0170b.f16553j0 = iArrF;
                                    barrier.setReferencedIds(iArrF);
                                }
                            }
                        }
                        ConstraintLayout.a aVar2 = (ConstraintLayout.a) childAt.getLayoutParams();
                        aVar2.a();
                        aVar.a(aVar2);
                        ConstraintAttribute.e(childAt, aVar.f16495g);
                        childAt.setLayoutParams(aVar2);
                        d dVar = aVar.f16491c;
                        if (dVar.f16591c == 0) {
                            childAt.setVisibility(dVar.f16590b);
                        }
                        childAt.setAlpha(dVar.f16592d);
                        e eVar = aVar.f16494f;
                        childAt.setRotation(eVar.f16596b);
                        childAt.setRotationX(eVar.f16597c);
                        childAt.setRotationY(eVar.f16598d);
                        childAt.setScaleX(eVar.f16599e);
                        childAt.setScaleY(eVar.f16600f);
                        if (eVar.f16603i != -1) {
                            View viewFindViewById = ((View) childAt.getParent()).findViewById(eVar.f16603i);
                            if (viewFindViewById != null) {
                                float bottom = (viewFindViewById.getBottom() + viewFindViewById.getTop()) / 2.0f;
                                float right = (viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    float left = right - childAt.getLeft();
                                    float top = bottom - childAt.getTop();
                                    childAt.setPivotX(left);
                                    childAt.setPivotY(top);
                                }
                            }
                        } else {
                            if (!Float.isNaN(eVar.f16601g)) {
                                childAt.setPivotX(eVar.f16601g);
                            }
                            if (!Float.isNaN(eVar.f16602h)) {
                                childAt.setPivotY(eVar.f16602h);
                            }
                        }
                        childAt.setTranslationX(eVar.j);
                        childAt.setTranslationY(eVar.f16604k);
                        childAt.setTranslationZ(eVar.f16605l);
                        if (eVar.f16606m) {
                            childAt.setElevation(eVar.f16607n);
                        }
                    }
                }
            }
        }
        for (Integer num : hashSet) {
            a aVar3 = map.get(num);
            if (aVar3 != null) {
                C0170b c0170b2 = aVar3.f16493e;
                if (c0170b2.f16552i0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = c0170b2.f16553j0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = c0170b2.f16555k0;
                        if (str2 != null) {
                            int[] iArrF2 = f(barrier2, str2);
                            c0170b2.f16553j0 = iArrF2;
                            barrier2.setReferencedIds(iArrF2);
                        }
                    }
                    barrier2.setType(c0170b2.f16548g0);
                    barrier2.setMargin(c0170b2.f16550h0);
                    p139l0.e eVar2 = ConstraintLayout.f16380q;
                    ConstraintLayout.a aVar4 = new ConstraintLayout.a();
                    barrier2.k();
                    aVar3.a(aVar4);
                    constraintLayout.addView(barrier2, aVar4);
                }
                if (c0170b2.f16535a) {
                    View dVar2 = new androidx.constraintlayout.widget.d(constraintLayout.getContext());
                    dVar2.setId(num.intValue());
                    p139l0.e eVar3 = ConstraintLayout.f16380q;
                    ConstraintLayout.a aVar5 = new ConstraintLayout.a();
                    aVar3.a(aVar5);
                    constraintLayout.addView(dVar2, aVar5);
                }
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = constraintLayout.getChildAt(i11);
            if (childAt2 instanceof androidx.constraintlayout.widget.a) {
                ((androidx.constraintlayout.widget.a) childAt2).e(constraintLayout);
            }
        }
    }

    public final void e(ConstraintLayout constraintLayout) {
        int i10;
        HashMap<Integer, a> map;
        HashMap<Integer, a> map2;
        b bVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap<Integer, a> map3 = bVar.f16488g;
        map3.clear();
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = constraintLayout.getChildAt(i11);
            ConstraintLayout.a aVar = (ConstraintLayout.a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (bVar.f16487f && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map3.containsKey(Integer.valueOf(id))) {
                map3.put(Integer.valueOf(id), new a());
            }
            a aVar2 = map3.get(Integer.valueOf(id));
            if (aVar2 == null) {
                i10 = childCount;
                map = map3;
            } else {
                HashMap<String, ConstraintAttribute> map4 = bVar.f16486e;
                HashMap<String, ConstraintAttribute> map5 = new HashMap<>();
                Class<?> cls = childAt.getClass();
                for (String str : map4.keySet()) {
                    ConstraintAttribute constraintAttribute = map4.get(str);
                    int i12 = childCount;
                    try {
                        if (str.equals("BackgroundColor")) {
                            map2 = map3;
                            try {
                                map5.put(str, new ConstraintAttribute(constraintAttribute, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                            } catch (IllegalAccessException e10) {
                                e = e10;
                                StringBuilder sbA = g.a(" Custom Attribute \"", str, "\" not found on ");
                                sbA.append(cls.getName());
                                Log.e("TransitionLayout", sbA.toString(), e);
                            } catch (NoSuchMethodException e11) {
                                e = e11;
                                Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e);
                            } catch (InvocationTargetException e12) {
                                e = e12;
                                StringBuilder sbA2 = g.a(" Custom Attribute \"", str, "\" not found on ");
                                sbA2.append(cls.getName());
                                Log.e("TransitionLayout", sbA2.toString(), e);
                            }
                        } else {
                            map2 = map3;
                            map5.put(str, new ConstraintAttribute(constraintAttribute, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e13) {
                        e = e13;
                        map2 = map3;
                    } catch (NoSuchMethodException e14) {
                        e = e14;
                        map2 = map3;
                    } catch (InvocationTargetException e15) {
                        e = e15;
                        map2 = map3;
                    }
                    childCount = i12;
                    map3 = map2;
                }
                i10 = childCount;
                map = map3;
                aVar2.f16495g = map5;
                aVar2.c(id, aVar);
                int visibility = childAt.getVisibility();
                d dVar = aVar2.f16491c;
                dVar.f16590b = visibility;
                dVar.f16592d = childAt.getAlpha();
                float rotation = childAt.getRotation();
                e eVar = aVar2.f16494f;
                eVar.f16596b = rotation;
                eVar.f16597c = childAt.getRotationX();
                eVar.f16598d = childAt.getRotationY();
                eVar.f16599e = childAt.getScaleX();
                eVar.f16600f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    eVar.f16601g = pivotX;
                    eVar.f16602h = pivotY;
                }
                eVar.j = childAt.getTranslationX();
                eVar.f16604k = childAt.getTranslationY();
                eVar.f16605l = childAt.getTranslationZ();
                if (eVar.f16606m) {
                    eVar.f16607n = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    boolean allowsGoneWidget = barrier.getAllowsGoneWidget();
                    C0170b c0170b = aVar2.f16493e;
                    c0170b.f16563o0 = allowsGoneWidget;
                    c0170b.f16553j0 = barrier.getReferencedIds();
                    c0170b.f16548g0 = barrier.getType();
                    c0170b.f16550h0 = barrier.getMargin();
                }
            }
            i11++;
            bVar = this;
            childCount = i10;
            map3 = map;
        }
    }

    public final a h(int i10) {
        HashMap<Integer, a> map = this.f16488g;
        if (!map.containsKey(Integer.valueOf(i10))) {
            map.put(Integer.valueOf(i10), new a());
        }
        return map.get(Integer.valueOf(i10));
    }

    public final a i(int i10) {
        HashMap<Integer, a> map = this.f16488g;
        if (map.containsKey(Integer.valueOf(i10))) {
            return map.get(Integer.valueOf(i10));
        }
        return null;
    }

    public final void j(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    a aVarG = g(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        aVarG.f16493e.f16535a = true;
                    }
                    this.f16488g.put(Integer.valueOf(aVarG.f16489a), aVarG);
                }
            }
        } catch (IOException e10) {
            Log.e("ConstraintSet", "Error parsing resource: " + i10, e10);
        } catch (XmlPullParserException e11) {
            Log.e("ConstraintSet", "Error parsing resource: " + i10, e11);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void k(Context context, XmlResourceParser xmlResourceParser) {
        try {
            int eventType = xmlResourceParser.getEventType();
            a aVarG = null;
            while (eventType != 1) {
                if (eventType == 0) {
                    xmlResourceParser.getName();
                } else if (eventType == 2) {
                    switch (xmlResourceParser.getName()) {
                        case "Constraint":
                            aVarG = g(context, Xml.asAttributeSet(xmlResourceParser), false);
                            break;
                        case "ConstraintOverride":
                            aVarG = g(context, Xml.asAttributeSet(xmlResourceParser), true);
                            break;
                        case "Guideline":
                            aVarG = g(context, Xml.asAttributeSet(xmlResourceParser), false);
                            C0170b c0170b = aVarG.f16493e;
                            c0170b.f16535a = true;
                            c0170b.f16537b = true;
                            break;
                        case "Barrier":
                            aVarG = g(context, Xml.asAttributeSet(xmlResourceParser), false);
                            aVarG.f16493e.f16552i0 = 1;
                            break;
                        case "PropertySet":
                            if (aVarG == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                            }
                            aVarG.f16491c.a(context, Xml.asAttributeSet(xmlResourceParser));
                            break;
                            break;
                        case "Transform":
                            if (aVarG == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                            }
                            aVarG.f16494f.b(context, Xml.asAttributeSet(xmlResourceParser));
                            break;
                            break;
                        case "Layout":
                            if (aVarG == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                            }
                            aVarG.f16493e.b(context, Xml.asAttributeSet(xmlResourceParser));
                            break;
                            break;
                        case "Motion":
                            if (aVarG == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                            }
                            aVarG.f16492d.b(context, Xml.asAttributeSet(xmlResourceParser));
                            break;
                            break;
                        case "CustomAttribute":
                        case "CustomMethod":
                            if (aVarG == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                            }
                            ConstraintAttribute.d(context, xmlResourceParser, aVarG.f16495g);
                            break;
                            break;
                    }
                } else if (eventType == 3) {
                    String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.ROOT);
                    switch (lowerCase.hashCode()) {
                        case -2075718416:
                            if (lowerCase.equals("guideline")) {
                            }
                            break;
                        case -190376483:
                            if (lowerCase.equals("constraint")) {
                            }
                            break;
                        case 426575017:
                            if (lowerCase.equals("constraintoverride")) {
                            }
                            break;
                        case 2146106725:
                            if (lowerCase.equals("constraintset")) {
                            }
                            break;
                    }
                    if (r6 == 0) {
                        return;
                    }
                    if (r6 == 1 || r6 == 2 || r6 == 3) {
                        this.f16488g.put(Integer.valueOf(aVarG.f16489a), aVarG);
                        aVarG = null;
                    }
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e10) {
            Log.e("ConstraintSet", "Error parsing XML resource", e10);
        } catch (XmlPullParserException e11) {
            Log.e("ConstraintSet", "Error parsing XML resource", e11);
        }
    }
}
