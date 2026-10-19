package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.widget.c0;
import com.voltasit.obdeleven.R;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements k.a, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h f8385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f8386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RadioButton f8387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f8388e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CheckBox f8389f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f8390g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ImageView f8391h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ImageView f8392i;
    public LinearLayout j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Drawable f8393k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f8394l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Context f8395m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f8396n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Drawable f8397o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f8398p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public LayoutInflater f8399q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f8400r;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c0 c0VarF = c0.f(getContext(), attributeSet, p088h.a.f35706s, R.attr.listMenuViewStyle, 0);
        this.f8393k = c0VarF.b(5);
        TypedArray typedArray = c0VarF.f8929b;
        this.f8394l = typedArray.getResourceId(1, -1);
        this.f8396n = typedArray.getBoolean(7, false);
        this.f8395m = context;
        this.f8397o = c0VarF.b(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f8398p = typedArrayObtainStyledAttributes.hasValue(0);
        c0VarF.g();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f8399q == null) {
            this.f8399q = LayoutInflater.from(getContext());
        }
        return this.f8399q;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        ImageView imageView = this.f8391h;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f8392i;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f8392i.getLayoutParams();
        rect.top = this.f8392i.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0037  */
    /* JADX WARN: Code duplicated, block: B:25:0x005a  */
    /* JADX WARN: Code duplicated, block: B:28:0x005e  */
    @Override // androidx.appcompat.view.menu.k.a
    public final void d(h hVar) {
        boolean z10;
        int i10;
        String string;
        boolean z11;
        this.f8385b = hVar;
        setVisibility(hVar.isVisible() ? 0 : 8);
        setTitle(hVar.f8491e);
        setCheckable(hVar.isCheckable());
        if (hVar.f8499n.o()) {
            if ((hVar.f8499n.n() ? hVar.j : hVar.f8494h) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        hVar.f8499n.n();
        if (z10) {
            h hVar2 = this.f8385b;
            if (hVar2.f8499n.o()) {
                if ((hVar2.f8499n.n() ? hVar2.j : hVar2.f8494h) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            } else {
                z11 = false;
            }
            i10 = z11 ? 0 : 8;
        }
        if (i10 == 0) {
            TextView textView = this.f8390g;
            h hVar3 = this.f8385b;
            char c10 = hVar3.f8499n.n() ? hVar3.j : hVar3.f8494h;
            if (c10 == 0) {
                string = "";
            } else {
                f fVar = hVar3.f8499n;
                Resources resources = fVar.f8458a.getResources();
                StringBuilder sb2 = new StringBuilder();
                if (ViewConfiguration.get(fVar.f8458a).hasPermanentMenuKey()) {
                    sb2.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i11 = fVar.n() ? hVar3.f8496k : hVar3.f8495i;
                h.c(i11, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label), sb2);
                h.c(i11, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label), sb2);
                h.c(i11, 2, resources.getString(R.string.abc_menu_alt_shortcut_label), sb2);
                h.c(i11, 1, resources.getString(R.string.abc_menu_shift_shortcut_label), sb2);
                h.c(i11, 4, resources.getString(R.string.abc_menu_sym_shortcut_label), sb2);
                h.c(i11, 8, resources.getString(R.string.abc_menu_function_shortcut_label), sb2);
                if (c10 == '\b') {
                    sb2.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                } else if (c10 == '\n') {
                    sb2.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                } else if (c10 != ' ') {
                    sb2.append(c10);
                } else {
                    sb2.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                }
                string = sb2.toString();
            }
            textView.setText(string);
        }
        if (this.f8390g.getVisibility() != i10) {
            this.f8390g.setVisibility(i10);
        }
        setIcon(hVar.getIcon());
        setEnabled(hVar.isEnabled());
        setSubMenuArrowVisible(hVar.hasSubMenu());
        setContentDescription(hVar.f8502q);
    }

    @Override // androidx.appcompat.view.menu.k.a
    public h getItemData() {
        return this.f8385b;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f8393k);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f8388e = textView;
        int i10 = this.f8394l;
        if (i10 != -1) {
            textView.setTextAppearance(this.f8395m, i10);
        }
        this.f8390g = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f8391h = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f8397o);
        }
        this.f8392i = (ImageView) findViewById(R.id.group_divider);
        this.j = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (this.f8386c != null && this.f8396n) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f8386c.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCheckable(boolean z10) {
        CompoundButton compoundButton;
        View view;
        if (!z10 && this.f8387d == null && this.f8389f == null) {
            return;
        }
        if ((this.f8385b.f8509x & 4) != 0) {
            if (this.f8387d == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f8387d = radioButton;
                LinearLayout linearLayout = this.j;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f8387d;
            view = this.f8389f;
        } else {
            if (this.f8389f == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f8389f = checkBox;
                LinearLayout linearLayout2 = this.j;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f8389f;
            view = this.f8387d;
        }
        if (z10) {
            compoundButton.setChecked(this.f8385b.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f8389f;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f8387d;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z10) {
        CompoundButton compoundButton;
        if ((this.f8385b.f8509x & 4) != 0) {
            if (this.f8387d == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f8387d = radioButton;
                LinearLayout linearLayout = this.j;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f8387d;
        } else {
            if (this.f8389f == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f8389f = checkBox;
                LinearLayout linearLayout2 = this.j;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f8389f;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.f8400r = z10;
        this.f8396n = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        ImageView imageView = this.f8392i;
        if (imageView != null) {
            imageView.setVisibility((this.f8398p || !z10) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f8385b.f8499n.getClass();
        boolean z10 = this.f8400r;
        if (z10 || this.f8396n) {
            ImageView imageView = this.f8386c;
            if (imageView == null && drawable == null && !this.f8396n) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f8386c = imageView2;
                LinearLayout linearLayout = this.j;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f8396n) {
                this.f8386c.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f8386c;
            if (!z10) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f8386c.getVisibility() != 0) {
                this.f8386c.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f8388e.getVisibility() != 8) {
                this.f8388e.setVisibility(8);
            }
        } else {
            this.f8388e.setText(charSequence);
            if (this.f8388e.getVisibility() != 0) {
                this.f8388e.setVisibility(0);
            }
        }
    }
}
