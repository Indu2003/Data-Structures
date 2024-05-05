slow =sumodDigits(num)
fast=sumodDigits(sumodDigits(num))
while(slow!=fats){
    slow=slow-1
    fast=fast -1
    if(fast==1)
    return True

return False
}