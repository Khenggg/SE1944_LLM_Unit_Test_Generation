# Build note

`paper/main.tex` is the canonical IEEEtran source. `paper_final.pdf` was built locally with MiKTeX 25.12, `pdflatex`, and `bibtex` on 2026-07-16. The final source uses the IEEEtran conference class and includes the retained RBL-4 figures.

From `paper/`, reproduce the PDF with:

```powershell
& 'C:\Users\Ken\AppData\Local\Programs\MiKTeX\miktex\bin\x64\pdflatex.exe' -interaction=nonstopmode -halt-on-error -output-directory=build main.tex
& 'C:\Users\Ken\AppData\Local\Programs\MiKTeX\miktex\bin\x64\bibtex.exe' build\main
& 'C:\Users\Ken\AppData\Local\Programs\MiKTeX\miktex\bin\x64\pdflatex.exe' -interaction=nonstopmode -halt-on-error -output-directory=build main.tex
& 'C:\Users\Ken\AppData\Local\Programs\MiKTeX\miktex\bin\x64\pdflatex.exe' -interaction=nonstopmode -halt-on-error -output-directory=build main.tex
```

The compiled output is `paper/build/main.pdf`; the deliverable copy is `paper/output/paper_final.pdf`.

### 2026-07-17 Update

The paper was modified to rewrite several major portions, fix and include new data and add all missing citations. The updated `paper_final.pdf` was re-compiled using Tectonic (a modern automated TeX engine) locally:

```powershell
# Automatically handles multiple passes and BibTeX dependencies
.\tectonic.exe main.tex
```
The newly compiled output was then copied to `paper/output/paper_final.pdf`.
