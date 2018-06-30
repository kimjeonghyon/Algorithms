frequency = {}
file = open("test.txt",'r')
document_text = file.read()
text_string = document_text.lower()

lines = text_string.split("\n")

count=0
for line in lines:
    inx=0
    while inx>=0:
        inx = line.find("am",inx+1)
        print(line, inx)
        if(inx>= 0):
            count+=1

print("count:%i"%(count))
