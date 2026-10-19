package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.voltasit.obdeleven.R;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class AlertController {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public NestedScrollView f8274A;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Drawable f8276C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public ImageView f8277D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public TextView f8278E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public TextView f8279F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public View f8280G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public ListAdapter f8281H;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final int f8283J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final int f8284K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final int f8285L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final int f8286M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final int f8287N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final boolean f8288O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final c f8289P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f8292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Window f8293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f8295e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f8296f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RecycleListView f8297g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View f8298h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f8299i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f8300k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f8301l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f8302m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Button f8304o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f8305p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Message f8306q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Drawable f8307r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Button f8308s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public CharSequence f8309t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Message f8310u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Drawable f8311v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Button f8312w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public CharSequence f8313x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Message f8314y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Drawable f8315z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f8303n = false;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f8275B = 0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f8282I = -1;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final a f8290Q = new a();

    public static class RecycleListView extends ListView {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f8316b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f8317c;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p088h.a.f35708u);
            this.f8317c = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
            this.f8316b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
        }
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Message messageObtain;
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            if (view == alertController.f8304o && (message3 = alertController.f8306q) != null) {
                messageObtain = Message.obtain(message3);
            } else if (view != alertController.f8308s || (message2 = alertController.f8310u) == null) {
                messageObtain = (view != alertController.f8312w || (message = alertController.f8314y) == null) ? null : Message.obtain(message);
            } else {
                messageObtain = Message.obtain(message2);
            }
            if (messageObtain != null) {
                messageObtain.sendToTarget();
            }
            alertController.f8289P.obtainMessage(1, alertController.f8292b).sendToTarget();
        }
    }

    public static class b {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public int f8319A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public int f8320B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public int f8321C;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public boolean[] f8323E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public boolean f8324F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public boolean f8325G;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public DialogInterface.OnMultiChoiceClickListener f8327I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public Cursor f8328J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        public String f8329K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public String f8330L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        public AdapterView.OnItemSelectedListener f8331M;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContextThemeWrapper f8332a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LayoutInflater f8333b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Drawable f8335d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public CharSequence f8336e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public View f8337f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public CharSequence f8338g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public CharSequence f8339h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Drawable f8340i;
        public DialogInterface.OnClickListener j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public CharSequence f8341k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Drawable f8342l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public DialogInterface.OnClickListener f8343m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public CharSequence f8344n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Drawable f8345o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public DialogInterface.OnClickListener f8346p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public DialogInterface.OnCancelListener f8348r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public DialogInterface.OnDismissListener f8349s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public DialogInterface.OnKeyListener f8350t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public CharSequence[] f8351u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public ListAdapter f8352v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public DialogInterface.OnClickListener f8353w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f8354x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public View f8355y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f8356z;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f8334c = 0;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public boolean f8322D = false;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public int f8326H = -1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public boolean f8347q = true;

        public b(ContextThemeWrapper contextThemeWrapper) {
            this.f8332a = contextThemeWrapper;
            this.f8333b = (LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater");
        }
    }

    public static final class c extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference<DialogInterface> f8357a;

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == -3 || i10 == -2 || i10 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f8357a.get(), message.what);
            } else {
                if (i10 != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    public static class d extends ArrayAdapter<CharSequence> {
        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, e eVar, Window window) {
        this.f8291a = context;
        this.f8292b = eVar;
        this.f8293c = window;
        c cVar = new c();
        cVar.f8357a = new WeakReference<>(eVar);
        this.f8289P = cVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, p088h.a.f35693e, R.attr.alertDialogStyle, 0);
        this.f8283J = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.f8284K = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f8285L = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f8286M = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.f8287N = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.f8288O = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.f8294d = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        eVar.d().v(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static ViewGroup b(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final void c(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Drawable drawable) {
        Message messageObtainMessage = onClickListener != null ? this.f8289P.obtainMessage(i10, onClickListener) : null;
        if (i10 == -3) {
            this.f8313x = charSequence;
            this.f8314y = messageObtainMessage;
            this.f8315z = drawable;
        } else if (i10 == -2) {
            this.f8309t = charSequence;
            this.f8310u = messageObtainMessage;
            this.f8311v = drawable;
        } else {
            if (i10 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f8305p = charSequence;
            this.f8306q = messageObtainMessage;
            this.f8307r = drawable;
        }
    }
}
