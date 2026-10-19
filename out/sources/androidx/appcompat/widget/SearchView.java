package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import com.voltasit.obdeleven.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class SearchView extends H implements p138l.b {

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final m f8778z0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final Rect f8779A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Rect f8780B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int[] f8781C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int[] f8782D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final ImageView f8783E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final Drawable f8784F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final int f8785G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final int f8786H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final Intent f8787I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final Intent f8788J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final CharSequence f8789K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public k f8790L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public j f8791M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public View.OnFocusChangeListener f8792N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public View.OnClickListener f8793O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public boolean f8794P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f8795Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public I0.a f8796R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public boolean f8797S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public CharSequence f8798T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public boolean f8799U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f8800V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public int f8801W;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f8802p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final SearchAutoComplete f8803q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public String f8804q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final View f8805r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public CharSequence f8806r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final View f8807s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f8808s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final View f8809t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f8810t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ImageView f8811u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public SearchableInfo f8812u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ImageView f8813v;
    public Bundle v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ImageView f8814w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final b f8815w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ImageView f8816x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final c f8817x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final View f8818y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final WeakHashMap<String, Drawable.ConstantState> f8819y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public o f8820z;

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            SearchView.this.v();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            I0.a aVar = SearchView.this.f8796R;
            if (aVar instanceof W) {
                aVar.c(null);
            }
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            SearchView searchView = SearchView.this;
            ImageView imageView = searchView.f8811u;
            SearchAutoComplete searchAutoComplete = searchView.f8803q;
            if (view == imageView) {
                searchView.z(false);
                searchAutoComplete.requestFocus();
                searchAutoComplete.setImeVisibility(true);
                View.OnClickListener onClickListener = searchView.f8793O;
                if (onClickListener != null) {
                    onClickListener.onClick(searchView);
                    return;
                }
                return;
            }
            if (view == searchView.f8814w) {
                searchView.o();
                return;
            }
            if (view == searchView.f8813v) {
                searchView.s();
                return;
            }
            if (view != searchView.f8816x) {
                if (view == searchAutoComplete) {
                    searchView.n();
                    return;
                }
                return;
            }
            SearchableInfo searchableInfo = searchView.f8812u0;
            if (searchableInfo == null) {
                return;
            }
            try {
                if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                        searchView.getContext().startActivity(searchView.m(searchView.f8788J, searchableInfo));
                    }
                } else {
                    Intent intent = new Intent(searchView.f8787I);
                    ComponentName searchActivity = searchableInfo.getSearchActivity();
                    intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                    searchView.getContext().startActivity(intent);
                }
            } catch (ActivityNotFoundException unused) {
            }
        }
    }

    public class e implements View.OnKeyListener {
        public e() {
        }

        @Override // android.view.View.OnKeyListener
        public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f8812u0 == null) {
                return false;
            }
            SearchAutoComplete searchAutoComplete = searchView.f8803q;
            if (!searchAutoComplete.isPopupShowing() || searchAutoComplete.getListSelection() == -1) {
                if (TextUtils.getTrimmedLength(searchAutoComplete.getText()) == 0 || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i10 != 66) {
                    return false;
                }
                view.cancelLongPress();
                searchView.getContext().startActivity(searchView.l("android.intent.action.SEARCH", null, null, searchAutoComplete.getText().toString()));
                return true;
            }
            if (searchView.f8812u0 == null || searchView.f8796R == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
                return false;
            }
            if (i10 == 66 || i10 == 84 || i10 == 61) {
                searchView.p(searchAutoComplete.getListSelection());
            } else {
                if (i10 != 21 && i10 != 22) {
                    if (i10 != 19) {
                        return false;
                    }
                    searchAutoComplete.getListSelection();
                    return false;
                }
                searchAutoComplete.setSelection(i10 == 21 ? 0 : searchAutoComplete.length());
                searchAutoComplete.setListSelection(0);
                searchAutoComplete.clearListSelection();
                searchAutoComplete.a();
            }
            return true;
        }
    }

    public class f implements TextView.OnEditorActionListener {
        public f() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            SearchView.this.s();
            return true;
        }
    }

    public class g implements AdapterView.OnItemClickListener {
        public g() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j) {
            SearchView.this.p(i10);
        }
    }

    public static class i {
        public static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        public static void b(SearchAutoComplete searchAutoComplete, int i10) {
            searchAutoComplete.setInputMethodMode(i10);
        }
    }

    public interface j {
        void e();
    }

    public interface k {
        boolean b(String str);

        boolean c(String str);
    }

    public interface l {
    }

    public static class m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Method f8834a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Method f8835b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Method f8836c;

        public static void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }
    }

    public static class n extends K0.a {
        public static final Parcelable.Creator<n> CREATOR = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f8837d;

        public class a implements Parcelable.ClassLoaderCreator<n> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final n createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new n(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new n[i10];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new n(parcel, null);
            }
        }

        public n(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f8837d = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SearchView.SavedState{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" isIconified=");
            return C4.v.f(sb2, this.f8837d, "}");
        }

        @Override // K0.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Boolean.valueOf(this.f8837d));
        }
    }

    public static class o extends TouchDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f8838a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Rect f8839b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Rect f8840c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Rect f8841d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f8842e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f8843f;

        public o(View view, Rect rect, Rect rect2) {
            super(rect, view);
            int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f8842e = scaledTouchSlop;
            Rect rect3 = new Rect();
            this.f8839b = rect3;
            Rect rect4 = new Rect();
            this.f8841d = rect4;
            Rect rect5 = new Rect();
            this.f8840c = rect5;
            rect3.set(rect);
            rect4.set(rect);
            int i10 = -scaledTouchSlop;
            rect4.inset(i10, i10);
            rect5.set(rect2);
            this.f8838a = view;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x003e  */
        @Override // android.view.TouchDelegate
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z10;
            boolean z11;
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z12 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z11 = this.f8843f;
                    if (z11 && !this.f8841d.contains(x10, y10)) {
                        z12 = z11;
                        z10 = false;
                    }
                } else if (action != 3) {
                    z10 = true;
                    z12 = false;
                } else {
                    z11 = this.f8843f;
                    this.f8843f = false;
                }
                z12 = z11;
                z10 = true;
            } else if (this.f8839b.contains(x10, y10)) {
                this.f8843f = true;
                z10 = true;
            } else {
                z10 = true;
                z12 = false;
            }
            if (!z12) {
                return false;
            }
            Rect rect = this.f8840c;
            View view = this.f8838a;
            if (!z10 || rect.contains(x10, y10)) {
                motionEvent.setLocation(x10 - rect.left, y10 - rect.top);
            } else {
                motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
            }
            return view.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        m mVar = null;
        if (Build.VERSION.SDK_INT < 29) {
            m mVar2 = new m();
            mVar2.f8834a = null;
            mVar2.f8835b = null;
            mVar2.f8836c = null;
            m.a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                mVar2.f8834a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                mVar2.f8835b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                mVar2.f8836c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
            mVar = mVar2;
        }
        f8778z0 = mVar;
    }

    public SearchView(Context context) {
        super(context, null, R.attr.searchViewStyle);
        this.f8779A = new Rect();
        this.f8780B = new Rect();
        this.f8781C = new int[2];
        this.f8782D = new int[2];
        this.f8815w0 = new b();
        this.f8817x0 = new c();
        this.f8819y0 = new WeakHashMap<>();
        d dVar = new d();
        e eVar = new e();
        f fVar = new f();
        g gVar = new g();
        h hVar = new h();
        a aVar = new a();
        int[] iArr = p088h.a.f35709v;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, iArr, R.attr.searchViewStyle, 0);
        c0 c0Var = new c0(context, typedArrayObtainStyledAttributes);
        androidx.core.view.O.m(this, context, iArr, null, typedArrayObtainStyledAttributes, R.attr.searchViewStyle);
        LayoutInflater.from(context).inflate(typedArrayObtainStyledAttributes.getResourceId(19, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f8803q = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f8805r = findViewById(R.id.search_edit_frame);
        View viewFindViewById = findViewById(R.id.search_plate);
        this.f8807s = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.submit_area);
        this.f8809t = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f8811u = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f8813v = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f8814w = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f8816x = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.f8783E = imageView5;
        viewFindViewById.setBackground(c0Var.b(20));
        viewFindViewById2.setBackground(c0Var.b(25));
        imageView.setImageDrawable(c0Var.b(23));
        imageView2.setImageDrawable(c0Var.b(15));
        imageView3.setImageDrawable(c0Var.b(12));
        imageView4.setImageDrawable(c0Var.b(28));
        imageView5.setImageDrawable(c0Var.b(23));
        this.f8784F = c0Var.b(22);
        i0.a(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.f8785G = typedArrayObtainStyledAttributes.getResourceId(26, R.layout.abc_search_dropdown_item_icons_2line);
        this.f8786H = typedArrayObtainStyledAttributes.getResourceId(13, 0);
        imageView.setOnClickListener(dVar);
        imageView3.setOnClickListener(dVar);
        imageView2.setOnClickListener(dVar);
        imageView4.setOnClickListener(dVar);
        searchAutoComplete.setOnClickListener(dVar);
        searchAutoComplete.addTextChangedListener(aVar);
        searchAutoComplete.setOnEditorActionListener(fVar);
        searchAutoComplete.setOnItemClickListener(gVar);
        searchAutoComplete.setOnItemSelectedListener(hVar);
        searchAutoComplete.setOnKeyListener(eVar);
        searchAutoComplete.setOnFocusChangeListener(new U(this));
        setIconifiedByDefault(typedArrayObtainStyledAttributes.getBoolean(18, true));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.f8789K = typedArrayObtainStyledAttributes.getText(14);
        this.f8798T = typedArrayObtainStyledAttributes.getText(21);
        int i10 = typedArrayObtainStyledAttributes.getInt(6, -1);
        if (i10 != -1) {
            setImeOptions(i10);
        }
        int i11 = typedArrayObtainStyledAttributes.getInt(5, -1);
        if (i11 != -1) {
            setInputType(i11);
        }
        setFocusable(typedArrayObtainStyledAttributes.getBoolean(1, true));
        c0Var.g();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f8787I = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f8788J = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f8818y = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new V(this));
        }
        z(this.f8794P);
        w();
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.f8803q;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // p138l.b
    public final void c() {
        if (this.f8808s0) {
            return;
        }
        this.f8808s0 = true;
        SearchAutoComplete searchAutoComplete = this.f8803q;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.f8810t0 = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f8800V = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.f8803q;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.f8800V = false;
    }

    @Override // p138l.b
    public final void e() {
        t("");
        clearFocus();
        z(true);
        this.f8803q.setImeOptions(this.f8810t0);
        this.f8808s0 = false;
    }

    public int getImeOptions() {
        return this.f8803q.getImeOptions();
    }

    public int getInputType() {
        return this.f8803q.getInputType();
    }

    public int getMaxWidth() {
        return this.f8801W;
    }

    public CharSequence getQuery() {
        return this.f8803q.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f8798T;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f8812u0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f8789K : getContext().getText(this.f8812u0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f8786H;
    }

    public int getSuggestionRowLayout() {
        return this.f8785G;
    }

    public I0.a getSuggestionsAdapter() {
        return this.f8796R;
    }

    public final Intent l(String str, String str2, Uri uri, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f8806r0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.v0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f8812u0.getSearchActivity());
        return intent;
    }

    public final Intent m(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.v0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void n() {
        int i10 = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.f8803q;
        if (i10 >= 29) {
            i.a(searchAutoComplete);
            return;
        }
        m mVar = f8778z0;
        mVar.getClass();
        m.a();
        Method method = mVar.f8834a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, null);
            } catch (Exception unused) {
            }
        }
        mVar.getClass();
        m.a();
        Method method2 = mVar.f8835b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, null);
            } catch (Exception unused2) {
            }
        }
    }

    public final void o() {
        SearchAutoComplete searchAutoComplete = this.f8803q;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.f8794P) {
            j jVar = this.f8791M;
            if (jVar != null) {
                jVar.e();
            }
            clearFocus();
            z(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f8815w0);
        post(this.f8817x0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.H, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            int[] iArr = this.f8781C;
            SearchAutoComplete searchAutoComplete = this.f8803q;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.f8782D;
            getLocationInWindow(iArr2);
            int i14 = iArr[1] - iArr2[1];
            int i15 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i15;
            int height = searchAutoComplete.getHeight() + i14;
            Rect rect = this.f8779A;
            rect.set(i15, i14, width, height);
            int i16 = rect.left;
            int i17 = rect.right;
            int i18 = i13 - i11;
            Rect rect2 = this.f8780B;
            rect2.set(i16, 0, i17, i18);
            o oVar = this.f8820z;
            if (oVar == null) {
                o oVar2 = new o(searchAutoComplete, rect2, rect);
                this.f8820z = oVar2;
                setTouchDelegate(oVar2);
            } else {
                oVar.f8839b.set(rect2);
                Rect rect3 = oVar.f8841d;
                rect3.set(rect2);
                int i19 = -oVar.f8842e;
                rect3.inset(i19, i19);
                oVar.f8840c.set(rect);
            }
        }
    }

    @Override // androidx.appcompat.widget.H, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        if (this.f8795Q) {
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == Integer.MIN_VALUE) {
            int i13 = this.f8801W;
            size = i13 > 0 ? Math.min(i13, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f8801W;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i12 = this.f8801W) > 0) {
            size = Math.min(i12, size);
        }
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof n)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        n nVar = (n) parcelable;
        super.onRestoreInstanceState(nVar.f4135b);
        z(nVar.f8837d);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        n nVar = new n(super.onSaveInstanceState());
        nVar.f8837d = this.f8795Q;
        return nVar;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        post(this.f8815w0);
    }

    public final void p(int i10) {
        String strI;
        Cursor cursor = this.f8796R.f3772d;
        if (cursor != null && cursor.moveToPosition(i10)) {
            Intent intentL = null;
            try {
                try {
                    int i11 = W.f8860y;
                    String strI2 = W.i(cursor, cursor.getColumnIndex("suggest_intent_action"));
                    if (strI2 == null) {
                        strI2 = this.f8812u0.getSuggestIntentAction();
                    }
                    if (strI2 == null) {
                        strI2 = "android.intent.action.SEARCH";
                    }
                    String strI3 = W.i(cursor, cursor.getColumnIndex("suggest_intent_data"));
                    if (strI3 == null) {
                        strI3 = this.f8812u0.getSuggestIntentData();
                    }
                    if (strI3 != null && (strI = W.i(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                        strI3 = strI3 + "/" + Uri.encode(strI);
                    }
                    intentL = l(strI2, W.i(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), strI3 == null ? null : Uri.parse(strI3), W.i(cursor, cursor.getColumnIndex("suggest_intent_query")));
                } catch (RuntimeException unused) {
                }
            } catch (RuntimeException unused2) {
                cursor.getPosition();
            }
            if (intentL != null) {
                try {
                    getContext().startActivity(intentL);
                } catch (RuntimeException e10) {
                    Log.e("SearchView", "Failed launch activity: " + intentL, e10);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.f8803q;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void q(int i10) {
        Editable text = this.f8803q.getText();
        Cursor cursor = this.f8796R.f3772d;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i10)) {
            setQuery(text);
            return;
        }
        String strD = this.f8796R.d(cursor);
        if (strD != null) {
            setQuery(strD);
        } else {
            setQuery(text);
        }
    }

    public final void r(CharSequence charSequence) {
        setQuery(charSequence);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i10, Rect rect) {
        if (this.f8800V || !isFocusable()) {
            return false;
        }
        if (this.f8795Q) {
            return super.requestFocus(i10, rect);
        }
        boolean zRequestFocus = this.f8803q.requestFocus(i10, rect);
        if (zRequestFocus) {
            z(false);
        }
        return zRequestFocus;
    }

    public final void s() {
        SearchAutoComplete searchAutoComplete = this.f8803q;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        k kVar = this.f8790L;
        if (kVar == null || !kVar.c(text.toString())) {
            if (this.f8812u0 != null) {
                getContext().startActivity(l("android.intent.action.SEARCH", null, null, text.toString()));
            }
            searchAutoComplete.setImeVisibility(false);
            searchAutoComplete.dismissDropDown();
        }
    }

    public void setAppSearchData(Bundle bundle) {
        this.v0 = bundle;
    }

    public void setIconified(boolean z10) {
        if (z10) {
            o();
            return;
        }
        z(false);
        SearchAutoComplete searchAutoComplete = this.f8803q;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f8793O;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z10) {
        if (this.f8794P == z10) {
            return;
        }
        this.f8794P = z10;
        z(z10);
        w();
    }

    public void setImeOptions(int i10) {
        this.f8803q.setImeOptions(i10);
    }

    public void setInputType(int i10) {
        this.f8803q.setInputType(i10);
    }

    public void setMaxWidth(int i10) {
        this.f8801W = i10;
        requestLayout();
    }

    public void setOnCloseListener(j jVar) {
        this.f8791M = jVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f8792N = onFocusChangeListener;
    }

    public void setOnQueryTextListener(k kVar) {
        this.f8790L = kVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f8793O = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f8798T = charSequence;
        w();
    }

    public void setQueryRefinementEnabled(boolean z10) {
        this.f8799U = z10;
        I0.a aVar = this.f8796R;
        if (aVar instanceof W) {
            ((W) aVar).f8866q = z10 ? 2 : 1;
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f8812u0 = searchableInfo;
        Intent intent = null;
        SearchAutoComplete searchAutoComplete = this.f8803q;
        if (searchableInfo != null) {
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.f8812u0.getImeOptions());
            int inputType = this.f8812u0.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.f8812u0.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            searchAutoComplete.setInputType(inputType);
            I0.a aVar = this.f8796R;
            if (aVar != null) {
                aVar.c(null);
            }
            if (this.f8812u0.getSuggestAuthority() != null) {
                W w3 = new W(getContext(), this, this.f8812u0, this.f8819y0);
                this.f8796R = w3;
                searchAutoComplete.setAdapter(w3);
                ((W) this.f8796R).f8866q = this.f8799U ? 2 : 1;
            }
            w();
        }
        SearchableInfo searchableInfo2 = this.f8812u0;
        boolean z10 = false;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.f8812u0.getVoiceSearchLaunchWebSearch()) {
                intent = this.f8787I;
            } else if (this.f8812u0.getVoiceSearchLaunchRecognizer()) {
                intent = this.f8788J;
            }
            if (intent != null) {
                z10 = getContext().getPackageManager().resolveActivity(intent, 65536) != null;
            }
        }
        this.f8802p0 = z10;
        if (z10) {
            searchAutoComplete.setPrivateImeOptions("nm");
        }
        z(this.f8795Q);
    }

    public void setSubmitButtonEnabled(boolean z10) {
        this.f8797S = z10;
        z(this.f8795Q);
    }

    public void setSuggestionsAdapter(I0.a aVar) {
        this.f8796R = aVar;
        this.f8803q.setAdapter(aVar);
    }

    public final void t(String str) {
        SearchAutoComplete searchAutoComplete = this.f8803q;
        searchAutoComplete.setText(str);
        if (str != null) {
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f8806r0 = str;
        }
    }

    public final void u() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f8803q.getText());
        int i10 = (!zIsEmpty || (this.f8794P && !this.f8808s0)) ? 0 : 8;
        ImageView imageView = this.f8814w;
        imageView.setVisibility(i10);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public final void v() {
        int[] iArr = this.f8803q.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f8807s.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f8809t.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void w() {
        Drawable drawable;
        CharSequence queryHint = getQueryHint();
        CharSequence charSequence = queryHint;
        if (queryHint == null) {
            charSequence = "";
        }
        boolean z10 = this.f8794P;
        SearchAutoComplete searchAutoComplete = this.f8803q;
        CharSequence charSequence2 = charSequence;
        if (z10 && (drawable = this.f8784F) != null) {
            charSequence2 = charSequence;
            int textSize = (int) (((double) searchAutoComplete.getTextSize()) * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(charSequence);
            charSequence2 = spannableStringBuilder;
        }
        charSequence2 = charSequence;
        searchAutoComplete.setHint(charSequence2);
    }

    public final void x() {
        this.f8809t.setVisibility(((this.f8797S || this.f8802p0) && !this.f8795Q && (this.f8813v.getVisibility() == 0 || this.f8816x.getVisibility() == 0)) ? 0 : 8);
    }

    public final void y(boolean z10) {
        boolean z11 = this.f8797S;
        this.f8813v.setVisibility((!z11 || !(z11 || this.f8802p0) || this.f8795Q || !hasFocus() || (!z10 && this.f8802p0)) ? 8 : 0);
    }

    public final void z(boolean z10) {
        this.f8795Q = z10;
        int i10 = 8;
        int i11 = z10 ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.f8803q.getText());
        this.f8811u.setVisibility(i11);
        y(!zIsEmpty);
        this.f8805r.setVisibility(z10 ? 8 : 0);
        ImageView imageView = this.f8783E;
        imageView.setVisibility((imageView.getDrawable() == null || this.f8794P) ? 8 : 0);
        u();
        if (this.f8802p0 && !this.f8795Q && zIsEmpty) {
            this.f8813v.setVisibility(8);
            i10 = 0;
        }
        this.f8816x.setVisibility(i10);
        x();
    }

    public static class SearchAutoComplete extends C0851d {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f8821f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public SearchView f8822g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f8823h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final a f8824i;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                SearchAutoComplete searchAutoComplete = SearchAutoComplete.this;
                if (searchAutoComplete.f8823h) {
                    ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
                    searchAutoComplete.f8823h = false;
                }
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet, 0);
            this.f8824i = new a();
            this.f8821f = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i10 = configuration.screenWidthDp;
            int i11 = configuration.screenHeightDp;
            if (i10 >= 960 && i11 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i10 < 600) {
                return (i10 < 640 || i11 < 480) ? 160 : 192;
            }
            return 192;
        }

        public final void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                i.b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            m mVar = SearchView.f8778z0;
            mVar.getClass();
            m.a();
            Method method = mVar.f8836c;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.f8821f <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.C0851d, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f8823h) {
                a aVar = this.f8824i;
                removeCallbacks(aVar);
                post(aVar);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z10, int i10, Rect rect) {
            super.onFocusChanged(z10, i10, rect);
            SearchView searchView = this.f8822g;
            searchView.z(searchView.f8795Q);
            searchView.post(searchView.f8815w0);
            if (searchView.f8803q.hasFocus()) {
                searchView.n();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
            if (i10 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f8822g.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i10, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z10) {
            super.onWindowFocusChanged(z10);
            if (z10 && this.f8822g.hasFocus() && getVisibility() == 0) {
                this.f8823h = true;
                Context context = getContext();
                m mVar = SearchView.f8778z0;
                if (context.getResources().getConfiguration().orientation == 2) {
                    a();
                }
            }
        }

        public void setImeVisibility(boolean z10) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            a aVar = this.f8824i;
            if (!z10) {
                this.f8823h = false;
                removeCallbacks(aVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f8823h = true;
                    return;
                }
                this.f8823h = false;
                removeCallbacks(aVar);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f8822g = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i10) {
            super.setThreshold(i10);
            this.f8821f = i10;
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }
    }

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            SearchView searchView = SearchView.this;
            Editable text = searchView.f8803q.getText();
            searchView.f8806r0 = text;
            boolean zIsEmpty = TextUtils.isEmpty(text);
            searchView.y(!zIsEmpty);
            int i13 = 8;
            if (searchView.f8802p0 && !searchView.f8795Q && zIsEmpty) {
                searchView.f8813v.setVisibility(8);
                i13 = 0;
            }
            searchView.f8816x.setVisibility(i13);
            searchView.u();
            searchView.x();
            if (searchView.f8790L != null && !TextUtils.equals(charSequence, searchView.f8804q0)) {
                searchView.f8790L.b(charSequence.toString());
            }
            searchView.f8804q0 = charSequence.toString();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    public class h implements AdapterView.OnItemSelectedListener {
        public h() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j) {
            SearchView.this.q(i10);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public void setOnSuggestionListener(l lVar) {
    }
}
