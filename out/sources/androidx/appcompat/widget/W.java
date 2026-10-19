package androidx.appcompat.widget;

import android.R;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: SuggestionsAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public final class W extends I0.c implements View.OnClickListener {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f8860y = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final SearchView f8861l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final SearchableInfo f8862m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Context f8863n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final WeakHashMap<String, Drawable.ConstantState> f8864o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f8865p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f8866q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ColorStateList f8867r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f8868s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f8869t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f8870u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f8871v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f8872w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f8873x;

    /* JADX INFO: compiled from: SuggestionsAdapter.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f8874a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f8875b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ImageView f8876c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ImageView f8877d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ImageView f8878e;

        public a(View view) {
            this.f8874a = (TextView) view.findViewById(R.id.text1);
            this.f8875b = (TextView) view.findViewById(R.id.text2);
            this.f8876c = (ImageView) view.findViewById(R.id.icon1);
            this.f8877d = (ImageView) view.findViewById(R.id.icon2);
            this.f8878e = (ImageView) view.findViewById(com.voltasit.obdeleven.R.id.edit_query);
        }
    }

    public W(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.f3771c = true;
        this.f3772d = null;
        this.f3770b = false;
        this.f3773e = -1;
        this.f3774f = new I0.a.C0047a(this);
        this.f3775g = new I0.a.b(this);
        this.j = suggestionRowLayout;
        this.f3780i = suggestionRowLayout;
        this.f3781k = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f8866q = 1;
        this.f8868s = -1;
        this.f8869t = -1;
        this.f8870u = -1;
        this.f8871v = -1;
        this.f8872w = -1;
        this.f8873x = -1;
        this.f8861l = searchView;
        this.f8862m = searchableInfo;
        this.f8865p = searchView.getSuggestionCommitIconResId();
        this.f8863n = context;
        this.f8864o = weakHashMap;
    }

    public static String i(Cursor cursor, int i10) {
        if (i10 == -1) {
            return null;
        }
        try {
            return cursor.getString(i10);
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e10);
            return null;
        }
    }

    @Override // I0.a
    public final void b(View view, Cursor cursor) {
        Drawable drawableG;
        CharSequence charSequenceI;
        a aVar = (a) view.getTag();
        int i10 = this.f8873x;
        int i11 = i10 != -1 ? cursor.getInt(i10) : 0;
        TextView textView = aVar.f8874a;
        if (textView != null) {
            String strI = i(cursor, this.f8868s);
            textView.setText(strI);
            if (TextUtils.isEmpty(strI)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
            }
        }
        Context context = this.f8863n;
        TextView textView2 = aVar.f8875b;
        if (textView2 != null) {
            String strI2 = i(cursor, this.f8870u);
            if (strI2 != null) {
                if (this.f8867r == null) {
                    TypedValue typedValue = new TypedValue();
                    context.getTheme().resolveAttribute(com.voltasit.obdeleven.R.attr.textColorSearchUrl, typedValue, true);
                    this.f8867r = context.getResources().getColorStateList(typedValue.resourceId);
                }
                SpannableString spannableString = new SpannableString(strI2);
                spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f8867r, null), 0, strI2.length(), 33);
                charSequenceI = spannableString;
            } else {
                charSequenceI = i(cursor, this.f8869t);
            }
            if (TextUtils.isEmpty(charSequenceI)) {
                if (textView != null) {
                    textView.setSingleLine(false);
                    textView.setMaxLines(2);
                }
            } else if (textView != null) {
                textView.setSingleLine(true);
                textView.setMaxLines(1);
            }
            textView2.setText(charSequenceI);
            if (TextUtils.isEmpty(charSequenceI)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
            }
        }
        ImageView imageView = aVar.f8876c;
        if (imageView != null) {
            int i12 = this.f8871v;
            if (i12 == -1) {
                drawableG = null;
            } else {
                drawableG = g(cursor.getString(i12));
                if (drawableG == null) {
                    ComponentName searchActivity = this.f8862m.getSearchActivity();
                    String strFlattenToShortString = searchActivity.flattenToShortString();
                    WeakHashMap<String, Drawable.ConstantState> weakHashMap = this.f8864o;
                    if (weakHashMap.containsKey(strFlattenToShortString)) {
                        Drawable.ConstantState constantState = weakHashMap.get(strFlattenToShortString);
                        drawableG = constantState == null ? null : constantState.newDrawable(context.getResources());
                    } else {
                        PackageManager packageManager = context.getPackageManager();
                        try {
                            ActivityInfo activityInfo = packageManager.getActivityInfo(searchActivity, 128);
                            int iconResource = activityInfo.getIconResource();
                            if (iconResource != 0) {
                                Drawable drawable = packageManager.getDrawable(searchActivity.getPackageName(), iconResource, activityInfo.applicationInfo);
                                if (drawable == null) {
                                    searchActivity.flattenToShortString();
                                    drawableG = null;
                                } else {
                                    drawableG = drawable;
                                }
                            } else {
                                drawableG = null;
                            }
                        } catch (PackageManager.NameNotFoundException e10) {
                            e10.toString();
                        }
                        weakHashMap.put(strFlattenToShortString, drawableG == null ? null : drawableG.getConstantState());
                    }
                    if (drawableG == null) {
                        drawableG = context.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            imageView.setImageDrawable(drawableG);
            if (drawableG == null) {
                imageView.setVisibility(4);
            } else {
                imageView.setVisibility(0);
                drawableG.setVisible(false, false);
                drawableG.setVisible(true, false);
            }
        }
        ImageView imageView2 = aVar.f8877d;
        if (imageView2 != null) {
            int i13 = this.f8872w;
            Drawable drawableG2 = i13 == -1 ? null : g(cursor.getString(i13));
            imageView2.setImageDrawable(drawableG2);
            if (drawableG2 == null) {
                imageView2.setVisibility(8);
            } else {
                imageView2.setVisibility(0);
                drawableG2.setVisible(false, false);
                drawableG2.setVisible(true, false);
            }
        }
        int i14 = this.f8866q;
        ImageView imageView3 = aVar.f8878e;
        if (i14 != 2 && (i14 != 1 || (i11 & 1) == 0)) {
            imageView3.setVisibility(8);
            return;
        }
        imageView3.setVisibility(0);
        imageView3.setTag(textView.getText());
        imageView3.setOnClickListener(this);
    }

    @Override // I0.a
    public final void c(Cursor cursor) {
        try {
            super.c(cursor);
            if (cursor != null) {
                this.f8868s = cursor.getColumnIndex("suggest_text_1");
                this.f8869t = cursor.getColumnIndex("suggest_text_2");
                this.f8870u = cursor.getColumnIndex("suggest_text_2_url");
                this.f8871v = cursor.getColumnIndex("suggest_icon_1");
                this.f8872w = cursor.getColumnIndex("suggest_icon_2");
                this.f8873x = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e10);
        }
    }

    @Override // I0.a
    public final String d(Cursor cursor) {
        String strI;
        String strI2;
        if (cursor == null) {
            return null;
        }
        String strI3 = i(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (strI3 != null) {
            return strI3;
        }
        SearchableInfo searchableInfo = this.f8862m;
        if (searchableInfo.shouldRewriteQueryFromData() && (strI2 = i(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return strI2;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (strI = i(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return strI;
    }

    @Override // I0.a
    public final View e(ViewGroup viewGroup) {
        View viewInflate = this.f3781k.inflate(this.f3780i, viewGroup, false);
        viewInflate.setTag(new a(viewInflate));
        ((ImageView) viewInflate.findViewById(com.voltasit.obdeleven.R.id.edit_query)).setImageResource(this.f8865p);
        return viewInflate;
    }

    public final Drawable f(Uri uri) throws FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException(B1.a.h(uri, "No authority: "));
        }
        try {
            Resources resourcesForApplication = this.f8863n.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException(B1.a.h(uri, "No path: "));
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException(B1.a.h(uri, "Single path segment is not a resource ID: "));
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException(B1.a.h(uri, "More than two path segments: "));
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            throw new FileNotFoundException(B1.a.h(uri, "No resource found for: "));
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException(B1.a.h(uri, "No package found for authority: "));
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00eb  */
    public final Drawable g(String str) {
        WeakHashMap<String, Drawable.ConstantState> weakHashMap = this.f8864o;
        Context context = this.f8863n;
        Drawable drawableF = null;
        if (str != null && !str.isEmpty() && !"0".equals(str)) {
            try {
                int i10 = Integer.parseInt(str);
                String str2 = "android.resource://" + context.getPackageName() + "/" + i10;
                Drawable.ConstantState constantState = weakHashMap.get(str2);
                Drawable drawableNewDrawable = constantState == null ? null : constantState.newDrawable();
                if (drawableNewDrawable != null) {
                    return drawableNewDrawable;
                }
                Drawable drawableB = p186p0.a.C0517a.b(context, i10);
                if (drawableB != null) {
                    weakHashMap.put(str2, drawableB.getConstantState());
                }
                return drawableB;
            } catch (Resources.NotFoundException unused) {
                return null;
            } catch (NumberFormatException unused2) {
                Drawable.ConstantState constantState2 = weakHashMap.get(str);
                Drawable drawableNewDrawable2 = constantState2 == null ? null : constantState2.newDrawable();
                if (drawableNewDrawable2 != null) {
                    return drawableNewDrawable2;
                }
                Uri uri = Uri.parse(str);
                try {
                    if ("android.resource".equals(uri.getScheme())) {
                        try {
                            drawableF = f(uri);
                        } catch (Resources.NotFoundException unused3) {
                            throw new FileNotFoundException("Resource does not exist: " + uri);
                        }
                    } else {
                        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                        if (inputStreamOpenInputStream == null) {
                            throw new FileNotFoundException("Failed to open " + uri);
                        }
                        try {
                            Drawable drawableCreateFromStream = Drawable.createFromStream(inputStreamOpenInputStream, null);
                            try {
                                inputStreamOpenInputStream.close();
                            } catch (IOException e10) {
                                Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e10);
                            }
                            drawableF = drawableCreateFromStream;
                        } catch (Throwable th) {
                            try {
                                inputStreamOpenInputStream.close();
                            } catch (IOException e11) {
                                Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e11);
                            }
                            throw th;
                        }
                    }
                } catch (FileNotFoundException e12) {
                    Objects.toString(uri);
                    e12.getMessage();
                    if (drawableF != null) {
                        weakHashMap.put(str, drawableF.getConstantState());
                    }
                    return drawableF;
                }
                if (drawableF != null) {
                    weakHashMap.put(str, drawableF.getConstantState());
                }
            }
        }
        return drawableF;
    }

    @Override // I0.a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            View viewInflate = this.f3781k.inflate(this.j, viewGroup, false);
            if (viewInflate != null) {
                ((a) viewInflate.getTag()).f8874a.setText(e10.toString());
            }
            return viewInflate;
        }
    }

    @Override // I0.a, android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            View viewE = e(viewGroup);
            ((a) viewE.getTag()).f8874a.setText(e10.toString());
            return viewE;
        }
    }

    public final Cursor h(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        builderFragment.appendQueryParameter("limit", String.valueOf(50));
        return this.f8863n.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.f3772d;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f3772d;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f8861l.r((CharSequence) tag);
        }
    }
}
