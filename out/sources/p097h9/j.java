package p097h9;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.fragment.app.ActivityC1347l;
import androidx.recyclerview.widget.RecyclerView;
import com.parse.ParseException;
import com.parse.ParseFile;
import com.voltasit.obdeleven.Application;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.oca.c;
import com.voltasit.obdeleven.ui.dialogs.C2134a0;
import java.util.ArrayList;
import p110i9.h;
import p220r9.y;
import p279w9.b;

/* JADX INFO: compiled from: ManualEditorAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends h<p255u9.j, a> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public y f36205g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f36206h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f36207i;
    public m j;

    /* JADX INFO: compiled from: ManualEditorAdapter.java */
    public class a extends RecyclerView.B {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public EditText f36208b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public EditText f36209c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ImageView f36210d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ImageView f36211e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ImageView f36212f;
    }

    @Override // p110i9.h
    public final void c(RecyclerView.B b10, final int i10) {
        a aVar = (a) b10;
        final p255u9.j jVar = (p255u9.j) this.f36795b.get(i10);
        EditText editText = aVar.f36208b;
        String string = jVar.getString("title");
        f fVar = new f(this, jVar);
        if (editText.getTag() != null) {
            editText.removeTextChangedListener((TextWatcher) editText.getTag());
        }
        if (string == null) {
            string = "";
        }
        editText.setText(string);
        editText.setTag(fVar);
        editText.addTextChangedListener(fVar);
        String string2 = jVar.getString("description");
        g gVar = new g(this, jVar);
        EditText editText2 = aVar.f36209c;
        if (editText2.getTag() != null) {
            editText2.removeTextChangedListener((TextWatcher) editText2.getTag());
        }
        editText2.setText(string2 != null ? string2 : "");
        editText2.setTag(gVar);
        editText2.addTextChangedListener(gVar);
        aVar.f36210d.setOnClickListener(new View.OnClickListener() { // from class: h9.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Exception {
                j jVar2 = this.f36193b;
                C2134a0.b(jVar2.f36794a, R.string.common_loading);
                String str = "step_cover" + i10;
                i iVar = new i(jVar2, jVar);
                y yVar = jVar2.f36205g;
                yVar.f46506c = str;
                yVar.f46507d = iVar;
                ActivityC1347l activityC1347l = yVar.f46504a;
                try {
                    yVar.f46505b.startActivityForResult(new Intent("android.intent.action.GET_CONTENT").setType("image/*"), 9162);
                } catch (ActivityNotFoundException unused) {
                    Toast.makeText(activityC1347l.getApplicationContext(), R.string.crop__pick_error, 0).show();
                }
            }
        });
        aVar.f36212f.setOnClickListener(new c(this, 1, jVar));
        ParseFile parseFile = jVar.getParseFile("picture");
        ImageView imageView = aVar.f36211e;
        if (parseFile == null) {
            imageView.setVisibility(8);
            return;
        }
        try {
            byte[] data = parseFile.getData();
            imageView.setImageBitmap(BitmapFactory.decodeByteArray(data, 0, data.length));
            imageView.setVisibility(0);
        } catch (ParseException e10) {
            b bVar = Application.f29634b;
            P8.c.b(e10);
            imageView.setVisibility(8);
        }
    }

    @Override // p110i9.h
    public final RecyclerView.B e(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.manual_editor_list_item, viewGroup, false);
        a aVar = new a(viewInflate);
        aVar.f36208b = (EditText) viewInflate.findViewById(R.id.manualEditorListItem_title);
        aVar.f36209c = (EditText) viewInflate.findViewById(R.id.manualEditorListItem_text);
        aVar.f36210d = (ImageView) viewInflate.findViewById(R.id.manualEditorListItem_uploadImage);
        aVar.f36211e = (ImageView) viewInflate.findViewById(R.id.manualEditorListItem_cover);
        aVar.f36212f = (ImageView) viewInflate.findViewById(R.id.manualEditorListItem_delete);
        return aVar;
    }
}
