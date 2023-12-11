
def lines = 
"""

"""

def numbers = [  "one" : "1" ,"two" :"2" ,"three" : "3" ,"four" : "4" ,"five":"5", "six" : "6","seven" : "7" ,"eight" : "8" ,"nine" : "9" ]
def reversed_numbers = [ : ]
numbers.each { key, value -> reversed_numbers[key.reverse()] =value }


def sum = 0
lines.split('\n').each { it ->
  def replaced = it.replace(numbers) 
  def first = replaced.find {a -> a.isNumber()} 
  if (first) {  
      def last = it.reverse().replace(reversed_numbers).find{a-> a.isNumber()}
      sum = sum + ( first+last as Integer)
  }
}
print sum
