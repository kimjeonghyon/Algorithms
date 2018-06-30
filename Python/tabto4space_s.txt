import os
filelists =[]
def search(dirname):
    try:
        filenames = os.listdir(dirname)
        for filename in filenames:
            full_filename = os.path.join(dirname, filename)
            if os.path.isdir(full_filename):
                search(full_filename)
            else:
                ext = os.path.splitext(full_filename)[-1]
                if ext == '.py': 
                    filelists.append(full_filename)
    except PermissionError:
        pass

search('.')
print(len(filelists))

for item in filelists:
    rfile = open(item, 'r', encoding='utf-8')
    rfileText = rfile.read()
    wfilename = item[:-3]+'_s.txt'
    print(wfilename)
    wfile = open(wfilename,'w',encoding='utf-8')

    wfile.write(rfileText.replace('\t','ssss'))

    rfile.close()
    wfile.close()
