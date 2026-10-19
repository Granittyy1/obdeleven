package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.H;
import androidx.core.view.O;
import androidx.core.view.Z;
import androidx.core.widget.NestedScrollView;
import java.util.WeakHashMap;
import p100i.m;

/* JADX INFO: compiled from: AlertDialog.java */
/* JADX INFO: loaded from: classes.dex */
public final class e extends m implements DialogInterface {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AlertController f8370g;

    /* JADX INFO: compiled from: AlertDialog.java */
    public static class a {

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        private final AlertController.b f8371P;
        private final int mTheme;

        public a(Context context) {
            this(context, e.g(context, 0));
        }

        public e create() {
            ListAdapter dVar;
            e eVar = new e(this.f8371P.f8332a, this.mTheme);
            AlertController.b bVar = this.f8371P;
            View view = bVar.f8337f;
            AlertController alertController = eVar.f8370g;
            if (view != null) {
                alertController.f8280G = view;
            } else {
                CharSequence charSequence = bVar.f8336e;
                if (charSequence != null) {
                    alertController.f8295e = charSequence;
                    TextView textView = alertController.f8278E;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                }
                Drawable drawable = bVar.f8335d;
                if (drawable != null) {
                    alertController.f8276C = drawable;
                    alertController.f8275B = 0;
                    ImageView imageView = alertController.f8277D;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                        alertController.f8277D.setImageDrawable(drawable);
                    }
                }
                int i10 = bVar.f8334c;
                if (i10 != 0) {
                    alertController.f8276C = null;
                    alertController.f8275B = i10;
                    ImageView imageView2 = alertController.f8277D;
                    if (imageView2 != null) {
                        if (i10 != 0) {
                            imageView2.setVisibility(0);
                            alertController.f8277D.setImageResource(alertController.f8275B);
                        } else {
                            imageView2.setVisibility(8);
                        }
                    }
                }
            }
            CharSequence charSequence2 = bVar.f8338g;
            if (charSequence2 != null) {
                alertController.f8296f = charSequence2;
                TextView textView2 = alertController.f8279F;
                if (textView2 != null) {
                    textView2.setText(charSequence2);
                }
            }
            CharSequence charSequence3 = bVar.f8339h;
            if (charSequence3 != null || bVar.f8340i != null) {
                alertController.c(-1, charSequence3, bVar.j, bVar.f8340i);
            }
            CharSequence charSequence4 = bVar.f8341k;
            if (charSequence4 != null || bVar.f8342l != null) {
                alertController.c(-2, charSequence4, bVar.f8343m, bVar.f8342l);
            }
            CharSequence charSequence5 = bVar.f8344n;
            if (charSequence5 != null || bVar.f8345o != null) {
                alertController.c(-3, charSequence5, bVar.f8346p, bVar.f8345o);
            }
            if (bVar.f8351u != null || bVar.f8328J != null || bVar.f8352v != null) {
                AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) bVar.f8333b.inflate(alertController.f8284K, (ViewGroup) null);
                boolean z10 = bVar.f8324F;
                ContextThemeWrapper contextThemeWrapper = bVar.f8332a;
                if (!z10) {
                    int i11 = bVar.f8325G ? alertController.f8286M : alertController.f8287N;
                    if (bVar.f8328J != null) {
                        dVar = new SimpleCursorAdapter(contextThemeWrapper, i11, bVar.f8328J, new String[]{bVar.f8329K}, new int[]{R.id.text1});
                    } else {
                        dVar = bVar.f8352v;
                        if (dVar == null) {
                            dVar = new AlertController.d(contextThemeWrapper, i11, R.id.text1, bVar.f8351u);
                        }
                    }
                } else if (bVar.f8328J == null) {
                    dVar = new androidx.appcompat.app.a(bVar, contextThemeWrapper, alertController.f8285L, bVar.f8351u, recycleListView);
                } else {
                    dVar = new b(bVar, contextThemeWrapper, bVar.f8328J, recycleListView, alertController);
                }
                alertController.f8281H = dVar;
                alertController.f8282I = bVar.f8326H;
                if (bVar.f8353w != null) {
                    recycleListView.setOnItemClickListener(new c(bVar, alertController));
                } else if (bVar.f8327I != null) {
                    recycleListView.setOnItemClickListener(new d(bVar, recycleListView, alertController));
                }
                AdapterView.OnItemSelectedListener onItemSelectedListener = bVar.f8331M;
                if (onItemSelectedListener != null) {
                    recycleListView.setOnItemSelectedListener(onItemSelectedListener);
                }
                if (bVar.f8325G) {
                    recycleListView.setChoiceMode(1);
                } else if (bVar.f8324F) {
                    recycleListView.setChoiceMode(2);
                }
                alertController.f8297g = recycleListView;
            }
            View view2 = bVar.f8355y;
            if (view2 == null) {
                int i12 = bVar.f8354x;
                if (i12 != 0) {
                    alertController.f8298h = null;
                    alertController.f8299i = i12;
                    alertController.f8303n = false;
                }
            } else if (bVar.f8322D) {
                int i13 = bVar.f8356z;
                int i14 = bVar.f8319A;
                int i15 = bVar.f8320B;
                int i16 = bVar.f8321C;
                alertController.f8298h = view2;
                alertController.f8299i = 0;
                alertController.f8303n = true;
                alertController.j = i13;
                alertController.f8300k = i14;
                alertController.f8301l = i15;
                alertController.f8302m = i16;
            } else {
                alertController.f8298h = view2;
                alertController.f8299i = 0;
                alertController.f8303n = false;
            }
            eVar.setCancelable(this.f8371P.f8347q);
            if (this.f8371P.f8347q) {
                eVar.setCanceledOnTouchOutside(true);
            }
            eVar.setOnCancelListener(this.f8371P.f8348r);
            eVar.setOnDismissListener(this.f8371P.f8349s);
            DialogInterface.OnKeyListener onKeyListener = this.f8371P.f8350t;
            if (onKeyListener != null) {
                eVar.setOnKeyListener(onKeyListener);
            }
            return eVar;
        }

        public Context getContext() {
            return this.f8371P.f8332a;
        }

        public a setAdapter(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f8371P;
            bVar.f8352v = listAdapter;
            bVar.f8353w = onClickListener;
            return this;
        }

        public a setCancelable(boolean z10) {
            this.f8371P.f8347q = z10;
            return this;
        }

        public a setCursor(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
            AlertController.b bVar = this.f8371P;
            bVar.f8328J = cursor;
            bVar.f8329K = str;
            bVar.f8353w = onClickListener;
            return this;
        }

        public a setCustomTitle(View view) {
            this.f8371P.f8337f = view;
            return this;
        }

        public a setIcon(int i10) {
            this.f8371P.f8334c = i10;
            return this;
        }

        public a setIconAttribute(int i10) {
            TypedValue typedValue = new TypedValue();
            this.f8371P.f8332a.getTheme().resolveAttribute(i10, typedValue, true);
            this.f8371P.f8334c = typedValue.resourceId;
            return this;
        }

        @Deprecated
        public a setInverseBackgroundForced(boolean z10) {
            this.f8371P.getClass();
            return this;
        }

        public a setItems(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f8371P;
            bVar.f8351u = bVar.f8332a.getResources().getTextArray(i10);
            this.f8371P.f8353w = onClickListener;
            return this;
        }

        public a setMessage(int i10) {
            AlertController.b bVar = this.f8371P;
            bVar.f8338g = bVar.f8332a.getText(i10);
            return this;
        }

        public a setMultiChoiceItems(int i10, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.b bVar = this.f8371P;
            bVar.f8351u = bVar.f8332a.getResources().getTextArray(i10);
            AlertController.b bVar2 = this.f8371P;
            bVar2.f8327I = onMultiChoiceClickListener;
            bVar2.f8323E = zArr;
            bVar2.f8324F = true;
            return this;
        }

        public a setNegativeButton(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f8371P;
            bVar.f8341k = bVar.f8332a.getText(i10);
            this.f8371P.f8343m = onClickListener;
            return this;
        }

        public a setNegativeButtonIcon(Drawable drawable) {
            this.f8371P.f8342l = drawable;
            return this;
        }

        public a setNeutralButton(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f8371P;
            bVar.f8344n = bVar.f8332a.getText(i10);
            this.f8371P.f8346p = onClickListener;
            return this;
        }

        public a setNeutralButtonIcon(Drawable drawable) {
            this.f8371P.f8345o = drawable;
            return this;
        }

        public a setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
            this.f8371P.f8348r = onCancelListener;
            return this;
        }

        public a setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
            this.f8371P.f8349s = onDismissListener;
            return this;
        }

        public a setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
            this.f8371P.f8331M = onItemSelectedListener;
            return this;
        }

        public a setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
            this.f8371P.f8350t = onKeyListener;
            return this;
        }

        public a setPositiveButton(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f8371P;
            bVar.f8339h = bVar.f8332a.getText(i10);
            this.f8371P.j = onClickListener;
            return this;
        }

        public a setPositiveButtonIcon(Drawable drawable) {
            this.f8371P.f8340i = drawable;
            return this;
        }

        public a setRecycleOnMeasureEnabled(boolean z10) {
            this.f8371P.getClass();
            return this;
        }

        public a setSingleChoiceItems(int i10, int i11, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f8371P;
            bVar.f8351u = bVar.f8332a.getResources().getTextArray(i10);
            AlertController.b bVar2 = this.f8371P;
            bVar2.f8353w = onClickListener;
            bVar2.f8326H = i11;
            bVar2.f8325G = true;
            return this;
        }

        public a setTitle(int i10) {
            AlertController.b bVar = this.f8371P;
            bVar.f8336e = bVar.f8332a.getText(i10);
            return this;
        }

        public a setView(int i10) {
            AlertController.b bVar = this.f8371P;
            bVar.f8355y = null;
            bVar.f8354x = i10;
            bVar.f8322D = false;
            return this;
        }

        public e show() {
            e eVarCreate = create();
            eVarCreate.show();
            return eVarCreate;
        }

        public a(Context context, int i10) {
            this.f8371P = new AlertController.b(new ContextThemeWrapper(context, e.g(context, i10)));
            this.mTheme = i10;
        }

        public a setIcon(Drawable drawable) {
            this.f8371P.f8335d = drawable;
            return this;
        }

        public a setMessage(CharSequence charSequence) {
            this.f8371P.f8338g = charSequence;
            return this;
        }

        public a setTitle(CharSequence charSequence) {
            this.f8371P.f8336e = charSequence;
            return this;
        }

        public a setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f8371P;
            bVar.f8351u = charSequenceArr;
            bVar.f8353w = onClickListener;
            return this;
        }

        public a setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f8371P;
            bVar.f8341k = charSequence;
            bVar.f8343m = onClickListener;
            return this;
        }

        public a setNeutralButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f8371P;
            bVar.f8344n = charSequence;
            bVar.f8346p = onClickListener;
            return this;
        }

        public a setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f8371P;
            bVar.f8339h = charSequence;
            bVar.j = onClickListener;
            return this;
        }

        public a setView(View view) {
            AlertController.b bVar = this.f8371P;
            bVar.f8355y = view;
            bVar.f8354x = 0;
            bVar.f8322D = false;
            return this;
        }

        public a setMultiChoiceItems(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.b bVar = this.f8371P;
            bVar.f8351u = charSequenceArr;
            bVar.f8327I = onMultiChoiceClickListener;
            bVar.f8323E = zArr;
            bVar.f8324F = true;
            return this;
        }

        public a setSingleChoiceItems(Cursor cursor, int i10, String str, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f8371P;
            bVar.f8328J = cursor;
            bVar.f8353w = onClickListener;
            bVar.f8326H = i10;
            bVar.f8329K = str;
            bVar.f8325G = true;
            return this;
        }

        @Deprecated
        public a setView(View view, int i10, int i11, int i12, int i13) {
            AlertController.b bVar = this.f8371P;
            bVar.f8355y = view;
            bVar.f8354x = 0;
            bVar.f8322D = true;
            bVar.f8356z = i10;
            bVar.f8319A = i11;
            bVar.f8320B = i12;
            bVar.f8321C = i13;
            return this;
        }

        public a setMultiChoiceItems(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.b bVar = this.f8371P;
            bVar.f8328J = cursor;
            bVar.f8327I = onMultiChoiceClickListener;
            bVar.f8330L = str;
            bVar.f8329K = str2;
            bVar.f8324F = true;
            return this;
        }

        public a setSingleChoiceItems(CharSequence[] charSequenceArr, int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f8371P;
            bVar.f8351u = charSequenceArr;
            bVar.f8353w = onClickListener;
            bVar.f8326H = i10;
            bVar.f8325G = true;
            return this;
        }

        public a setSingleChoiceItems(ListAdapter listAdapter, int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f8371P;
            bVar.f8352v = listAdapter;
            bVar.f8353w = onClickListener;
            bVar.f8326H = i10;
            bVar.f8325G = true;
            return this;
        }
    }

    public e(ContextThemeWrapper contextThemeWrapper, int i10) {
        super(contextThemeWrapper, g(contextThemeWrapper, i10));
        this.f8370g = new AlertController(getContext(), this, getWindow());
    }

    public static int g(Context context, int i10) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(com.voltasit.obdeleven.R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public final Button f(int i10) {
        AlertController alertController = this.f8370g;
        if (i10 == -3) {
            return alertController.f8312w;
        }
        if (i10 == -2) {
            return alertController.f8308s;
        }
        if (i10 == -1) {
            return alertController.f8304o;
        }
        alertController.getClass();
        return null;
    }

    @Override // p100i.m, androidx.activity.q, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i10;
        View view;
        int i11;
        int i12;
        ListAdapter listAdapter;
        View viewFindViewById;
        super.onCreate(bundle);
        AlertController alertController = this.f8370g;
        alertController.f8292b.setContentView(alertController.f8283J);
        Window window = alertController.f8293c;
        View viewFindViewById2 = window.findViewById(com.voltasit.obdeleven.R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(com.voltasit.obdeleven.R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(com.voltasit.obdeleven.R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(com.voltasit.obdeleven.R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(com.voltasit.obdeleven.R.id.customPanel);
        View viewInflate = alertController.f8298h;
        Context context = alertController.f8291a;
        if (viewInflate == null) {
            viewInflate = alertController.f8299i != 0 ? LayoutInflater.from(context).inflate(alertController.f8299i, viewGroup, false) : null;
        }
        boolean z10 = viewInflate != null;
        if (!z10 || !AlertController.a(viewInflate)) {
            window.setFlags(131072, 131072);
        }
        if (z10) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(com.voltasit.obdeleven.R.id.custom);
            frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
            if (alertController.f8303n) {
                frameLayout.setPadding(alertController.j, alertController.f8300k, alertController.f8301l, alertController.f8302m);
            }
            if (alertController.f8297g != null) {
                ((LinearLayout.LayoutParams) ((H.a) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View viewFindViewById6 = viewGroup.findViewById(com.voltasit.obdeleven.R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(com.voltasit.obdeleven.R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(com.voltasit.obdeleven.R.id.buttonPanel);
        ViewGroup viewGroupB = AlertController.b(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupB2 = AlertController.b(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupB3 = AlertController.b(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(com.voltasit.obdeleven.R.id.scrollView);
        alertController.f8274A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        alertController.f8274A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupB2.findViewById(R.id.message);
        alertController.f8279F = textView;
        if (textView != null) {
            CharSequence charSequence = alertController.f8296f;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                alertController.f8274A.removeView(alertController.f8279F);
                if (alertController.f8297g != null) {
                    ViewGroup viewGroup2 = (ViewGroup) alertController.f8274A.getParent();
                    int iIndexOfChild = viewGroup2.indexOfChild(alertController.f8274A);
                    viewGroup2.removeViewAt(iIndexOfChild);
                    viewGroup2.addView(alertController.f8297g, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroupB2.setVisibility(8);
                }
            }
        }
        Button button = (Button) viewGroupB3.findViewById(R.id.button1);
        alertController.f8304o = button;
        AlertController.a aVar = alertController.f8290Q;
        button.setOnClickListener(aVar);
        boolean zIsEmpty = TextUtils.isEmpty(alertController.f8305p);
        int i13 = alertController.f8294d;
        if (zIsEmpty && alertController.f8307r == null) {
            alertController.f8304o.setVisibility(8);
            i10 = 0;
        } else {
            alertController.f8304o.setText(alertController.f8305p);
            Drawable drawable = alertController.f8307r;
            if (drawable != null) {
                drawable.setBounds(0, 0, i13, i13);
                alertController.f8304o.setCompoundDrawables(alertController.f8307r, null, null, null);
            }
            alertController.f8304o.setVisibility(0);
            i10 = 1;
        }
        Button button2 = (Button) viewGroupB3.findViewById(R.id.button2);
        alertController.f8308s = button2;
        button2.setOnClickListener(aVar);
        if (TextUtils.isEmpty(alertController.f8309t) && alertController.f8311v == null) {
            alertController.f8308s.setVisibility(8);
        } else {
            alertController.f8308s.setText(alertController.f8309t);
            Drawable drawable2 = alertController.f8311v;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, i13, i13);
                alertController.f8308s.setCompoundDrawables(alertController.f8311v, null, null, null);
            }
            alertController.f8308s.setVisibility(0);
            i10 |= 2;
        }
        Button button3 = (Button) viewGroupB3.findViewById(R.id.button3);
        alertController.f8312w = button3;
        button3.setOnClickListener(aVar);
        if (TextUtils.isEmpty(alertController.f8313x) && alertController.f8315z == null) {
            alertController.f8312w.setVisibility(8);
            view = null;
        } else {
            alertController.f8312w.setText(alertController.f8313x);
            Drawable drawable3 = alertController.f8315z;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, i13, i13);
                view = null;
                alertController.f8312w.setCompoundDrawables(alertController.f8315z, null, null, null);
            } else {
                view = null;
            }
            alertController.f8312w.setVisibility(0);
            i10 |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(com.voltasit.obdeleven.R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data == 0) {
            i11 = 2;
        } else if (i10 == 1) {
            Button button4 = alertController.f8304o;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
            layoutParams.gravity = 1;
            layoutParams.weight = 0.5f;
            button4.setLayoutParams(layoutParams);
            i11 = 2;
        } else {
            i11 = 2;
            if (i10 == 2) {
                Button button5 = alertController.f8308s;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i10 == 4) {
                Button button6 = alertController.f8312w;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i10 == 0) {
            viewGroupB3.setVisibility(8);
        }
        if (alertController.f8280G != null) {
            viewGroupB.addView(alertController.f8280G, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(com.voltasit.obdeleven.R.id.title_template).setVisibility(8);
        } else {
            alertController.f8277D = (ImageView) window.findViewById(R.id.icon);
            if (TextUtils.isEmpty(alertController.f8295e) || !alertController.f8288O) {
                window.findViewById(com.voltasit.obdeleven.R.id.title_template).setVisibility(8);
                alertController.f8277D.setVisibility(8);
                viewGroupB.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(com.voltasit.obdeleven.R.id.alertTitle);
                alertController.f8278E = textView2;
                textView2.setText(alertController.f8295e);
                int i14 = alertController.f8275B;
                if (i14 != 0) {
                    alertController.f8277D.setImageResource(i14);
                } else {
                    Drawable drawable4 = alertController.f8276C;
                    if (drawable4 != null) {
                        alertController.f8277D.setImageDrawable(drawable4);
                    } else {
                        alertController.f8278E.setPadding(alertController.f8277D.getPaddingLeft(), alertController.f8277D.getPaddingTop(), alertController.f8277D.getPaddingRight(), alertController.f8277D.getPaddingBottom());
                        alertController.f8277D.setVisibility(8);
                    }
                }
            }
        }
        boolean z11 = viewGroup.getVisibility() != 8;
        int i15 = (viewGroupB == null || viewGroupB.getVisibility() == 8) ? 0 : 1;
        boolean z12 = viewGroupB3.getVisibility() != 8;
        if (!z12 && (viewFindViewById = viewGroupB2.findViewById(com.voltasit.obdeleven.R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i15 != 0) {
            NestedScrollView nestedScrollView2 = alertController.f8274A;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = (alertController.f8296f == null && alertController.f8297g == null) ? view : viewGroupB.findViewById(com.voltasit.obdeleven.R.id.titleDividerNoCustom);
            i12 = 0;
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            i12 = 0;
            View viewFindViewById10 = viewGroupB2.findViewById(com.voltasit.obdeleven.R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController.RecycleListView recycleListView = alertController.f8297g;
        if (recycleListView != null) {
            recycleListView.getClass();
            if (!z12 || i15 == 0) {
                recycleListView.setPadding(recycleListView.getPaddingLeft(), i15 != 0 ? recycleListView.getPaddingTop() : recycleListView.f8316b, recycleListView.getPaddingRight(), z12 ? recycleListView.getPaddingBottom() : recycleListView.f8317c);
            }
        }
        if (!z11) {
            View view2 = alertController.f8297g;
            if (view2 == null) {
                view2 = alertController.f8274A;
            }
            if (view2 != null) {
                int i16 = i15 | (z12 ? i11 : i12);
                View viewFindViewById11 = window.findViewById(com.voltasit.obdeleven.R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(com.voltasit.obdeleven.R.id.scrollIndicatorDown);
                WeakHashMap<View, Z> weakHashMap = O.f16859a;
                O.e.d(view2, i16, 3);
                if (viewFindViewById11 != null) {
                    viewGroupB2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupB2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController.RecycleListView recycleListView2 = alertController.f8297g;
        if (recycleListView2 == null || (listAdapter = alertController.f8281H) == null) {
            return;
        }
        recycleListView2.setAdapter(listAdapter);
        int i17 = alertController.f8282I;
        if (i17 > -1) {
            recycleListView2.setItemChecked(i17, true);
            recycleListView2.setSelection(i17);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f8370g.f8274A;
        if (nestedScrollView == null || !nestedScrollView.c(keyEvent)) {
            return super.onKeyDown(i10, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f8370g.f8274A;
        if (nestedScrollView == null || !nestedScrollView.c(keyEvent)) {
            return super.onKeyUp(i10, keyEvent);
        }
        return true;
    }

    @Override // p100i.m, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AlertController alertController = this.f8370g;
        alertController.f8295e = charSequence;
        TextView textView = alertController.f8278E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
